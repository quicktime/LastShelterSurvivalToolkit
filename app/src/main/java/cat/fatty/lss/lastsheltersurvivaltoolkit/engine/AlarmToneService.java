package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.os.IBinder;

public class AlarmToneService extends Service {

  @Override
  public IBinder onBind(Intent intent) {
    return null;
  }

  @Override
  public int onStartCommand(Intent intent, int flags, int startID) {
    MediaPlayer thePlayer = MediaPlayer.create(getApplicationContext(), RingtoneManager.getActualDefaultRingtoneUri(this, RingtoneManager.TYPE_ALARM));
    thePlayer.start();
    return START_NOT_STICKY;
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
  }
}
