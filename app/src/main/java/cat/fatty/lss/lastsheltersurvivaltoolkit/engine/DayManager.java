package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import android.content.Context;

import java.util.ArrayList;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;

public class DayManager {

  private Context context;
  private static String[] DataModelKeyArray = {""};
  private DayManager mInstance;
  private ArrayList<DayModel> days;

  public DayManager(Context c) {
    this.context = c;
    DataModelKeyArray = c.getResources().getStringArray(R.array.day_keys);
    setDayAttributes();
  }

  public DayManager getInstance(Context c) {
    if (mInstance == null) {mInstance = new DayManager(c);}
    return mInstance;
  }

  private void setDayAttributes() {
    Clock clock = new Clock();
    DayModel currentDay = getDays().get(clock.getCurrentDay());
    for (DayModel day : getDays()) {
      day.setColor(0xFFFFFFFF);
    }
    currentDay.setColor(0xFF00FFFF);
  }

  public ArrayList<DayModel> getDays() {
    if (days == null) {
      days = new ArrayList<>();
      for (String DataModelKey : DataModelKeyArray) {

        String name = DataModelKey.toLowerCase();
        String imageName = DataModelKey.toLowerCase();

        DayModel DayModel = new DayModel(name, imageName);
        days.add(DayModel);
      }
    }
    return days;
  }
}
