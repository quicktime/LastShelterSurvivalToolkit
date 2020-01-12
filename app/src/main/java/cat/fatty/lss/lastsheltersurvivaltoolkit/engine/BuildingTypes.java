package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.BuildingTypeModel;

public class BuildingTypes {

  public static BuildingTypeModel base = new BuildingTypeModel("Base", R.drawable.base);
  public static BuildingTypeModel vehicleFactory = new BuildingTypeModel("Vehicle Factory", R.drawable.vf);
  public static BuildingTypeModel shootingRange = new BuildingTypeModel("Shooting Range", R.drawable.sr);
  public static BuildingTypeModel fighterCamp = new BuildingTypeModel("Fighter Camp", R.drawable.fc);
  public static BuildingTypeModel rationTruck = new BuildingTypeModel("Ration Truck", R.drawable.ration_truck);
  public static BuildingTypeModel institute = new BuildingTypeModel("Institute", R.drawable.institute);
  public static BuildingTypeModel embassy = new BuildingTypeModel("embassy", R.drawable.embassy);
}
