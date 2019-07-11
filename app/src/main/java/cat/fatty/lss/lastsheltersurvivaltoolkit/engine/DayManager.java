package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;

public class DayManager {

  private Context context;
  private static String[] DataModelKeyArray = {""};
  private DayManager mInstance;
  private ArrayList<DayModel> days;

  public DayManager(Context c) {
    this.context = c;
    DataModelKeyArray = c.getResources().getStringArray(R.array.day_keys);
  }

  public DayManager getInstance(Context c) {
    if (mInstance == null) {mInstance = new DayManager(c);}
    return mInstance;
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
