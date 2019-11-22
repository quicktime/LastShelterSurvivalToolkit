package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class AlarmToneService extends Service {


  private boolean isSet;

  @Override
  public IBinder onBind(Intent intent) {
    return null;
  }

  @Override
  public int onStartCommand(Intent intent, int flags, int startID) {
    MediaPlayer thePlayer = MediaPlayer.create(getApplicationContext(), RingtoneManager.getActualDefaultRingtoneUri(this, RingtoneManager.TYPE_ALARM));

    Toast.makeText(this, "t", Toast.LENGTH_SHORT).show(); //TODO: remove debug toast

    String state = "no";
    isSet = false;

    if (intent.getExtras() != null) {
      state = intent.getExtras().getString("state");
    }

    if (state != null) {
      if (state.toLowerCase().equalsIgnoreCase("yes")) {
        isSet = true;
      }
    }

    if (isSet) {
      thePlayer.start();
      Toast.makeText(this, "thePlayer should have started", Toast.LENGTH_LONG).show(); //TODO: remove debug toast
    } else {
      if (thePlayer != null) {
        if (thePlayer.isPlaying()) {
          thePlayer.stop();
          thePlayer.reset();
        }
      }
    }

    return START_NOT_STICKY;
  }

  @Override
  public void onDestroy() {
    Log.e("AlarmToneService", "onDestroy() called");
    super.onDestroy();

    this.isSet = false;
  }
}
