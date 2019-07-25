package cat.fatty.lss.lastsheltersurvivaltoolkit.models;

import java.io.Serializable;

public class QuestModel implements Serializable {

  private String name;
  private int reward;

  public QuestModel(String name, int reward) {
    this.name = name;
    this.reward = reward;
  }

  public String getName() {
    return name;
  }

  public int getReward() {
    return reward;
  }


}
