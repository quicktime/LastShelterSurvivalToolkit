package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

public class Quests {

  public static QuestModel buyDiamond = new QuestModel("Buy 1 Diamond", 100);

  public static QuestModel build = new QuestModel("Increase 1 Building Power", 1000);
  public static QuestModel buildSU = new QuestModel("Use 1 Min Building Speed Up", 400); // TODO:
  public static QuestModel vip = new QuestModel("Spend 1 VIP point", 100); // TODO:

  public static QuestModel train = new QuestModel("Train 1 Unit", 0); // TODO:
  public static QuestModel trainSU = new QuestModel("Use 1 Min Training Speed Up", 0); // TODO:

  public static QuestModel tech = new QuestModel("", 0); // TODO:
  public static QuestModel techSU = new QuestModel("", 0); // TODO:

  public static QuestModel craftGoldenPart = new QuestModel("Craft 1 Golden Part", 500000);
  public static QuestModel craftOrangePart = new QuestModel("Craft 1 Orange Part", 120000);
  public static QuestModel craftPurplePart = new QuestModel("Craft 1 Purple Part", 10000);
  public static QuestModel craftBluePart = new QuestModel("Craft 1 Blue Part", 5000);
  public static QuestModel craftGreenPart = new QuestModel("Craft 1 Green Part", 100);
  public static QuestModel craftWhitePart = new QuestModel("Craft 1 White Part", 50);

  public static QuestModel EC = new QuestModel("Consume 1 Energy Core", 20);
}
