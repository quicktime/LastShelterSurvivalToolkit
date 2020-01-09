package cat.fatty.lss.lastsheltersurvivaltoolkit.view;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.DayAdapter;

public class ChallengeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

  TextView questDescription;
  TextView questReward;
  View itemView;

  public ChallengeViewHolder(View itemView) {
    super(itemView);
    questDescription = itemView.findViewById(R.id.quest_description);
    questReward = itemView.findViewById(R.id.quest_reward);
    itemView.setTag(itemView);
    itemView.setOnClickListener(this);
    this.itemView = itemView;
  }

  @Override
  public void onClick(View view) {
    if (DayAdapter.clickListener != null) {
      DayAdapter.clickListener.onClick(view, getAdapterPosition());
    }
  }

  public TextView getQuestDescription() {
    return questDescription;
  }

  public TextView getQuestReward() {
    return questReward;
  }

  public View getItemView() {
    return itemView;
  }
}
