package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import cat.fatty.lss.lastsheltersurvivaltoolkit.models.QuestModel;

public class Quests {

  public static QuestModel buyDiamond = new QuestModel("Buy 1 Diamond", 100);

  public static QuestModel build = new QuestModel("Increase 1 Building Power", 1000);
  public static QuestModel buildSU = new QuestModel("Use 1 Min Building Speed Up", 400); // TODO:
  public static QuestModel vip = new QuestModel("Spend 1 VIP point", 100); // TODO:

  public static QuestModel train = new QuestModel("Train 1 Unit", 0); // TODO:
  public static QuestModel trainSU = new QuestModel("Use 1 Min Training Speed Up", 400); // TODO:

  public static QuestModel tech = new QuestModel("Increase 1 Technology Power", 400); // TODO:
  public static QuestModel techSU = new QuestModel("Use 1 Min Research Speed Up", 400); // TODO:

  public static QuestModel anySU = new QuestModel("Every 1 min of any speed-up items used", 400);

  public static QuestModel craftGoldenPart = new QuestModel("Craft 1 Golden Part", 500000);
  public static QuestModel craftOrangePart = new QuestModel("Craft 1 Orange Part", 120000);
  public static QuestModel craftPurplePart = new QuestModel("Craft 1 Purple Part", 10000);
  public static QuestModel craftBluePart = new QuestModel("Craft 1 Blue Part", 5000);
  public static QuestModel craftGreenPart = new QuestModel("Craft 1 Green Part", 100);
  public static QuestModel craftWhitePart = new QuestModel("Craft 1 White Part", 50);

  public static QuestModel EC = new QuestModel("Consume 1 Energy Core", 20);

  public static QuestModel exchangeWisdom = new QuestModel("Exchange and obtain 1 wisdom medal", 1000);
  public static QuestModel spendWisdom = new QuestModel("Spend 1 Wisdom Medal", 2000);
  public static QuestModel gainXP = new QuestModel("Gaining 10 Hero Xp", 1);
  public static QuestModel unlockSkill = new QuestModel("Unlock a skill for any hero", 20000);
  public static QuestModel normalRecruit = new QuestModel("Use 1 Normal Recruitment Ticket", 10000);
  public static QuestModel advancedRecruit = new QuestModel("Use one Advanced Recruitment Ticket", 50000);
  public static QuestModel superRecruit = new QuestModel("Use one Super Recruitment Ticket", 200000);

  public static QuestModel zombie15Hourly = new QuestModel("Kill a Lvl 15 Zombie", 4800);
  public static QuestModel zombie14Hourly = new QuestModel("Kill a Lvl 14 Zombie", 4600);
  public static QuestModel zombie13Hourly = new QuestModel("Kill a Lvl 13 Zombie", 4400);
  public static QuestModel zombie12Hourly = new QuestModel("Kill a Lvl 12 Zombie", 4200);
  public static QuestModel zombie11Hourly = new QuestModel("Kill a Lvl 11 Zombie", 4000);
  public static QuestModel zombie10Hourly = new QuestModel("Kill a Lvl 10 Zombie", 3800);
  public static QuestModel zombie9Hourly = new QuestModel("Kill a Lvl 9 Zombie", 3600);
  public static QuestModel zombie8Hourly = new QuestModel("Kill a Lvl 8 Zombie", 3400);
  public static QuestModel zombie7Hourly = new QuestModel("Kill a Lvl 7 Zombie", 3200);
  public static QuestModel zombie6Hourly = new QuestModel("Kill a Lvl 6 Zombie", 3000);
  public static QuestModel zombie5Hourly = new QuestModel("Kill a Lvl 5 Zombie", 2800);
  public static QuestModel zombie4Hourly = new QuestModel("Kill a Lvl 4 Zombie", 2600);
  public static QuestModel zombie3Hourly = new QuestModel("Kill a Lvl 3 Zombie", 2400);
  public static QuestModel zombie2Hourly = new QuestModel("Kill a Lvl 2 Zombie", 2200);
  public static QuestModel zombie1Hourly = new QuestModel("Kill a Lvl 1 Zombie", 2000);

  public static QuestModel zombie15Daily = new QuestModel("Kill a Lvl 15 Zombie", 100000);
  public static QuestModel zombie14Daily = new QuestModel("Kill a Lvl 14 Zombie", 90000);
  public static QuestModel zombie13Daily = new QuestModel("Kill a Lvl 13 Zombie", 75000);
  public static QuestModel zombie12Daily = new QuestModel("Kill a Lvl 12 Zombie", 60000);
  public static QuestModel zombie11Daily = new QuestModel("Kill a Lvl 11 Zombie", 45000);
  public static QuestModel zombie10Daily = new QuestModel("Kill a Lvl 10 Zombie", 30000);
  public static QuestModel zombie9Daily = new QuestModel("Kill a Lvl 9 Zombie", 27000);
  public static QuestModel zombie8Daily = new QuestModel("Kill a Lvl 8 Zombie", 24000);
  public static QuestModel zombie7Daily = new QuestModel("Kill a Lvl 7 Zombie", 21000);
  public static QuestModel zombie6Daily = new QuestModel("Kill a Lvl 6 Zombie", 18000);
  public static QuestModel zombie5Daily = new QuestModel("Kill a Lvl 5 Zombie", 15000);
  public static QuestModel zombie4Daily = new QuestModel("Kill a Lvl 4 Zombie", 12000);
  public static QuestModel zombie3Daily = new QuestModel("Kill a Lvl 3 Zombie", 7500);
  public static QuestModel zombie2Daily = new QuestModel("Kill a Lvl 2 Zombie", 3000);
  public static QuestModel zombie1Daily = new QuestModel("Kill a Lvl 1 Zombie", 1500);

  public static QuestModel train10 = new QuestModel("Train a 10 Unit", 215);
  public static QuestModel train9 = new QuestModel("Train a 9 Unit", 190);
  public static QuestModel train8 = new QuestModel("Train a 8 Unit", 165);
  public static QuestModel train7 = new QuestModel("Train a 7 Unit", 140);
  public static QuestModel train6 = new QuestModel("Train a 6 Unit", 115);
  public static QuestModel train5 = new QuestModel("Train a 5 Unit", 90);
  public static QuestModel train4 = new QuestModel("Train a 4 Unit", 65);
  public static QuestModel train3 = new QuestModel("Train a 3 Unit", 50);
  public static QuestModel train2 = new QuestModel("Train a 2 Unit", 25);
  public static QuestModel train1 = new QuestModel("Train a 1 Unit", 5);
}