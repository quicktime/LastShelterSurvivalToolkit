package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import android.app.Service;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.IBinder;

public class AlarmToneService extends Service {
  
  public static Ringtone ringtone;
  
  @Override
  public IBinder onBind(Intent intent) {
    return null;
  }
  
  @Override
  public int onStartCommand(Intent intent, int flags, int startID) {
    Uri uri = RingtoneManager.getActualDefaultRingtoneUri(this, RingtoneManager.TYPE_ALARM);
    boolean ringAlarm = intent.getBooleanExtra("ringAlarm", false);
    
    if (ringAlarm) {
      ringtone = RingtoneManager.getRingtone(getApplicationContext(), uri);
      ringtone.play();
    }
    return START_NOT_STICKY;
  }
  
  @Override
  public void onDestroy() {
    ringtone.stop();
    super.onDestroy();
  }
}
