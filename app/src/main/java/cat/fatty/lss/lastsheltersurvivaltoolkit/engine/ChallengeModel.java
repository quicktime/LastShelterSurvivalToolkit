package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import android.content.Context;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class ChallengeModel implements Serializable {

  private String name;
  private String image;
  private boolean difficult;
  private boolean doubleUp;
  private ArrayList<QuestModel> quests = new ArrayList<>();
  private int questNum;

  public ChallengeModel(String name, boolean difficult, boolean doubleUp, QuestModel... quests) {
    this.name = name;
    this.quests.addAll(Arrays.asList(quests));
    this.questNum = quests.length;
    this.difficult = difficult;
    this.doubleUp = doubleUp;
    setGraphics();
  }

  private void setGraphics() {
    if (this.difficult) {
      image = "challenge_difficult";
    } if (this.doubleUp && !this.difficult) {
      image = "challenge_doubleup";
    } if (!this.doubleUp && !this.difficult) {
      image = "challenge_normal";
    }
  }

  public int getImageResourceId(Context context)
  {
    try {
      return context.getResources().getIdentifier(image, "drawable", context.getPackageName());
    } catch (Exception e) {
      e.printStackTrace();
      return -1;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public int getQuestNum() {
    return questNum;
  }

  public QuestModel getQuest(int questNum) {
    return quests.get(questNum);
  }
}


