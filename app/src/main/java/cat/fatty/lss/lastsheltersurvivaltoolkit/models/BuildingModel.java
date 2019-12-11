package cat.fatty.lss.lastsheltersurvivaltoolkit.models;

import java.io.Serializable;
import java.util.ArrayList;

import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.Resources;

public class BuildingModel implements Serializable {

  private String string;
  private BuildingTypeModel type;
  private BuildingModel req1;
  private BuildingModel req2;
  private BuildingModel req3;
  private BuildingModel req4;
  private int lvl;
  private int food;
  private int water;
  private int fuel;
  private int lumber;
  private int iron;
  private int electricity;
  private int chips;
  private int money;
  private ResourceModel resourceFood = Resources.food;
  private ResourceModel resourceWater = Resources.water;
  private ResourceModel resourceFuel = Resources.fuel;
  private ResourceModel resourceLumber = Resources.lumber;
  private ResourceModel resourceIron = Resources.iron;
  private ResourceModel resourceElectricity = Resources.electricity;
  private ResourceModel resourceChips = Resources.chips;
  private ResourceModel resourceMoney = Resources.money;

  public BuildingModel (BuildingTypeModel type, int lvl, BuildingModel req1, BuildingModel req2, BuildingModel req3, BuildingModel req4, int food, int water, int fuel, int lumber, int iron, int electricity, int chips, int money) {
    this.req1 = req1;
    this.req2 = req2;
    this.req3 = req3;
    this.req4 = req4;
    this.type = type;
    this.lvl = lvl;
    this.food = food;
    this.water = water;
    this.fuel = fuel;
    this.lumber = lumber;
    this.iron = iron;
    this.electricity = electricity;
    this.chips = chips;
    this.money = money;
  }

  public BuildingModel(String string)
  {
    this.string = string;
  }

  public void setResources()
  {
    resourceFood.setQuantRequired(food);
    resourceWater.setQuantRequired(water);
    resourceFuel.setQuantRequired(fuel);
    resourceLumber.setQuantRequired(lumber);
    resourceIron.setQuantRequired(iron);
    resourceElectricity.setQuantRequired(electricity);
    resourceChips.setQuantRequired(chips);
    resourceMoney.setQuantRequired(money);
  }

  public ArrayList<ResourceModel> getResources()
  {
    ArrayList<ResourceModel> resources = new ArrayList<>();

    resources.add(resourceFood);
    resources.add(resourceWater);
    resources.add(resourceFuel);
    resources.add(resourceLumber);
    resources.add(resourceIron);
    resources.add(resourceElectricity);
    resources.add(resourceChips);
    resources.add(resourceMoney);

    return resources;
  }

  public BuildingTypeModel getType() {
    return type;
  }

  public BuildingModel getReq1() {
    return req1;
  }

  public BuildingModel getReq2() {
    return req2;
  }

  public BuildingModel getReq3() {
    return req3;
  }

  public BuildingModel getReq4() {
    return req4;
  }

  public void setType(BuildingTypeModel type) {
    this.type = type;
  }

  public int getSize() {
    int counter = 0;
    for (int i = 0; i < 8; i++) {
      if (resourceFood != null) {
        counter++;
      }
      if (resourceWater != null) {
        counter++;
      }
      if (resourceFuel != null) {
        counter++;
      }
      if (resourceLumber != null) {
        counter++;
      }
      if (resourceIron != null) {
        counter++;
      }
      if (resourceElectricity != null) {
        counter++;
      }
      if (resourceChips != null) {
        counter++;
      }
      if (resourceMoney != null) {
        counter++;
      }
    }
      return counter;
  }

  public int getChips() {
    return chips;
  }

  public int getElectricity() {
    return electricity;
  }

  public int getFood() {
    return food;
  }

  public int getFuel() {
    return fuel;
  }

  public int getIron() {
    return iron;
  }

  public int getLumber() {
    return lumber;
  }

  public int getLvl() {
    return lvl;
  }

  public int getMoney() {
    return money;
  }

  public int getWater() {
    return water;
  }

  public void setFood(int food) {
    this.food = food;
  }

  public void setChips(int chips) {
    this.chips = chips;
  }

  public void setElectricity(int electricity) {
    this.electricity = electricity;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }

  public void setIron(int iron) {
    this.iron = iron;
  }

  public void setLumber(int lumber) {
    this.lumber = lumber;
  }

  public void setLvl(int lvl) {
    this.lvl = lvl;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public void setWater(int water) {
    this.water = water;
  }
}
