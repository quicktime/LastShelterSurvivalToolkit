package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import java.util.ArrayList;

public class ChallengeManager {

  private String day;
  private ArrayList<ChallengeModel> dailyChallenges;
  private ArrayList<ChallengeModel> challenges;

  public ChallengeManager(String day) {
    this.day = day;
    setChallenges();
    setChallengeAttributes();
  }

  public ArrayList<ChallengeModel> getChallenges () {
    if (challenges == null) {
      challenges = new ArrayList<>();
      challenges.addAll(dailyChallenges);
    }
    return challenges;
  }

  private void setChallengeAttributes() {
    Clock clock = new Clock();
    ChallengeModel currentChallenge = dailyChallenges.get(clock.getCurrentHour());
    for (ChallengeModel challenge : dailyChallenges) {
      challenge.setColor(0xFFFFFFFF);
    }
    currentChallenge.setColor(0xFF00FFFF);
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
      case "FRIday" :
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
    dailyChallenges = new ArrayList<>();

    dailyChallenges.add(Challenges.FRI_ONE);
    dailyChallenges.add(Challenges.FRI_TWO);
    dailyChallenges.add(Challenges.FRI_THREE);
    dailyChallenges.add(Challenges.FRI_FOUR);
    dailyChallenges.add(Challenges.FRI_FIVE);
    dailyChallenges.add(Challenges.FRI_SIX);
    dailyChallenges.add(Challenges.FRI_SEVEN);
    dailyChallenges.add(Challenges.FRI_EIGHT);
    dailyChallenges.add(Challenges.FRI_NINE);
    dailyChallenges.add(Challenges.FRI_TEN);
    dailyChallenges.add(Challenges.FRI_ELEVEN);
    dailyChallenges.add(Challenges.FRI_TWELVE);
    dailyChallenges.add(Challenges.FRI_THIRTEEN);
    dailyChallenges.add(Challenges.FRI_FOURTEEN);
    dailyChallenges.add(Challenges.FRI_FIFTEEN);
    dailyChallenges.add(Challenges.FRI_SIXTEEN);
    dailyChallenges.add(Challenges.FRI_SEVENTEEN);
    dailyChallenges.add(Challenges.FRI_EIGHTEEN);
    dailyChallenges.add(Challenges.FRI_NINETEEN);
    dailyChallenges.add(Challenges.FRI_TWENTY);
    dailyChallenges.add(Challenges.FRI_TWENTYONE);
    dailyChallenges.add(Challenges.FRI_TWENTYTWO);
    dailyChallenges.add(Challenges.FRI_TWENTYTHREE);
    dailyChallenges.add(Challenges.FRI_TWENTYFOUR);
  }

  private void setChallengesSaturday() {

  }

  private void setChallengesSunday() {

  }
}