package cat.fatty.lss.lastsheltersurvivaltoolkit.activities.challenges;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.AlarmReceiver;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.Clock;

public class AlarmActivity extends AppCompatActivity {
  
  private AlarmManager alarmManager;
  private PendingIntent pendingIntent;
  private DayOfWeek localDayOfWeek;
  private int localHour;
  
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_alarm);

    final int requestCode = getIntent().getIntExtra("requestCode", 0);
    String intentDay = getIntent().getStringExtra("day");
    int intentHour = getIntent().getIntExtra("hour", 0);
    Clock clock = new Clock(intentDay, intentHour);
    clock.toLocalTime();
    localDayOfWeek = clock.getChallengeLocalDayOfWeek();
    localHour = clock.getChallengeLocalTime();

    TextView textView = findViewById(R.id.alarmTimeText);
    String alarmTimeText = String.format(Locale.getDefault(), "%s %d:%d", localDayOfWeek.name(), localHour, 45);
    textView.setText(alarmTimeText);

    alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
    final Intent intent = new Intent(this, AlarmReceiver.class);
    final Calendar calendar = new GregorianCalendar();

    // Start button
    Button alarmStart = findViewById(R.id.alarmStart);
    alarmStart.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        calendar.add(Calendar.SECOND, 1);
        calendar.set(Calendar.DAY_OF_WEEK, localDayOfWeek.getValue());
        calendar.set(Calendar.HOUR_OF_DAY, localHour);
        calendar.set(Calendar.MINUTE, 54);
        
        pendingIntent = PendingIntent.getBroadcast(AlarmActivity.this, requestCode, intent, PendingIntent.FLAG_CANCEL_CURRENT);

        // TODO: Make notification popup as well
        alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY * 7, pendingIntent);
        Toast.makeText(getApplicationContext(), "Alarm set!", Toast.LENGTH_LONG).show();
      }
    });
    
    // Stop button
    Button alarmStop = findViewById(R.id.alarmStop);
    alarmStop.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        alarmManager.cancel(pendingIntent); // cancels the alarm
        pendingIntent.cancel();
        Toast.makeText(getApplicationContext(), "Alarm cancelled!", Toast.LENGTH_LONG).show();
      }
    });
  }
}
