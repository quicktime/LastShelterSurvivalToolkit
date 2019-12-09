package cat.fatty.lss.lastsheltersurvivaltoolkit.models;

import java.io.Serializable;

public class BuildingTypeModel implements Serializable {

  private String type;

  public BuildingTypeModel (String type)
  {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
