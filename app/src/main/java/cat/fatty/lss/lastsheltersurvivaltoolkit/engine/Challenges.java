package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

public class Challenges {
  
  public static ChallengeModel BUILD_BUILDSU_VIP = new ChallengeModel("Build / Build SU / VIP", true, false, Quests.build, Quests.buildSU, Quests.vip);
  public static ChallengeModel BUILD_VIP = new ChallengeModel("Build / VIP", false, false, Quests.build, Quests.vip);
  public static ChallengeModel TRAINSU_VIP = new ChallengeModel("Train SU / VIP", false, false, Quests.trainSU, Quests.vip);
  public static ChallengeModel TRAIN_BUILD_VIP = new ChallengeModel("Train / Build / VIP", false, false, Quests.train, Quests.build, Quests.vip);
  public static ChallengeModel TRAINSU_BUILDSU_TECHSU = new ChallengeModel("All 3 SUs", false, false, Quests.trainSU, Quests.buildSU, Quests.techSU);
  public static ChallengeModel BUILD_TECH_TRAINSU_EC = new ChallengeModel("Build / Tech / Train SU / EC", false, false, Quests.build, Quests.tech, Quests.trainSU, Quests.EC);
  public static ChallengeModel TRAIN_BUILD_TECH_VIP = new ChallengeModel("Train / Build / Tech / VIP", false, false, Quests.train, Quests.build, Quests.tech, Quests.vip);

  public static ChallengeModel ZOMBIESDAILY = new ChallengeModel("Zombies", false, false, Quests.superRecruit, Quests.advancedRecruit, Quests.normalRecruit, Quests.unlockSkill, Quests.zombie1Daily, Quests.zombie2Daily, Quests.zombie3Daily, Quests.zombie4Daily, Quests.zombie5Daily, Quests.zombie6Daily, Quests.zombie7Daily, Quests.zombie8Daily, Quests.zombie9Daily, Quests.zombie10Daily, Quests.zombie11Daily, Quests.zombie12Daily, Quests.zombie13Daily, Quests.zombie14Daily, Quests.zombie15Daily );
  public static ChallengeModel RECRUIT_ZOMBIES = new ChallengeModel("Recruit / Zombies", false, false, Quests.superRecruit, Quests.advancedRecruit, Quests.normalRecruit, Quests.unlockSkill, Quests.zombie15Hourly, Quests.zombie14Hourly, Quests.zombie13Hourly, Quests.zombie12Hourly, Quests.zombie11Hourly, Quests.zombie10Hourly, Quests.zombie9Hourly, Quests.zombie8Hourly, Quests.zombie7Hourly, Quests.zombie6Hourly, Quests.zombie5Hourly, Quests.zombie4Hourly, Quests.zombie3Hourly, Quests.zombie2Hourly, Quests.zombie1Hourly);
  public static ChallengeModel ALLHERODEV = new ChallengeModel("All Hero Development", false, false, Quests.exchangeWisdom, Quests.spendWisdom, Quests.gainXP, Quests.unlockSkill, Quests.normalRecruit, Quests.advancedRecruit, Quests.superRecruit);
  public static ChallengeModel WISDOM_ZOMBIES = new ChallengeModel("Wisdom / Zombies", false, false, Quests.unlockSkill, Quests.exchangeWisdom, Quests.spendWisdom, Quests.zombie15Hourly, Quests.zombie14Hourly, Quests.zombie13Hourly, Quests.zombie12Hourly, Quests.zombie11Hourly, Quests.zombie10Hourly, Quests.zombie9Hourly, Quests.zombie8Hourly, Quests.zombie7Hourly, Quests.zombie6Hourly, Quests.zombie5Hourly, Quests.zombie4Hourly, Quests.zombie3Hourly, Quests.zombie2Hourly, Quests.zombie1Hourly);

  public static ChallengeModel THURS_ONE = new ChallengeModel("Any Speed Up", false, false, Quests.anySU);
  public static ChallengeModel THURS_TWO = new ChallengeModel("All 3 Speed Ups", false, false, Quests.techSU, Quests.buildSU, Quests.trainSU); // TODO: find out quest order
  public static ChallengeModel THURS_THREE = new ChallengeModel("Build / Tech / Train SU", false, false, Quests.build, Quests.tech, Quests.trainSU); // TODO: quest order
  public static ChallengeModel THURS_FOUR = new ChallengeModel("Train SU", false, false, Quests.trainSU);
  public static ChallengeModel THURS_FIVE = new ChallengeModel("Build / Tech / Train SU", false, false, Quests.build, Quests.tech, Quests.trainSU); // TODO: quest order
  public static ChallengeModel THURS_SIX = new ChallengeModel("Train / Build", false, true, Quests.train, Quests.build);
  public static ChallengeModel THURS_SEVEN = new ChallengeModel("Train / Tech", false, true, Quests.train, Quests.tech);
  public static ChallengeModel THURS_EIGHT = new ChallengeModel("Any Speed Up", false, false, Quests.anySU);
  public static ChallengeModel THURS_NINE = new ChallengeModel("Any Speed Up", false, false, Quests.anySU);
  public static ChallengeModel THURS_TEN = new ChallengeModel("All 3 Speed Ups", false, false, Quests.techSU, Quests.buildSU, Quests.trainSU); // TODO: find out quest order
  public static ChallengeModel THURS_ELEVEN = new ChallengeModel("Build / Tech / Train SU", false, false, Quests.build, Quests.tech, Quests.trainSU); // TODO: quest order
  public static ChallengeModel THURS_TWELVE = new ChallengeModel("Train SU", false, false, Quests.trainSU);
  public static ChallengeModel THURS_THIRTEEN = new ChallengeModel("Build / Tech / Train SU", false, false, Quests.build, Quests.tech, Quests.trainSU); // TODO: quest order
  public static ChallengeModel THURS_FOURTEEN = new ChallengeModel("Train / Build", false, true, Quests.train, Quests.build);
  public static ChallengeModel THURS_FIFTEEN = new ChallengeModel("Train / Tech", false, true, Quests.train, Quests.tech);
  public static ChallengeModel THURS_SIXTEEN = new ChallengeModel("Any Speed Up", false, false, Quests.anySU);
  public static ChallengeModel THURS_SEVENTEEN = new ChallengeModel("Any Speed Up", false, false, Quests.anySU);
  public static ChallengeModel THURS_EIGHTEEN = new ChallengeModel("All 3 Speed Ups", false, false, Quests.techSU, Quests.buildSU, Quests.trainSU); // TODO: find out quest order
  public static ChallengeModel THURS_NINETEEN = new ChallengeModel("Build / Tech / Train SU", false, false, Quests.build, Quests.tech, Quests.trainSU); // TODO: quest order
  public static ChallengeModel THURS_TWENTY = new ChallengeModel("Train SU", false, false, Quests.trainSU);
  public static ChallengeModel THURS_TWENTYONE = new ChallengeModel("Build / Tech / Train SU", false, false, Quests.build, Quests.tech, Quests.trainSU); // TODO: quest order
  public static ChallengeModel THURS_TWENTYTWO = new ChallengeModel("Train / Build", false, true, Quests.train, Quests.build);
  public static ChallengeModel THURS_TWENTYTHREE = new ChallengeModel("Train / Tech", false, true, Quests.train, Quests.tech);
  public static ChallengeModel THURS_TWENTYFOUR = new ChallengeModel("Any Speed Up", false, false, Quests.anySU);

}
