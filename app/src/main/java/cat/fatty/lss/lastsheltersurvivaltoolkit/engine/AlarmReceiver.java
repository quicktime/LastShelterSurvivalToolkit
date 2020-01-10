package cat.fatty.lss.lastsheltersurvivaltoolkit.engine;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.activities.MainActivity;

public class AlarmReceiver extends BroadcastReceiver {

  private NotificationManager mNotificationManager;
  private static final int NOTIFICATION_ID = 0;

  // Notification channel ID.
  private static final String PRIMARY_CHANNEL_ID = "primary_notification_channel";

  @Override
  public void onReceive(Context context, Intent intent) {
    mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
    deliverNotification(context);
    Intent serviceIntent = new Intent(context, AlarmToneService.class);
    context.startService(serviceIntent);
  }

  private void deliverNotification(Context context) {
    Intent contentIntent = new Intent(context, MainActivity.class); // Go to MainActivity when user clicks on notification
    PendingIntent contentPendingIntent = PendingIntent.getActivity(context, NOTIFICATION_ID, contentIntent, PendingIntent.FLAG_UPDATE_CURRENT);

    NotificationCompat.Builder builder = new NotificationCompat.Builder(context, PRIMARY_CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_alarm_notification_foreground)
            .setContentTitle("LSS Toolkit")
            .setContentText("It's time to use a CoZ Ticket!")
            .setContentIntent(contentPendingIntent)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)
            .setDefaults(NotificationCompat.DEFAULT_ALL);

    mNotificationManager.notify(NOTIFICATION_ID, builder.build());
  }
}