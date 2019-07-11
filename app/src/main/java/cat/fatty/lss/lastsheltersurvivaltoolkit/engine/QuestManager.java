package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import java.util.ArrayList;

public class QuestManager {

  private ChallengeModel challenge;

  public QuestManager(ChallengeModel challenge) {
    this.challenge = challenge;
  }

  public ArrayList<QuestModel> getQuests() {

    ArrayList<QuestModel> quests = new ArrayList<>();

    int questNum = challenge.getQuestNum();
    for (int i = 0; i < questNum; i++) {
      quests.add(challenge.getQuest(i));
    }

    return quests;
  }
}
