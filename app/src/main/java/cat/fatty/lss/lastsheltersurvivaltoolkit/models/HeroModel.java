package cat.fatty.lss.lastsheltersurvivaltoolkit.models;

public class HeroModel {
  
  private int drawable;
  private String heroName;
  private String heroDescription;
  private SkillModel firstSkill;
  private SkillModel secondSkill;
  private SkillModel thirdSkill;
  private SkillModel fourthSkill;
  private SkillModel fifthSkill;
  private SkillModel sixthSkill;
  private SkillModel[] skillModels;
  
  public HeroModel(String heroName, int drawable, String heroDescription, SkillModel firstSkill, SkillModel secondSkill,
                   SkillModel thirdSkill, SkillModel fourthSkill, SkillModel fifthSkill, SkillModel sixthSkill) {
    this.heroName = heroName;
    this.drawable = drawable;
    this.heroDescription = heroDescription;
    this.firstSkill = firstSkill;
    this.secondSkill = secondSkill;
    this.thirdSkill = thirdSkill;
    this.fourthSkill = fourthSkill;
    this.fifthSkill = fifthSkill;
    this.sixthSkill = sixthSkill;
  }
  
  public HeroModel(String heroName, int drawable, String heroDescription, SkillModel... skillModels) {
    this.heroName = heroName;
    this.drawable = drawable;
    this.heroDescription = heroDescription;
    this.skillModels = skillModels;
  }
  
  public int getDrawable() {
    return drawable;
  }
  
  public SkillModel getFifthSkill() {
    return fifthSkill;
  }
  
  public SkillModel getFirstSkill() {
    return firstSkill;
  }
  
  public SkillModel getFourthSkill() {
    return fourthSkill;
  }
  
  public SkillModel getSecondSkill() {
    return secondSkill;
  }
  
  public SkillModel getSixthSkill() {
    return sixthSkill;
  }
  
  public SkillModel getThirdSkill() {
    return thirdSkill;
  }
  
  public String getHeroDescription() {
    return heroDescription;
  }
  
  public String getHeroName() {
    return heroName;
  }
}
