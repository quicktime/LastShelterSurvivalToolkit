package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class AlarmToneService extends Service {

  private MediaPlayer thePlayer;
  private boolean isOn;
  private boolean isSet;

  @Override
  public IBinder onBind(Intent intent) {
    return null;
  }

  @Override
  public int onStartCommand(Intent intent, int flags, int startID) {
    Toast.makeText(this, "t", Toast.LENGTH_SHORT).show();

    String state = intent.getExtras().getString("extra");

    isSet = false;
    if (state.equalsIgnoreCase("yes")) {
      isSet = true;
    }

    if (isSet) {
      thePlayer = MediaPlayer.create(getApplicationContext(), RingtoneManager.getActualDefaultRingtoneUri(this, RingtoneManager.TYPE_ALARM));
      thePlayer.start();
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
    Log.e("JSLog", "on destroy called");
    super.onDestroy();

    this.isOn = false;
    this.isSet = false;
  }
}
