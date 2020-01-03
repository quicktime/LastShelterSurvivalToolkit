package cat.fatty.lss.lastsheltersurvivaltoolkit.managers;

import java.util.ArrayList;

import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.BuildingTypes;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.BuildingTypeModel;

/**
 * Class is semi-useless, just keeping it uniform with flow of other activities. Could consolidate with BuildingTypes if needed
 */
public class BuildingTypeManager {

  public ArrayList<BuildingTypeModel> getBuildingTypes () {
    ArrayList<BuildingTypeModel> buildingTypes = new ArrayList<>();

    buildingTypes.add(BuildingTypes.base);
    buildingTypes.add(BuildingTypes.vehicleFactory);
    buildingTypes.add(BuildingTypes.rationTruck);
    buildingTypes.add(BuildingTypes.shootingRange);
    buildingTypes.add(BuildingTypes.fighterCamp);

    return buildingTypes;
  }
}
