package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

public class Challenges {
  
  public static ChallengeModel BUILD_BUILDSU_VIP = new ChallengeModel("Build / Build SU / VIP", true, false, Quests.build, Quests.buildSU, Quests.vip);
  public static ChallengeModel BUILD_VIP = new ChallengeModel("Build / VIP", false, false, Quests.build, Quests.vip);
  public static ChallengeModel TRAINSU_VIP = new ChallengeModel("Train SU / VIP", false, false, Quests.trainSU, Quests.vip);
  public static ChallengeModel TRAIN_BUILD_VIP = new ChallengeModel("Train / Build / VIP", false, false, Quests.train10, Quests.train9, Quests.train8, Quests.train7, Quests.train6, Quests.train5, Quests.train4, Quests.train3, Quests.train2, Quests.train1, Quests.build, Quests.vip);
  public static ChallengeModel TRAINSU_BUILDSU_TECHSU = new ChallengeModel("All 3 SUs", false, false, Quests.trainSU, Quests.buildSU, Quests.techSU);
  public static ChallengeModel BUILD_TECH_TRAINSU_EC = new ChallengeModel("Build / Tech / Train SU / EC", false, false, Quests.build, Quests.tech, Quests.trainSU, Quests.EC);
  public static ChallengeModel TRAIN_BUILD_TECH_VIP = new ChallengeModel("Train / Build / Tech / VIP", false, false, Quests.train10, Quests.train9, Quests.train8, Quests.train7, Quests.train6, Quests.train5, Quests.train4, Quests.train3, Quests.train2, Quests.train1, Quests.build, Quests.tech, Quests.vip);

  public static ChallengeModel ZOMBIESDAILY = new ChallengeModel("Zombies", false, false, Quests.superRecruit, Quests.advancedRecruit, Quests.normalRecruit, Quests.unlockSkill, Quests.zombie1Daily, Quests.zombie2Daily, Quests.zombie3Daily, Quests.zombie4Daily, Quests.zombie5Daily, Quests.zombie6Daily, Quests.zombie7Daily, Quests.zombie8Daily, Quests.zombie9Daily, Quests.zombie10Daily, Quests.zombie11Daily, Quests.zombie12Daily, Quests.zombie13Daily, Quests.zombie14Daily, Quests.zombie15Daily );
  public static ChallengeModel RECRUIT_ZOMBIES = new ChallengeModel("Recruit / Zombies", false, false, Quests.superRecruit, Quests.advancedRecruit, Quests.normalRecruit, Quests.unlockSkill, Quests.zombie15Hourly, Quests.zombie14Hourly, Quests.zombie13Hourly, Quests.zombie12Hourly, Quests.zombie11Hourly, Quests.zombie10Hourly, Quests.zombie9Hourly, Quests.zombie8Hourly, Quests.zombie7Hourly, Quests.zombie6Hourly, Quests.zombie5Hourly, Quests.zombie4Hourly, Quests.zombie3Hourly, Quests.zombie2Hourly, Quests.zombie1Hourly);
  public static ChallengeModel ALLHERODEV = new ChallengeModel("All Hero Development", false, false, Quests.exchangeWisdom, Quests.spendWisdom, Quests.gainXP, Quests.unlockSkill, Quests.normalRecruit, Quests.advancedRecruit, Quests.superRecruit);
  public static ChallengeModel WISDOM_ZOMBIES = new ChallengeModel("Wisdom / Zombies", false, false, Quests.unlockSkill, Quests.exchangeWisdom, Quests.spendWisdom, Quests.zombie15Hourly, Quests.zombie14Hourly, Quests.zombie13Hourly, Quests.zombie12Hourly, Quests.zombie11Hourly, Quests.zombie10Hourly, Quests.zombie9Hourly, Quests.zombie8Hourly, Quests.zombie7Hourly, Quests.zombie6Hourly, Quests.zombie5Hourly, Quests.zombie4Hourly, Quests.zombie3Hourly, Quests.zombie2Hourly, Quests.zombie1Hourly);

  public static ChallengeModel FRI_ONE = new ChallengeModel("Any Speed Up", false, false, Quests.anySU);
  public static ChallengeModel FRI_TWO = new ChallengeModel("All 3 Speed Ups", false, false, Quests.techSU, Quests.buildSU, Quests.trainSU); // TODO: find out quest order
  public static ChallengeModel FRI_THREE = new ChallengeModel("Build / Tech / Train SU", false, false, Quests.build, Quests.tech, Quests.trainSU); // TODO: quest order
  public static ChallengeModel FRI_FOUR = new ChallengeModel("Train SU", false, false, Quests.trainSU);
  public static ChallengeModel FRI_FIVE = new ChallengeModel("Build / Tech / Train SU", false, false, Quests.build, Quests.tech, Quests.trainSU); // TODO: quest order
  public static ChallengeModel FRI_SIX = new ChallengeModel("Train / Build", false, true, Quests.build, Quests.train10, Quests.train9, Quests.train8, Quests.train7, Quests.train6, Quests.train5, Quests.train4, Quests.train3, Quests.train2, Quests.train1);
  public static ChallengeModel FRI_SEVEN = new ChallengeModel("Train / Tech", false, true, Quests.tech, Quests.train10, Quests.train9, Quests.train8, Quests.train7, Quests.train6, Quests.train5, Quests.train4, Quests.train3, Quests.train2, Quests.train1);
  public static ChallengeModel FRI_EIGHT = new ChallengeModel("Any Speed Up", false, false, Quests.anySU);
  public static ChallengeModel FRI_NINE = new ChallengeModel("Any Speed Up", false, false, Quests.anySU);
  public static ChallengeModel FRI_TEN = new ChallengeModel("All 3 Speed Ups", false, false, Quests.techSU, Quests.buildSU, Quests.trainSU); // TODO: find out quest order
  public static ChallengeModel FRI_ELEVEN = new ChallengeModel("Build / Tech / Train SU", false, false, Quests.build, Quests.tech, Quests.trainSU); // TODO: quest order
  public static ChallengeModel FRI_TWELVE = new ChallengeModel("Train SU", false, false, Quests.trainSU);
  public static ChallengeModel FRI_THIRTEEN = new ChallengeModel("Build / Tech / Train SU", false, false, Quests.build, Quests.tech, Quests.trainSU); // TODO: quest order
  public static ChallengeModel FRI_FOURTEEN = new ChallengeModel("Train / Build", false, true, Quests.build, Quests.train10, Quests.train9, Quests.train8, Quests.train7, Quests.train6, Quests.train5, Quests.train4, Quests.train3, Quests.train2, Quests.train1);
  public static ChallengeModel FRI_FIFTEEN = new ChallengeModel("Train / Tech", false, true, Quests.tech, Quests.train10, Quests.train9, Quests.train8, Quests.train7, Quests.train6, Quests.train5, Quests.train4, Quests.train3, Quests.train2, Quests.train1);
  public static ChallengeModel FRI_SIXTEEN = new ChallengeModel("Any Speed Up", false, false, Quests.anySU);
  public static ChallengeModel FRI_SEVENTEEN = new ChallengeModel("Any Speed Up", false, false, Quests.anySU);
  public static ChallengeModel FRI_EIGHTEEN = new ChallengeModel("All 3 Speed Ups", false, false, Quests.techSU, Quests.buildSU, Quests.trainSU); // TODO: find out quest order
  public static ChallengeModel FRI_NINETEEN = new ChallengeModel("Build / Tech / Train SU", false, false, Quests.build, Quests.tech, Quests.trainSU); // TODO: quest order
  public static ChallengeModel FRI_TWENTY = new ChallengeModel("Train SU", false, false, Quests.trainSU);
  public static ChallengeModel FRI_TWENTYONE = new ChallengeModel("Build / Tech / Train SU", false, false, Quests.build, Quests.tech, Quests.trainSU); // TODO: quest order
  public static ChallengeModel FRI_TWENTYTWO = new ChallengeModel("Train / Build", false, true, Quests.build, Quests.train10, Quests.train9, Quests.train8, Quests.train7, Quests.train6, Quests.train5, Quests.train4, Quests.train3, Quests.train2, Quests.train1);
  public static ChallengeModel FRI_TWENTYTHREE = new ChallengeModel("Train / Tech", false, true, Quests.tech, Quests.train10, Quests.train9, Quests.train8, Quests.train7, Quests.train6, Quests.train5, Quests.train4, Quests.train3, Quests.train2, Quests.train1);
  public static ChallengeModel FRI_TWENTYFOUR = new ChallengeModel("Any Speed Up", false, false, Quests.anySU);

  public static ChallengeModel SAT_ONE = new ChallengeModel("Any Speed Up", false, false, Quests.anySU);
  public static ChallengeModel SAT_TWO = new ChallengeModel("Tech / Tech SU", false, false, Quests.tech, Quests.techSU);
  public static ChallengeModel SAT_THREE = new ChallengeModel("Build / Build SU", false, false, Quests.build, Quests.buildSU);
  public static ChallengeModel SAT_FOUR = new ChallengeModel("Train SU", false, false, Quests.trainSU);
  public static ChallengeModel SAT_FIVE = new ChallengeModel("Build / Tech / Train SU / EC", false, false, Quests.build, Quests.tech, Quests.trainSU, Quests.EC);
  public static ChallengeModel SAT_SIX = new ChallengeModel("Build / Tech / Train SU", false, false, Quests.build, Quests.tech, Quests.trainSU);
  public static ChallengeModel SAT_SEVEN = new ChallengeModel("Train / Build", false, true, Quests.build, Quests.train10, Quests.train9, Quests.train8, Quests.train7, Quests.train6, Quests.train5, Quests.train4, Quests.train3, Quests.train2, Quests.train1);
  public static ChallengeModel SAT_EIGHT = new ChallengeModel("Train / Tech", false, true, Quests.tech, Quests.train10, Quests.train9, Quests.train8, Quests.train7, Quests.train6, Quests.train5, Quests.train4, Quests.train3, Quests.train2, Quests.train1);
  public static ChallengeModel SAT_NINE = new ChallengeModel("Any Speed Up", false, false, Quests.anySU);
  public static ChallengeModel SAT_TEN = new ChallengeModel("Tech / Tech SU", false, false, Quests.tech, Quests.techSU);
  public static ChallengeModel SAT_ELEVEN = new ChallengeModel("Build / Build SU", false, false, Quests.build, Quests.buildSU);
  public static ChallengeModel SAT_TWELVE = new ChallengeModel("Train SU", false, false, Quests.trainSU);
  public static ChallengeModel SAT_THIRTEEN = new ChallengeModel("Build / Tech / Train SU / EC", false, false, Quests.build, Quests.tech, Quests.trainSU, Quests.EC);
  public static ChallengeModel SAT_FOURTEEN = new ChallengeModel("Build / Tech / Train SU", false, false, Quests.build, Quests.tech, Quests.trainSU);
  public static ChallengeModel SAT_FIFTEEN = new ChallengeModel("Train / Build", false, true, Quests.build, Quests.train10, Quests.train9, Quests.train8, Quests.train7, Quests.train6, Quests.train5, Quests.train4, Quests.train3, Quests.train2, Quests.train1);
  public static ChallengeModel SAT_SIXTEEN = new ChallengeModel("Train / Tech", false, true, Quests.tech, Quests.train10, Quests.train9, Quests.train8, Quests.train7, Quests.train6, Quests.train5, Quests.train4, Quests.train3, Quests.train2, Quests.train1);
  public static ChallengeModel SAT_SEVENTEEN = new ChallengeModel("Any Speed Up", false, false, Quests.anySU);
  public static ChallengeModel SAT_EIGHTEEN = new ChallengeModel("Tech / Tech SU", false, false, Quests.tech, Quests.techSU);
  public static ChallengeModel SAT_NINETEEN = new ChallengeModel("Build / Build SU", false, false, Quests.build, Quests.buildSU);
  public static ChallengeModel SAT_TWENTY = new ChallengeModel("Train SU", false, false, Quests.trainSU);
  public static ChallengeModel SAT_TWENTYONE = new ChallengeModel("Build / Tech / Train SU / EC", false, false, Quests.build, Quests.tech, Quests.trainSU, Quests.EC);
  public static ChallengeModel SAT_TWENTYTWO = new ChallengeModel("Build / Tech / Train SU", false, false, Quests.build, Quests.tech, Quests.trainSU);
  public static ChallengeModel SAT_TWENTYTHREE = new ChallengeModel("Train / Build", false, true, Quests.build, Quests.train10, Quests.train9, Quests.train8, Quests.train7, Quests.train6, Quests.train5, Quests.train4, Quests.train3, Quests.train2, Quests.train1);
  public static ChallengeModel SAT_TWENTYFOUR = new ChallengeModel("Train / Tech", false, true, Quests.tech, Quests.train10, Quests.train9, Quests.train8, Quests.train7, Quests.train6, Quests.train5, Quests.train4, Quests.train3, Quests.train2, Quests.train1);
}
