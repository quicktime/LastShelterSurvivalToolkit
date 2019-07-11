package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class ChallengeManager {

  private String day;
  private ArrayList<ChallengeModel> dailyChallenges;
  private ArrayList<ChallengeModel> challenges;

  public ChallengeManager(String day) {
    this.day = day;
    setChallenges();
  }

  public ArrayList<ChallengeModel> getChallenges () {
    if (challenges == null) {
      challenges = new ArrayList<>();
      challenges.addAll(dailyChallenges);
    }
      return challenges;
  }

  private void setChallenges() {
    switch (day.toLowerCase()) {
      case "monday" :
        setChallengesMonday();
        break;
      case "tuesday" :
        setChallengesTuesday();
        break;
      case "wednesday" :
        setChallengesWednesday();
        break;
      case "thursday" :
        setChallengesThursday();
        break;
      case "friday" :
        setChallengesFriday();
        break;
      case "saturday" :
        setChallengesSaturday();
        break;
      case "sunday" :
        setChallengesSunday();
        break;
    }
  }

  private void setChallengesMonday() {
    dailyChallenges = new ArrayList<>();

    dailyChallenges.add(Challenges.BUILD_BUILDSU_VIP);
    dailyChallenges.add(Challenges.BUILD_VIP);
    dailyChallenges.add(Challenges.TRAINSU_VIP);
    dailyChallenges.add(Challenges.TRAIN_BUILD_VIP);
    dailyChallenges.add(Challenges.TRAINSU_BUILDSU_TECHSU);
    dailyChallenges.add(Challenges.BUILD_TECH_TRAINSU_EC);
    dailyChallenges.add(Challenges.TRAIN_BUILD_TECH_VIP);
    dailyChallenges.add(Challenges.BUILD_VIP);
    dailyChallenges.add(Challenges.BUILD_BUILDSU_VIP);
    dailyChallenges.add(Challenges.BUILD_VIP);
    dailyChallenges.add(Challenges.TRAINSU_VIP);
    dailyChallenges.add(Challenges.TRAIN_BUILD_VIP);
    dailyChallenges.add(Challenges.TRAINSU_BUILDSU_TECHSU);
    dailyChallenges.add(Challenges.BUILD_TECH_TRAINSU_EC);
    dailyChallenges.add(Challenges.TRAIN_BUILD_TECH_VIP);
    dailyChallenges.add(Challenges.BUILD_VIP);
    dailyChallenges.add(Challenges.BUILD_BUILDSU_VIP);
    dailyChallenges.add(Challenges.BUILD_VIP);
    dailyChallenges.add(Challenges.TRAINSU_VIP);
    dailyChallenges.add(Challenges.TRAIN_BUILD_VIP);
    dailyChallenges.add(Challenges.TRAINSU_BUILDSU_TECHSU);
    dailyChallenges.add(Challenges.BUILD_TECH_TRAINSU_EC);
    dailyChallenges.add(Challenges.TRAIN_BUILD_TECH_VIP);
    dailyChallenges.add(Challenges.BUILD_VIP);
  }

  private void setChallengesTuesday() {

  }

  private void setChallengesWednesday() {

  }

  private void setChallengesThursday() {

  }

  private void setChallengesFriday() {

  }

  private void setChallengesSaturday() {

  }

  private void setChallengesSunday() {

  }
}