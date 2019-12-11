package cat.fatty.lss.lastsheltersurvivaltoolkit.models;

import android.graphics.drawable.Drawable;

public class ResourceModel {

  private String name;
  private int quantRequired;
  private Drawable drawable;

  public ResourceModel(String name, int quantRequired, Drawable drawable) {
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

  public Drawable getDrawable() {
    return drawable;
  }

  public void setQuantRequired(int quantRequired) {
    this.quantRequired = quantRequired;
  }
}
