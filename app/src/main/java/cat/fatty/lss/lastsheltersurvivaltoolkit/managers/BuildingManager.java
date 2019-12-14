package cat.fatty.lss.lastsheltersurvivaltoolkit.managers;

import android.util.Log;

import java.util.ArrayList;

import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.Buildings;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.BuildingModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.BuildingTypeModel;


public class BuildingManager {

  private BuildingTypeModel buildingType;
  private ArrayList<BuildingModel> selectedBuildings;

  public BuildingManager(BuildingTypeModel buildingType) {
    this.buildingType = buildingType;
    setBuildings();
  }

  public ArrayList<BuildingModel> getBuildings() {
    return selectedBuildings;
  }

  private void setBuildings() {
    switch (buildingType.getType().toLowerCase()) {
      case "base" :
        setBuildingsBase();
        break;
      case "vehicle factory" :
        setBuildingsVehicleFactory();
        break;
      case "ration truck" :
        setBuildingsRationTruck();
        break;
      case "bank" :
        setBuildingsBank();
        break;
      case "garrison" :
        setBuildingsGarrison();
        break;
      case "wind turbine" :
        setBuildingsWindTurbine();
        break;
      case "lumber mill" :
        setBuildingsLumberMill();
        break;
      case "hospital" :
        setBuildingsHospital();
        break;
      default :
        // Something wrong happened
        Log.e("BuildingManager switch", "got to default case");
    }
  }

  private void setBuildingsBase()
  {
    Buildings.setBase();
    selectedBuildings = new ArrayList<>();

    selectedBuildings.add(Buildings.base2);
    selectedBuildings.add(Buildings.base3);
    selectedBuildings.add(Buildings.base4);
    selectedBuildings.add(Buildings.base5);
    selectedBuildings.add(Buildings.base6);
    selectedBuildings.add(Buildings.base7);
    selectedBuildings.add(Buildings.base8);
    selectedBuildings.add(Buildings.base9);
    selectedBuildings.add(Buildings.base10);
    selectedBuildings.add(Buildings.base11);
    selectedBuildings.add(Buildings.base12);
    selectedBuildings.add(Buildings.base13);
    selectedBuildings.add(Buildings.base14);
    selectedBuildings.add(Buildings.base15);
    selectedBuildings.add(Buildings.base16);
    selectedBuildings.add(Buildings.base17);
    selectedBuildings.add(Buildings.base18);
    selectedBuildings.add(Buildings.base19);
    selectedBuildings.add(Buildings.base20);
    selectedBuildings.add(Buildings.base21);
    selectedBuildings.add(Buildings.base22);
    selectedBuildings.add(Buildings.base23);
    selectedBuildings.add(Buildings.base24);
    selectedBuildings.add(Buildings.base25);
  }

  private void setBuildingsVehicleFactory()
  {
    Buildings.setVehicleFactory();
    selectedBuildings = new ArrayList<>();

    selectedBuildings.add(Buildings.vehicleFactory2);
    selectedBuildings.add(Buildings.vehicleFactory3);
    selectedBuildings.add(Buildings.vehicleFactory4);
    selectedBuildings.add(Buildings.vehicleFactory5);
    selectedBuildings.add(Buildings.vehicleFactory6);
    selectedBuildings.add(Buildings.vehicleFactory7);
    selectedBuildings.add(Buildings.vehicleFactory8);
    selectedBuildings.add(Buildings.vehicleFactory9);
    selectedBuildings.add(Buildings.vehicleFactory10);
    selectedBuildings.add(Buildings.vehicleFactory11);
    selectedBuildings.add(Buildings.vehicleFactory12);
    selectedBuildings.add(Buildings.vehicleFactory13);
    selectedBuildings.add(Buildings.vehicleFactory14);
    selectedBuildings.add(Buildings.vehicleFactory15);
    selectedBuildings.add(Buildings.vehicleFactory16);
    selectedBuildings.add(Buildings.vehicleFactory17);
    selectedBuildings.add(Buildings.vehicleFactory18);
    selectedBuildings.add(Buildings.vehicleFactory19);
    selectedBuildings.add(Buildings.vehicleFactory20);
    selectedBuildings.add(Buildings.vehicleFactory21);
    selectedBuildings.add(Buildings.vehicleFactory22);
    selectedBuildings.add(Buildings.vehicleFactory23);
    selectedBuildings.add(Buildings.vehicleFactory24);
    selectedBuildings.add(Buildings.vehicleFactory25);
  }

  private void setBuildingsRationTruck()
  {
    Buildings.setRationTruck();
    selectedBuildings = new ArrayList<>();

    selectedBuildings.add(Buildings.rationTruck1);
    selectedBuildings.add(Buildings.rationTruck2);
    selectedBuildings.add(Buildings.rationTruck3);
    selectedBuildings.add(Buildings.rationTruck4);
    selectedBuildings.add(Buildings.rationTruck5);
    selectedBuildings.add(Buildings.rationTruck6);
    selectedBuildings.add(Buildings.rationTruck7);
    selectedBuildings.add(Buildings.rationTruck8);
    selectedBuildings.add(Buildings.rationTruck9);
    selectedBuildings.add(Buildings.rationTruck10);
    selectedBuildings.add(Buildings.rationTruck11);
    selectedBuildings.add(Buildings.rationTruck12);
    selectedBuildings.add(Buildings.rationTruck13);
    selectedBuildings.add(Buildings.rationTruck14);
    selectedBuildings.add(Buildings.rationTruck15);
    selectedBuildings.add(Buildings.rationTruck16);
    selectedBuildings.add(Buildings.rationTruck17);
    selectedBuildings.add(Buildings.rationTruck18);
    selectedBuildings.add(Buildings.rationTruck19);
    selectedBuildings.add(Buildings.rationTruck20);
    selectedBuildings.add(Buildings.rationTruck21);
    selectedBuildings.add(Buildings.rationTruck22);
    selectedBuildings.add(Buildings.rationTruck23);
    selectedBuildings.add(Buildings.rationTruck24);
    selectedBuildings.add(Buildings.rationTruck25);
  }

  private void setBuildingsBank()
  {
    selectedBuildings = new ArrayList<>();

    selectedBuildings.add(Buildings.bank1);
    selectedBuildings.add(Buildings.bank2);
    selectedBuildings.add(Buildings.bank3);
    selectedBuildings.add(Buildings.bank4);
    selectedBuildings.add(Buildings.bank5);
    selectedBuildings.add(Buildings.bank6);
    selectedBuildings.add(Buildings.bank7);
    selectedBuildings.add(Buildings.bank8);
    selectedBuildings.add(Buildings.bank9);
    selectedBuildings.add(Buildings.bank10);
    selectedBuildings.add(Buildings.bank11);
    selectedBuildings.add(Buildings.bank12);
    selectedBuildings.add(Buildings.bank13);
    selectedBuildings.add(Buildings.bank14);
    selectedBuildings.add(Buildings.bank15);
    selectedBuildings.add(Buildings.bank16);
    selectedBuildings.add(Buildings.bank17);
    selectedBuildings.add(Buildings.bank18);
    selectedBuildings.add(Buildings.bank19);
    selectedBuildings.add(Buildings.bank20);
    selectedBuildings.add(Buildings.bank21);
    selectedBuildings.add(Buildings.bank22);
    selectedBuildings.add(Buildings.bank23);
    selectedBuildings.add(Buildings.bank24);
    selectedBuildings.add(Buildings.bank25);
  }

  private void setBuildingsGarrison()
  {
    selectedBuildings = new ArrayList<>();

    selectedBuildings.add(Buildings.garrison1);
    selectedBuildings.add(Buildings.garrison2);
    selectedBuildings.add(Buildings.garrison3);
    selectedBuildings.add(Buildings.garrison4);
    selectedBuildings.add(Buildings.garrison5);
    selectedBuildings.add(Buildings.garrison6);
    selectedBuildings.add(Buildings.garrison7);
    selectedBuildings.add(Buildings.garrison8);
    selectedBuildings.add(Buildings.garrison9);
    selectedBuildings.add(Buildings.garrison10);
    selectedBuildings.add(Buildings.garrison11);
    selectedBuildings.add(Buildings.garrison12);
    selectedBuildings.add(Buildings.garrison13);
    selectedBuildings.add(Buildings.garrison14);
    selectedBuildings.add(Buildings.garrison15);
    selectedBuildings.add(Buildings.garrison16);
    selectedBuildings.add(Buildings.garrison17);
    selectedBuildings.add(Buildings.garrison18);
    selectedBuildings.add(Buildings.garrison19);
    selectedBuildings.add(Buildings.garrison20);
    selectedBuildings.add(Buildings.garrison21);
    selectedBuildings.add(Buildings.garrison22);
    selectedBuildings.add(Buildings.garrison23);
    selectedBuildings.add(Buildings.garrison24);
    selectedBuildings.add(Buildings.garrison25);
  }

  private void setBuildingsWindTurbine()
  {
    selectedBuildings = new ArrayList<>();

    selectedBuildings.add(Buildings.windTurbine1);
    selectedBuildings.add(Buildings.windTurbine2);
    selectedBuildings.add(Buildings.windTurbine3);
    selectedBuildings.add(Buildings.windTurbine4);
    selectedBuildings.add(Buildings.windTurbine5);
    selectedBuildings.add(Buildings.windTurbine6);
    selectedBuildings.add(Buildings.windTurbine7);
    selectedBuildings.add(Buildings.windTurbine8);
    selectedBuildings.add(Buildings.windTurbine9);
    selectedBuildings.add(Buildings.windTurbine10);
    selectedBuildings.add(Buildings.windTurbine11);
    selectedBuildings.add(Buildings.windTurbine12);
    selectedBuildings.add(Buildings.windTurbine13);
    selectedBuildings.add(Buildings.windTurbine14);
    selectedBuildings.add(Buildings.windTurbine15);
    selectedBuildings.add(Buildings.windTurbine16);
    selectedBuildings.add(Buildings.windTurbine17);
    selectedBuildings.add(Buildings.windTurbine18);
    selectedBuildings.add(Buildings.windTurbine19);
    selectedBuildings.add(Buildings.windTurbine20);
    selectedBuildings.add(Buildings.windTurbine21);
    selectedBuildings.add(Buildings.windTurbine22);
    selectedBuildings.add(Buildings.windTurbine23);
    selectedBuildings.add(Buildings.windTurbine24);
    selectedBuildings.add(Buildings.windTurbine25);
  }

  private void setBuildingsLumberMill()
  {
    selectedBuildings = new ArrayList<>();

    selectedBuildings.add(Buildings.lumberMill1);
    selectedBuildings.add(Buildings.lumberMill2);
    selectedBuildings.add(Buildings.lumberMill3);
    selectedBuildings.add(Buildings.lumberMill4);
    selectedBuildings.add(Buildings.lumberMill5);
    selectedBuildings.add(Buildings.lumberMill6);
    selectedBuildings.add(Buildings.lumberMill7);
    selectedBuildings.add(Buildings.lumberMill8);
    selectedBuildings.add(Buildings.lumberMill9);
    selectedBuildings.add(Buildings.lumberMill10);
    selectedBuildings.add(Buildings.lumberMill11);
    selectedBuildings.add(Buildings.lumberMill12);
    selectedBuildings.add(Buildings.lumberMill13);
    selectedBuildings.add(Buildings.lumberMill14);
    selectedBuildings.add(Buildings.lumberMill15);
    selectedBuildings.add(Buildings.lumberMill16);
    selectedBuildings.add(Buildings.lumberMill17);
    selectedBuildings.add(Buildings.lumberMill18);
    selectedBuildings.add(Buildings.lumberMill19);
    selectedBuildings.add(Buildings.lumberMill20);
    selectedBuildings.add(Buildings.lumberMill21);
    selectedBuildings.add(Buildings.lumberMill22);
    selectedBuildings.add(Buildings.lumberMill23);
    selectedBuildings.add(Buildings.lumberMill24);
    selectedBuildings.add(Buildings.lumberMill25);
  }

  private void setBuildingsHospital()
  {
    selectedBuildings = new ArrayList<>();

    selectedBuildings.add(Buildings.hospital1);
    selectedBuildings.add(Buildings.hospital2);
    selectedBuildings.add(Buildings.hospital3);
    selectedBuildings.add(Buildings.hospital4);
    selectedBuildings.add(Buildings.hospital5);
    selectedBuildings.add(Buildings.hospital6);
    selectedBuildings.add(Buildings.hospital7);
    selectedBuildings.add(Buildings.hospital8);
    selectedBuildings.add(Buildings.hospital9);
    selectedBuildings.add(Buildings.hospital10);
    selectedBuildings.add(Buildings.hospital11);
    selectedBuildings.add(Buildings.hospital12);
    selectedBuildings.add(Buildings.hospital13);
    selectedBuildings.add(Buildings.hospital14);
    selectedBuildings.add(Buildings.hospital15);
    selectedBuildings.add(Buildings.hospital16);
    selectedBuildings.add(Buildings.hospital17);
    selectedBuildings.add(Buildings.hospital18);
    selectedBuildings.add(Buildings.hospital19);
    selectedBuildings.add(Buildings.hospital20);
    selectedBuildings.add(Buildings.hospital21);
    selectedBuildings.add(Buildings.hospital22);
    selectedBuildings.add(Buildings.hospital23);
    selectedBuildings.add(Buildings.hospital24);
    selectedBuildings.add(Buildings.hospital25);
  }
}
