package cat.fatty.lss.lastsheltersurvivaltoolkit.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.DayAdapter;

public class DayViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

  TextView challengeDescription;
  ImageView challengeImage;
  ImageView alarmSet;

  public DayViewHolder(View itemView) {
    super(itemView);
    challengeDescription = itemView.findViewById(R.id.hour_name);
    challengeImage = itemView.findViewById(R.id.hour_image);
    alarmSet = itemView.findViewById(R.id.challenge_alarm_image);
    itemView.setTag(itemView);
    itemView.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
      if (DayAdapter.clickListener != null) {
        DayAdapter.clickListener.onClick(view, getAdapterPosition());
      }
  }

  public TextView getChallengeDescription() {
    return challengeDescription;
  }

  public ImageView getChallengeImage() {
    return challengeImage;
  }

  public ImageView getAlarmSet() {
    return alarmSet;
  }
}