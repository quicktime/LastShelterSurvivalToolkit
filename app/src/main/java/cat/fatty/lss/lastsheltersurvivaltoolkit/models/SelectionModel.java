package cat.fatty.lss.lastsheltersurvivaltoolkit.models;

public class SelectionModel {

  private String text;
  private int drawable;
  private String color;
  private Class aClass;

  public SelectionModel(String text, int drawable, String color, Class aClass)
  {
    this.text = text;
    this.drawable = drawable;
    this.color = color;
    this.aClass = aClass;
  }

  public String getText() {
    return text;
  }

  public int getDrawable() {
    return drawable;
  }

  public String getColor() {
    return color;
  }

  public Class getAClass() {
    return aClass;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setDrawable(int drawable) {
    this.drawable = drawable;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setaClass(Class aClass) {
    this.aClass = aClass;
  }
}
