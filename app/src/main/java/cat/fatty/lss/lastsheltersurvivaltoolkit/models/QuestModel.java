package cat.fatty.lss.lastsheltersurvivaltoolkit.models;

import java.io.Serializable;

public class QuestModel implements Serializable {

  private String description;
  private int reward;

  public QuestModel(String description, int reward) {
    this.description = description;
    this.reward = reward;
  }

  public String getDescription() {
    return description;
  }

  public int getReward() {
    return reward;
  }


}
