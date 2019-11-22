package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

  @Override
  public void onReceive(Context context, Intent intent) {
    Toast.makeText(context, "t", Toast.LENGTH_SHORT).show();
    
    String state = intent.getExtras().getString("extra");
    Intent serviceIntent = new Intent(context, AlarmToneService.class);
    serviceIntent.putExtra("state", state);
    context.startService(serviceIntent);
  }
}
