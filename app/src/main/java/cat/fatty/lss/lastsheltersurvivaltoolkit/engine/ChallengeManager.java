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
    dailyChallenges = new ArrayList<>();

    dailyChallenges.add(Challenges.THURS_ONE);
    dailyChallenges.add(Challenges.THURS_TWO);
    dailyChallenges.add(Challenges.THURS_THREE);
    dailyChallenges.add(Challenges.THURS_FOUR);
    dailyChallenges.add(Challenges.THURS_FIVE);
    dailyChallenges.add(Challenges.THURS_SIX);
    dailyChallenges.add(Challenges.THURS_SEVEN);
    dailyChallenges.add(Challenges.THURS_EIGHT);
    dailyChallenges.add(Challenges.THURS_NINE);
    dailyChallenges.add(Challenges.THURS_TEN);
    dailyChallenges.add(Challenges.THURS_ELEVEN);
    dailyChallenges.add(Challenges.THURS_TWELVE);
    dailyChallenges.add(Challenges.THURS_THIRTEEN);
    dailyChallenges.add(Challenges.THURS_FOURTEEN);
    dailyChallenges.add(Challenges.THURS_FIFTEEN);
    dailyChallenges.add(Challenges.THURS_SIXTEEN);
    dailyChallenges.add(Challenges.THURS_SEVENTEEN);
    dailyChallenges.add(Challenges.THURS_EIGHTEEN);
    dailyChallenges.add(Challenges.THURS_NINETEEN);
    dailyChallenges.add(Challenges.THURS_TWENTY);
    dailyChallenges.add(Challenges.THURS_TWENTYONE);
    dailyChallenges.add(Challenges.THURS_TWENTYTWO);
    dailyChallenges.add(Challenges.THURS_TWENTYTHREE);
    dailyChallenges.add(Challenges.THURS_TWENTYFOUR);
  }

  private void setChallengesFriday() {

  }

  private void setChallengesSaturday() {

  }

  private void setChallengesSunday() {

  }
}