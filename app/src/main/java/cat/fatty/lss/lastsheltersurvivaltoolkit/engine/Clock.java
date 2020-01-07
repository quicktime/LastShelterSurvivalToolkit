package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Clock {

  private ZonedDateTime challengeGameTime;
  private ZonedDateTime challengeLocalTime;

  public Clock() {

  }

  public Clock(String day, int hour) {
    DayOfWeek dow;
    switch (day.toLowerCase()) {
      case "tuesday":
        dow = DayOfWeek.TUESDAY;
        break;
      case "wednesday":
        dow = DayOfWeek.WEDNESDAY;
        break;
      case "thursday":
        dow = DayOfWeek.THURSDAY;
        break;
      case "friday":
        dow = DayOfWeek.FRIDAY;
        break;
      case "saturday":
        dow = DayOfWeek.SATURDAY;
        break;
      case "sunday":
        dow = DayOfWeek.SUNDAY;
        break;
      default:
        dow = DayOfWeek.MONDAY;
        break;
    }
    LocalDate gameDate = LocalDate.now().with(dow);
    LocalDate challengeGameDate = LocalDate.of(gameDate.getYear(), gameDate.getMonth(), gameDate.getDayOfMonth());
    LocalTime challengeGameTime = LocalTime.of(hour, 0);
    ZoneId zoneGame = ZoneId.of("Atlantic/South_Georgia");
    this.challengeGameTime = ZonedDateTime.of(challengeGameDate, challengeGameTime, zoneGame);
  }

  public int getCurrentHour() {
    Calendar calendar = new GregorianCalendar();
    calendar.setTimeZone(TimeZone.getTimeZone("Atlantic/South_Georgia")); // game time zone

    return calendar.get(Calendar.HOUR_OF_DAY);
  }

  public void toLocalTime() {
    challengeLocalTime = challengeGameTime.withZoneSameInstant(ZoneId.systemDefault());
  }

  public DayOfWeek getChallengeLocalDayOfWeek() {
    return challengeLocalTime.getDayOfWeek();
  }

  public int getChallengeLocalTime() {
    return challengeLocalTime.getHour();
  }

  public int getCurrentDay() {
    ZoneId zoneGame = ZoneId.of("Atlantic/South_Georgia");
    LocalDate gameDate = LocalDate.now(zoneGame);
    return gameDate.getDayOfWeek().getValue() - 1;
  }

}