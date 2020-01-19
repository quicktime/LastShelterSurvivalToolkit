package cat.fatty.lss.lastsheltersurvivaltoolkit.activities.challenges;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.AlarmReceiver;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.Clock;
import cat.fatty.lss.lastsheltersurvivaltoolkit.managers.ChallengeManager;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.ChallengeModel;

/**
 * From ChallengeActivity
 */
public class AlarmActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
  
  private AlarmManager alarmManager;
  private Intent alarmIntent;
  private PendingIntent pendingIntent;
  private DayOfWeek localDayOfWeek;
  private int localHour;
  private NotificationManager mNotificationManager;
  private static final String PRIMARY_CHANNEL_ID = "primary_notification_channel";
  private ChallengeModel intentChallenge;
  
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_alarm);
    
    final String intentDay = getIntent().getStringExtra("day");
    int intentHour = getIntent().getIntExtra("hour", 0);
    
    final ChallengeManager challengeManager = new ChallengeManager(this, intentDay);
    ArrayList<ChallengeModel> challengeList = challengeManager.getManagedChallenges();
    intentChallenge = challengeList.get(intentHour);
    
    final int challengeRequestCode = intentChallenge.getRequestCode();
    
    Clock clock = new Clock(intentDay, intentHour);
    clock.toLocalTime();
    localDayOfWeek = clock.getChallengeLocalDayOfWeek();
    localHour = clock.getChallengeLocalTime();
    
    TextView textView = findViewById(R.id.alarmTimeText);
    String alarmTimeText = String.format(Locale.getDefault(), "%s %d:%d", localDayOfWeek.name(), localHour, 45);
    textView.setText(alarmTimeText);
    
    alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
    
    mNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    
    Button alarmStart = findViewById(R.id.alarmStart);
    Button alarmStop = findViewById(R.id.alarmStop);
    Switch ringAlarm = findViewById(R.id.ringAlarm);
    
    if (intentChallenge.isAlarmSet()) {
      alarmStart.setVisibility(View.INVISIBLE);
      alarmStop.setVisibility(View.VISIBLE);
      ringAlarm.setVisibility(View.INVISIBLE);
    } else {
      alarmStart.setVisibility(View.VISIBLE);
      alarmStop.setVisibility(View.INVISIBLE);
      ringAlarm.setVisibility(View.VISIBLE);
    }
    
    alarmIntent = new Intent(this, AlarmReceiver.class);
    ringAlarm.setOnCheckedChangeListener(this);
    if (ringAlarm.isChecked()) {
      alarmIntent.putExtra("ringAlarm", true);
    } else {
      alarmIntent.putExtra("ringAlarm", false);
    }
    
    if (intentChallenge.isAlarmSet()) {
      pendingIntent = PendingIntent.getBroadcast(AlarmActivity.this, challengeRequestCode, alarmIntent, PendingIntent.FLAG_CANCEL_CURRENT);
    }
    
    // Start button
    alarmStart.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        final Calendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.DAY_OF_WEEK, localDayOfWeek.getValue() + 1); // Have to add 1 day
        calendar.set(Calendar.HOUR_OF_DAY, localHour);
        calendar.set(Calendar.MINUTE, 44);
  
        // Calendar sets the DAY_OF_WEEK behind on certain days. Alarm should always be ahead of currentTime.
        if (calendar.getTimeInMillis() < System.currentTimeMillis()) {
          calendar.add(Calendar.WEEK_OF_MONTH, 1);
        }
  
        Log.d("AlarmActivity:onClick()", "Alarm set for time: " + calendar.getTime());
  
        pendingIntent = PendingIntent.getBroadcast(AlarmActivity.this, challengeRequestCode, alarmIntent, PendingIntent.FLAG_CANCEL_CURRENT);
        
        alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY * 7, pendingIntent);
        Toast.makeText(getApplicationContext(), "Alarm set!", Toast.LENGTH_LONG).show();
        intentChallenge.setAlarm(true);
        challengeManager.writeToJson(intentDay + "_challenges.json");
        Intent intent = new Intent(AlarmActivity.this, WeekActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
      }
    });
    
    // Stop button
    alarmStop.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        alarmManager.cancel(pendingIntent); // cancels the alarm
        pendingIntent.cancel();
        Toast.makeText(getApplicationContext(), "Alarm cancelled!", Toast.LENGTH_LONG).show();
        intentChallenge.setAlarm(false);
        challengeManager.writeToJson(intentDay + "_challenges.json");
        Intent intent = new Intent(AlarmActivity.this, WeekActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
      }
    });
    
    createNotificationChannel();
  }
  
  /**
   * Creates a Notification channel, for OREO and higher.
   */
  public void createNotificationChannel() {
    // Create a notification manager object.
    mNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
  
    // Notification channels are only available in OREO and higher.
    // So, add a check on SDK version.
    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
  
      // Create the NotificationChannel with all the parameters.
      NotificationChannel notificationChannel = new NotificationChannel(PRIMARY_CHANNEL_ID, "LSS Toolkit Notification",
        NotificationManager.IMPORTANCE_HIGH);
      
      notificationChannel.enableLights(true);
      notificationChannel.setLightColor(Color.RED);
      notificationChannel.enableVibration(true);
      notificationChannel.setDescription("Notifies user when it's time to use a CoZ ticket.");
      mNotificationManager.createNotificationChannel(notificationChannel);
    }
  }
  
  @Override
  public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
      alarmIntent.putExtra("ringAlarm", true);
    } else {
      alarmIntent.putExtra("ringAlarm", false);
    }
  }
}