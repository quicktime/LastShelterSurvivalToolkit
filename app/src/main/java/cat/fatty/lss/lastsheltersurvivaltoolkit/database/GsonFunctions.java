package cat.fatty.lss.lastsheltersurvivaltoolkit.database;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Objects;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.ChallengeModel;

public class GsonFunctions {

  protected static ChallengeModel[] getChallengesFromJSON(Context context, String day) {
    int json;
    switch (day.toLowerCase()) {
      case "monday" :
        json = R.raw.monday_challenges;
        break;
      case "tuesday" :
        json = R.raw.tuesday_challenges;
        break;
      case "wednesday" :
        json = R.raw.wednesday_challenges;
        break;
      case "thursday" :
        json = R.raw.thursday_challenges;
        break;
      case "friday" :
        json = R.raw.friday_challenges;
        break;
      case "saturday" :
        json = R.raw.saturday_challenges;
        break;
      case "sunday" :
        json = R.raw.sunday_challenges;
        break;
      default :
        json = 0;
        break;
    }

    InputStream inputStream;
    try {
      inputStream = context.openFileInput(day + "_challenges.json");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      inputStream = context.getResources().openRawResource(json);
    }
    Reader reader = new InputStreamReader(inputStream);
    Gson g = new Gson();
    return g.fromJson(reader, ChallengeModel[].class);
  }

  protected static void printChallengesToJSON(ArrayList<ChallengeModel> challenges) {
    Gson g = new GsonBuilder().setPrettyPrinting().create();
    Log.d("~~~~~~~~~", g.toJson(challenges));
  }

  protected static void writeChallengesToJSON(Context context, ArrayList<ChallengeModel> challenges, String filename) {
    OutputStreamWriter outputStreamWriter;
    try {
      outputStreamWriter = new OutputStreamWriter(context.openFileOutput(filename, Context.MODE_PRIVATE));
      Writer writer = outputStreamWriter;
      Gson g = new Gson();
      g.toJson(challenges, writer);
      outputStreamWriter.close();
      Objects.requireNonNull(writer).close();
    }
    catch (IOException e) {
      Log.e("Exception", "File write failed: " + e.toString());
    }
  }
}
