package cat.fatty.lss.lastsheltersurvivaltoolkit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.QuestModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.view.ChallengeViewHolder;

public class ChallengeAdapter extends RecyclerView.Adapter<ChallengeViewHolder> {

  private ArrayList<QuestModel> questModels;
  private int mLayout;
  private Context mContext;

  public ChallengeAdapter(ArrayList<QuestModel> questModels, int layout, Context context) {
    this.questModels = questModels;
    this.mLayout = layout;
    this.mContext = context;
  }

  @NonNull
  @Override
  public ChallengeViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
    View v = LayoutInflater.from(viewGroup.getContext()).inflate(mLayout, viewGroup, false);
    return new ChallengeViewHolder(v);
  }

  @Override
  public void onBindViewHolder(ChallengeViewHolder viewHolder, int position) {
    final QuestModel questModel = questModels.get(position);

    viewHolder.getQuestDescription().setText(questModel.getDescription());
    viewHolder.getQuestReward().setText(String.format(Locale.getDefault(), "+ %d", questModel.getReward()));
    if (position % 2 == 0) {
      viewHolder.getItemView().setBackgroundColor(mContext.getColor(R.color.even_quest_bg));
    } else {
      viewHolder.getItemView().setBackgroundColor(mContext.getColor(R.color.odd_quest_bg));
    }
  }

  @Override
  public int getItemCount() {
    return questModels == null ? 0 : questModels.size();
  }
}