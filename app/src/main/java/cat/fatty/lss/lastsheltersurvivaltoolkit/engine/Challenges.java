package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

public class Challenges {
  
  public static ChallengeModel BUILD_BUILDSU_VIP = new ChallengeModel("Build / Build SU / VIP", true, false, Quests.build, Quests.buildSU, Quests.vip);
  public static ChallengeModel BUILD_VIP = new ChallengeModel("Build / VIP", false, false , Quests.build, Quests.vip);
  public static ChallengeModel TRAINSU_VIP = new ChallengeModel("Train SU / VIP", false, false, Quests.trainSU, Quests.vip);
  public static ChallengeModel TRAIN_BUILD_VIP = new ChallengeModel("Train / Build / VIP", false, false, Quests.train, Quests.build, Quests.vip);
  public static ChallengeModel TRAINSU_BUILDSU_TECHSU = new ChallengeModel("All 3 SUs", false, false, Quests.trainSU, Quests.buildSU, Quests.techSU);
  public static ChallengeModel BUILD_TECH_TRAINSU_EC = new ChallengeModel("Build / Tech / Train SU / EC", false, false, Quests.build, Quests.tech, Quests.trainSU, Quests.EC);
  public static ChallengeModel TRAIN_BUILD_TECH_VIP = new ChallengeModel("Train / Build / Tech / VIP", false, false, Quests.train, Quests.build, Quests.tech, Quests.vip);

  public static ChallengeModel ZOMBIES = new ChallengeModel("Zombies", false, false, Quests.trainSU, Quests.build, Quests.buildSU);
}
