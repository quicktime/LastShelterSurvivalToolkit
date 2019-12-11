package cat.fatty.lss.lastsheltersurvivaltoolkit.models;

import java.io.Serializable;

public class ResourceModel implements Serializable {

  private String name;
  private int quantRequired;
  private int drawable;

  public ResourceModel(String name, int quantRequired, int drawable) {
    this.name = name;
    this.quantRequired = quantRequired;
    this.drawable = drawable;
  }

  public String getName() {
    return name;
  }

  public int getQuantRequired() {
    return quantRequired;
  }

  public int getDrawable() {
    return drawable;
  }

  public void setQuantRequired(int quantRequired) {
    this.quantRequired = quantRequired;
  }
}
