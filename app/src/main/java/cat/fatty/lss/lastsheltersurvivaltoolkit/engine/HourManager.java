package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;

public class HourManager {

  private Context context;
  private static String[] HourModelKeyArray = {""};
  private DayManager mInstance;
  private ArrayList<HourModel> hours;

  public HourManager(Context c) {
    this.context = c;
    HourModelKeyArray = c.getResources().getStringArray(R.array.hour_keys);
  }

  public DayManager getInstance(Context c) {
    if (mInstance == null) {mInstance = new DayManager(c);}
    return mInstance;
  }

  public ArrayList<HourModel> getHours(String day) {
    if (hours == null) {
      hours = new ArrayList<>();

      switch (day.toLowerCase()) {
        case "monday" :
          for (String hour : HourModelKeyArray) {
            MondayModel model = new MondayModel(hour);
            String imageName = "newyork"; // TODO: create images for every hour (possibly colors?)
            HourModel HourModel = new HourModel(hour, model.getChallenge(), imageName);
            hours.add(HourModel);
          }
          break;
        case "tuesday" :
          for (String hour : HourModelKeyArray) {
            TuesdayModel model = new TuesdayModel(hour);
            String imageName = hour.toLowerCase();
            HourModel HourModel = new HourModel("monday", model.getChallenge(), imageName);
            hours.add(HourModel);
          }
          break;
        case "wednesday" :
          for (String hour : HourModelKeyArray) {
            WednesdayModel model = new WednesdayModel(hour);
            String imageName = hour.toLowerCase();
            HourModel HourModel = new HourModel("Monday", model.getChallenge(), imageName);
            hours.add(HourModel);
          }
          break;
        case "thursday" :
          for (String hour : HourModelKeyArray) {
            ThursdayModel model = new ThursdayModel(hour);
            String imageName = hour.toLowerCase();
            HourModel HourModel = new HourModel("Monday", model.getChallenge(), imageName);
            hours.add(HourModel);
          }
          break;
        case "friday" :
          for (String hour : HourModelKeyArray) {
            FridayModel model = new FridayModel(hour);
            String imageName = hour.toLowerCase();
            HourModel HourModel = new HourModel("Monday", model.getChallenge(), imageName);
            hours.add(HourModel);
          }
          break;
        case "saturday" :
          for (String hour : HourModelKeyArray) {
            SaturdayModel model = new SaturdayModel(hour);
            String imageName = hour.toLowerCase();
            HourModel HourModel = new HourModel("Monday", model.getChallenge(), imageName);
            hours.add(HourModel);
          }
          break;
        case "sunday" :
          for (String hour : HourModelKeyArray) {
            SundayModel model = new SundayModel(hour);
            String imageName = hour.toLowerCase();
            HourModel HourModel = new HourModel("Monday", model.getChallenge(), imageName);
            hours.add(HourModel);
          }
          break;
        default :
          Log.i("HourManager", "Switch defaulted");
      }
    }
    return  hours;
  }
}
