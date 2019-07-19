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

    dailyChallenges.add(Challenges.MON_ONE);
    dailyChallenges.add(Challenges.MON_TWO);
    dailyChallenges.add(Challenges.MON_THREE);
    dailyChallenges.add(Challenges.MON_FOUR);
    dailyChallenges.add(Challenges.MON_FIVE);
    dailyChallenges.add(Challenges.MON_SIX);
    dailyChallenges.add(Challenges.MON_SEVEN);
    dailyChallenges.add(Challenges.MON_EIGHT);
    dailyChallenges.add(Challenges.MON_NINE);
    dailyChallenges.add(Challenges.MON_TEN);
    dailyChallenges.add(Challenges.MON_ELEVEN);
    dailyChallenges.add(Challenges.MON_TWELVE);
    dailyChallenges.add(Challenges.MON_THIRTEEN);
    dailyChallenges.add(Challenges.MON_FOURTEEN);
    dailyChallenges.add(Challenges.MON_FIFTEEN);
    dailyChallenges.add(Challenges.MON_SIXTEEN);
    dailyChallenges.add(Challenges.MON_SEVENTEEN);
    dailyChallenges.add(Challenges.MON_EIGHTEEN);
    dailyChallenges.add(Challenges.MON_NINETEEN);
    dailyChallenges.add(Challenges.MON_TWENTY);
    dailyChallenges.add(Challenges.MON_TWENTYONE);
    dailyChallenges.add(Challenges.MON_TWENTYTWO);
    dailyChallenges.add(Challenges.MON_TWENTYTHREE);
    dailyChallenges.add(Challenges.MON_TWENTYFOUR);
  }

  private void setChallengesTuesday() {
    dailyChallenges = new ArrayList<>();

    dailyChallenges.add(Challenges.TUES_ONE);
    dailyChallenges.add(Challenges.TUES_TWO);
    dailyChallenges.add(Challenges.TUES_THREE);
    dailyChallenges.add(Challenges.TUES_FOUR);
    dailyChallenges.add(Challenges.TUES_FIVE);
    dailyChallenges.add(Challenges.TUES_SIX);
    dailyChallenges.add(Challenges.TUES_SEVEN);
    dailyChallenges.add(Challenges.TUES_EIGHT);
    dailyChallenges.add(Challenges.TUES_NINE);
    dailyChallenges.add(Challenges.TUES_TEN);
    dailyChallenges.add(Challenges.TUES_ELEVEN);
    dailyChallenges.add(Challenges.TUES_TWELVE);
    dailyChallenges.add(Challenges.TUES_THIRTEEN);
    dailyChallenges.add(Challenges.TUES_FOURTEEN);
    dailyChallenges.add(Challenges.TUES_FIFTEEN);
    dailyChallenges.add(Challenges.TUES_SIXTEEN);
    dailyChallenges.add(Challenges.TUES_SEVENTEEN);
    dailyChallenges.add(Challenges.TUES_EIGHTEEN);
    dailyChallenges.add(Challenges.TUES_NINETEEN);
    dailyChallenges.add(Challenges.TUES_TWENTY);
    dailyChallenges.add(Challenges.TUES_TWENTYONE);
    dailyChallenges.add(Challenges.TUES_TWENTYTWO);
    dailyChallenges.add(Challenges.TUES_TWENTYTHREE);
    dailyChallenges.add(Challenges.TUES_TWENTYFOUR);
  }

  private void setChallengesWednesday() {
    dailyChallenges = new ArrayList<>();

    dailyChallenges.add(Challenges.WED_ONE);
    dailyChallenges.add(Challenges.WED_TWO);
    dailyChallenges.add(Challenges.WED_THREE);
    dailyChallenges.add(Challenges.WED_FOUR);
    dailyChallenges.add(Challenges.WED_FIVE);
    dailyChallenges.add(Challenges.WED_SIX);
    dailyChallenges.add(Challenges.WED_SEVEN);
    dailyChallenges.add(Challenges.WED_EIGHT);
    dailyChallenges.add(Challenges.WED_NINE);
    dailyChallenges.add(Challenges.WED_TEN);
    dailyChallenges.add(Challenges.WED_ELEVEN);
    dailyChallenges.add(Challenges.WED_TWELVE);
    dailyChallenges.add(Challenges.WED_THIRTEEN);
    dailyChallenges.add(Challenges.WED_FOURTEEN);
    dailyChallenges.add(Challenges.WED_FIFTEEN);
    dailyChallenges.add(Challenges.WED_SIXTEEN);
    dailyChallenges.add(Challenges.WED_SEVENTEEN);
    dailyChallenges.add(Challenges.WED_EIGHTEEN);
    dailyChallenges.add(Challenges.WED_NINETEEN);
    dailyChallenges.add(Challenges.WED_TWENTY);
    dailyChallenges.add(Challenges.WED_TWENTYONE);
    dailyChallenges.add(Challenges.WED_TWENTYTWO);
    dailyChallenges.add(Challenges.WED_TWENTYTHREE);
    dailyChallenges.add(Challenges.WED_TWENTYFOUR);
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
    dailyChallenges = new ArrayList<>();

    dailyChallenges.add(Challenges.SAT_ONE);
    dailyChallenges.add(Challenges.SAT_TWO);
    dailyChallenges.add(Challenges.SAT_THREE);
    dailyChallenges.add(Challenges.SAT_FOUR);
    dailyChallenges.add(Challenges.SAT_FIVE);
    dailyChallenges.add(Challenges.SAT_SIX);
    dailyChallenges.add(Challenges.SAT_SEVEN);
    dailyChallenges.add(Challenges.SAT_EIGHT);
    dailyChallenges.add(Challenges.SAT_NINE);
    dailyChallenges.add(Challenges.SAT_TEN);
    dailyChallenges.add(Challenges.SAT_ELEVEN);
    dailyChallenges.add(Challenges.SAT_TWELVE);
    dailyChallenges.add(Challenges.SAT_THIRTEEN);
    dailyChallenges.add(Challenges.SAT_FOURTEEN);
    dailyChallenges.add(Challenges.SAT_FIFTEEN);
    dailyChallenges.add(Challenges.SAT_SIXTEEN);
    dailyChallenges.add(Challenges.SAT_SEVENTEEN);
    dailyChallenges.add(Challenges.SAT_EIGHTEEN);
    dailyChallenges.add(Challenges.SAT_NINETEEN);
    dailyChallenges.add(Challenges.SAT_TWENTY);
    dailyChallenges.add(Challenges.SAT_TWENTYONE);
    dailyChallenges.add(Challenges.SAT_TWENTYTWO);
    dailyChallenges.add(Challenges.SAT_TWENTYTHREE);
    dailyChallenges.add(Challenges.SAT_TWENTYFOUR);
  }

  private void setChallengesSunday() {

  }
}