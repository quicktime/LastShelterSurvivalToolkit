package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

public class TuesdayModel {

  private String hour;
  private String challenge;

  public TuesdayModel(String hour) {
    this.hour = hour;
  }

  private void setChallenge(String hour) {
    String challenge;
    switch (hour) {
      case "00" :
        challenge = "";
        break;
      case "01" :
        challenge = "";
        break;
      case "02" :
        challenge = "";
        break;
      case "03" :
        challenge = "";
        break;
      case "04" :
        challenge = "";
        break;
      case "05" :
        challenge = "";
        break;
      case "06" :
        challenge = "";
        break;
      case "07" :
        challenge = "";
        break;
      case "08" :
        challenge = "";
        break;
      case "09" :
        challenge = "";
        break;
      case "10" :
        challenge = "";
        break;
      case "11" :
        challenge = "";
        break;
      case "12" :
        challenge = "";
        break;
      case "13" :
        challenge = "";
        break;
      case "14" :
        challenge = "";
        break;
      case "15" :
        challenge = "";
        break;
      case "16" :
        challenge = "";
        break;
      case "17" :
        challenge = "";
        break;
      case "18" :
        challenge = "";
        break;
      case "19" :
        challenge = "";
        break;
      case "20" :
        challenge = "";
        break;
      case "21" :
        challenge = "";
        break;
      case "22" :
        challenge = "";
        break;
      case "23" :
        challenge = "";
        break;
      default :
        challenge = "";
        break;
    }
    this.challenge = challenge;
  }

  public String getChallenge() {
    setChallenge(hour);
    return challenge;
  }
}
