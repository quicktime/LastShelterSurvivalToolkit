package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import java.util.Calendar;

public class Clock {

  public int getCurrentHour() {
    Calendar calendar = Calendar.getInstance();

    int hour = calendar.get(Calendar.HOUR_OF_DAY) + 5;
    if (hour > 23) {
      hour -= 24;
    }
    return hour;
  }



}