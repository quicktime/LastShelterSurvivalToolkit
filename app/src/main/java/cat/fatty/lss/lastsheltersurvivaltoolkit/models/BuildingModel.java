package cat.fatty.lss.lastsheltersurvivaltoolkit.models;

import androidx.annotation.NonNull;

public class BuildingModel {

  private String type;
  private String name;
  private String req1;
  private String req2;
  private String req3;
  private String req4;
  private int lvl;
  private int food;
  private int water;
  private int fuel;
  private int lumber;
  private int iron;
  private int electricity;
  private int chips;
  private int money;

  public BuildingModel (String name, int lvl, String req1, String req2, String req3, String req4, int food, int water, int fuel, int lumber, int iron, int electricity, int chips, int money) {
    this.name = name;
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

  // Does not show blank items
  // TODO: In the activity, only display items that are not null or 0
  private void setBuildingItems(@NonNull BuildingModel building) {
    if (building.req1.equalsIgnoreCase("")) {
      building.req1 = null;
    }
    if (building.req2.equalsIgnoreCase("")) {
      building.req2 = null;
    }
    if (building.req3.equalsIgnoreCase("")) {
      building.req3 = null;
    }
    if (building.req4.equalsIgnoreCase("")) {
      building.req4 = null;
    }
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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

  public String getName() {
    return name;
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

  public void setName(String name) {
    this.name = name;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public void setWater(int water) {
    this.water = water;
  }
}
