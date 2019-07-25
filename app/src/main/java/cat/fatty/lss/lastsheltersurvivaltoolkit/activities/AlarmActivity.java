package cat.fatty.lss.lastsheltersurvivaltoolkit.activities;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.AlarmReceiver;

public class AlarmActivity extends AppCompatActivity {

  private AlarmManager  alarmManager;
  private TimePicker    timePicker;
  private AlarmReceiver alarmReceiver;
  private TextView      alarmTextView;
  private PendingIntent pendingIntent;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_alarm);

    alarmTextView = findViewById(R.id.alarmText);
    alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

    final Intent intent = new Intent(this, AlarmReceiver.class);
    final Calendar calendar = new GregorianCalendar();
    // if we need to use game time, uncomment this:
//    calendar.setTimeZone(TimeZone.getTimeZone("Atlantic/South_Georgia"));
    timePicker = findViewById(R.id.timePicker);
    timePicker.setIs24HourView(true);

    // Start button
    Button alarmStart = findViewById(R.id.alarmStart);
    alarmStart.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        calendar.add(Calendar.SECOND, 1);

        final int hour = timePicker.getHour();
        final int minute = timePicker.getMinute();

        calendar.set(Calendar.HOUR_OF_DAY, timePicker.getHour());
        calendar.set(Calendar.MINUTE, timePicker.getMinute());

        intent.putExtra("extra", "yes");
        pendingIntent = PendingIntent.getBroadcast(AlarmActivity.this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);

        String sMinute = String.format(Locale.US, "%02d", minute);
        String sHour = String.format(Locale.US, "%02d", hour);

        setAlarmText(String.format("Alarm set to %s:%s", sHour, sMinute));
      }
    });

    // Stop button
    Button alarmStop = findViewById(R.id.alarmStop);
    alarmStop.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        intent.putExtra("extra", "no");
        sendBroadcast(intent);

        alarmManager.cancel(pendingIntent); // cancels the alarm
        setAlarmText("Alarm stopped");
      }
    });
  }
  public void setAlarmText (String alarmText) {
    alarmTextView.setText(alarmText);
  }

  // TODO: Make alarm stuff. use getIntent().getIntExtra("hour") to get current hour from parent activity. Might need to translate hour based on TimeZone.
}
