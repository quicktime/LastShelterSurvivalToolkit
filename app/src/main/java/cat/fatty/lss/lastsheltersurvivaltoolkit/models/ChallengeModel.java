package cat.fatty.lss.lastsheltersurvivaltoolkit.models;

import android.content.Context;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class ChallengeModel implements Serializable {

  private String description;
  private String image;
  private boolean difficult;
  private boolean doubleUp;
  private ArrayList<QuestModel> quests = new ArrayList<>();
  private int questNum;
  private int color;
  private boolean alarmSet;
  private int requestCode; // don't need to initialize this. GSON will initialize

  public ChallengeModel(String description, boolean difficult, boolean doubleUp, QuestModel... quests) {
    this.description = description;
    this.quests.addAll(Arrays.asList(quests));
    this.questNum = quests.length;
    this.difficult = difficult;
    this.doubleUp = doubleUp;
    setGraphics();
  }

  public void setAlarm(boolean setAlarm) {
    this.alarmSet = setAlarm;
  }

  public boolean isAlarmSet() {
    return alarmSet;
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

  public void setColor(int color) {
    this.color = color;
  }

  public int getColor() {
    return this.color;
  }

  public int getImage(Context context)
  {
    setGraphics();
    try {
      return context.getResources().getIdentifier(image, "drawable", context.getPackageName());
    } catch (Exception e) {
      e.printStackTrace();
      return -1;
    }
  }

  public String getDescription() {
    return description;
  }

  public int getQuestNum() {
    return questNum;
  }

  public QuestModel getQuest(int questNum) {
    return quests.get(questNum);
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getRequestCode() {
    return requestCode;
  }
}