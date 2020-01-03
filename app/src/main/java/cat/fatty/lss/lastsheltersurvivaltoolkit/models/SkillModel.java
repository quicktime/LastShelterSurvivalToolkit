package cat.fatty.lss.lastsheltersurvivaltoolkit.models;

/**
 * This class models the hero skills
 */
public class SkillModel {
  
  private int drawable;
  private String skillName;
  private String skillDescription;
  
  public SkillModel(String skillName, int drawable, String skillDescription) {
    this.skillName = skillName;
    this.drawable = drawable;
    this.skillDescription = skillDescription;
  }
  
  public int getDrawable() {
    return drawable;
  }
  
  public String getSkillName() {
    return skillName;
  }
  
  public String getSkillDescription() {
    return skillDescription;
  }
}
