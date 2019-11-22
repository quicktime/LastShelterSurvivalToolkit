package cat.fatty.lss.lastsheltersurvivaltoolkit.managers;

import java.util.ArrayList;

public class BuildingTypeManager {

  public ArrayList<String> getBuildingTypes () {
    ArrayList<String> buildingTypes = new ArrayList<>();

    buildingTypes.add("base");
    buildingTypes.add("vehicle-factory");
    buildingTypes.add("shooting-range");
    buildingTypes.add("fighter-camp");
/*    buildingTypes.add("trap-house");
    buildingTypes.add("garrison");
    buildingTypes.add("ration-truck");
    buildingTypes.add("iron-warehouse");*/

    return buildingTypes;
  }


}
