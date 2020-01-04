package cat.fatty.lss.lastsheltersurvivaltoolkit.models;

import java.io.Serializable;

public class BuildingTypeModel implements Serializable {

  private String type;
  private int drawable;

  public BuildingTypeModel (String type, int drawable)
  {
    this.type = type;
    this.drawable = drawable;
  }

  public String getType() {
    return type;
  }

  public int getDrawable() {
    return drawable;
  }
}
