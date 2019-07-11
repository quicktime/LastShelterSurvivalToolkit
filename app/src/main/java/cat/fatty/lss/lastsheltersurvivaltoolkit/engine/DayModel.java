package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import android.content.Context;

public class DayModel {

  public String name;
  public String imageName;

  public DayModel(String text, String image) {
    this.name = text;
    this.imageName = image;
  }

  public int getImageResourceId(Context context)
  {
    try {
      return context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());
    } catch (Exception e) {
      e.printStackTrace();
      return -1;
    }
  }

  public String getImageName() {
    return imageName;
  }

  public String getName() {
    return name;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public void setName(String name) {
    this.name = name;
  }
}