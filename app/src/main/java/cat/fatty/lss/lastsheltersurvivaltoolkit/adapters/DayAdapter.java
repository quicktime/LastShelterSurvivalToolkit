package cat.fatty.lss.lastsheltersurvivaltoolkit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.ChallengeModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.view.DayViewHolder;

public class DayAdapter extends RecyclerView.Adapter<DayViewHolder> {

  private ArrayList<ChallengeModel> challengeModels;
  private int rowLayout;
  private Context mContext;
  public static ItemClickListener clickListener;

  public DayAdapter(ArrayList<ChallengeModel> challengeModels, int rowLayout, Context context) {
    this.challengeModels = challengeModels;
    this.rowLayout = rowLayout;
    this.mContext = context;
  }

  @NonNull
  @Override
  public DayViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
    View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
    return new DayViewHolder(v);
  }

  @Override
  public void onBindViewHolder(DayViewHolder viewHolder, int position) {
    final ChallengeModel challenge = challengeModels.get(position);

    viewHolder.getChallengeDescription().setText(challenge.getDescription());
    viewHolder.getChallengeDescription().setTextColor(challenge.getColor());
    viewHolder.getChallengeImage().setImageResource(challenge.getImage(mContext));

    viewHolder.getAlarmSet().setImageResource(R.drawable.ic_alarm_notification_foreground);

    int visible = View.GONE;
    if (challenge.isAlarmSet()) {
      visible = View.VISIBLE;
    }
    viewHolder.getAlarmSet().setVisibility(visible);
  }

  @Override
  public int getItemCount() {
    return challengeModels == null ? 0 : challengeModels.size();
  }

  public void setClickListener(ItemClickListener itemClickListener) {
    clickListener = itemClickListener;
  }
}