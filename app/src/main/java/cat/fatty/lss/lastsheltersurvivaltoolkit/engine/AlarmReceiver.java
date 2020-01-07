package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver {

  @Override
  public void onReceive(Context context, Intent intent) {
    Intent serviceIntent = new Intent(context, AlarmToneService.class);
    context.startService(serviceIntent);
  }
}