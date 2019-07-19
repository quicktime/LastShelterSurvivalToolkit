package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Clock {

  public int getCurrentHour() {
    Calendar calendar = Calendar.getInstance();

    int hour = calendar.get(Calendar.HOUR_OF_DAY) + 5; // this is to make hour consistent with game time
    if (hour > 23) {
      hour -= 24;
    }
    return hour;
  }

  public int getCurrentDay() {
    Calendar calendar = new GregorianCalendar();
    calendar.setTimeZone(TimeZone.getTimeZone("Atlantic/South_Georgia"));

    return calendar.get(Calendar.DAY_OF_WEEK) - 2; // subtract 2 because index of 0 and because game weeks start on monday, java week starts on sunday;
  }

}