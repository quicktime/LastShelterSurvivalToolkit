package cat.fatty.lss.lastsheltersurvivaltoolkit.managers;

import android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;

import cat.fatty.lss.lastsheltersurvivaltoolkit.database.GsonFunctions;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.Clock;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.ChallengeModel;

public class ChallengeManager extends GsonFunctions {

  private static ArrayList<ChallengeModel> challenges = new ArrayList<>();
  private Context context;
  private String day;

  public ChallengeManager (Context context, String day) {
    this.context = context;
    this.day = day;
  }

//  private void getChallenges() {
//    challenges = new ArrayList<>();
//    ChallengeManager2 challengeManager2 = new ChallengeManager2(day);
//    challenges = challengeManager2.getChallenges();
//  }

  private void getChallenges() {
    challenges = new ArrayList<>();
    challenges.addAll(Arrays.asList(GsonFunctions.getChallengesFromJSON(context, day)));
  }

  private void setChallengeAttributes() {
    Clock clock = new Clock();
    ChallengeModel currentChallenge = challenges.get(clock.getCurrentHour());
    for (ChallengeModel challenge : challenges) {
      challenge.setColor(0xFFFFFFFF);
    }
    currentChallenge.setColor(0xFF00FFFF);
  }

  public ArrayList<ChallengeModel> getManagedChallenges() {
    getChallenges();
    setChallengeAttributes();
    return challenges;
  }

  public void printToJson () {
    printChallengesToJSON(challenges);
  }

  public void writeToJson(String filename) {
    writeChallengesToJSON(context, challenges, filename);
  }


}