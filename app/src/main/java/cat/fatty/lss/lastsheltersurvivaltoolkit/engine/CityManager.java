package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;

public class CityManager {
  public final static String NAME_PREFIX = "name_";
  public final static String DESC_PREFIX = "desc_";

  private Context context;
  private static String[] DataModelKeyArray = {""};
  private CityManager mInstance;
  private List<DayModel> cities;

  public CityManager(Context c) {
    this.context = c;
    DataModelKeyArray = c.getResources().getStringArray(R.array.city_keys);
  }

  public CityManager getInstance(Context c) {
    if (mInstance == null) {mInstance = new CityManager(c);}
    return mInstance;
  }

  public List<DayModel> getCites() {
    if (cities == null) {
      cities = new ArrayList<>();
      for (String DataModelKey : DataModelKeyArray) {

        Resources res = context.getResources();
        String packageName = context.getPackageName();
        int id = res.getIdentifier(NAME_PREFIX + DataModelKey, "string", packageName);
        String name = context.getString(id);
        String description = context.getString(context.getResources().getIdentifier(DESC_PREFIX + DataModelKey, "string", context.getPackageName()));
        String imageName = DataModelKey.toLowerCase();

        DayModel DayModel = new DayModel(name, imageName);
        cities.add(DayModel);
      }
    }
    return  cities;
  }
}
