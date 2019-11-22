package cat.fatty.lss.lastsheltersurvivaltoolkit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.ChallengeModel;

public class DayAdapter extends RecyclerView.Adapter<DayAdapter.ViewHolder> {

  private List<ChallengeModel> challengeModels;
  private int rowLayout;
  private Context mContext;
  private ItemClickListener clickListener;

  public DayAdapter(List<ChallengeModel> challengeModels, int rowLayout, Context context) {
    this.challengeModels = challengeModels;
    this.rowLayout = rowLayout;
    this.mContext = context;
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
    View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
    return new ViewHolder(v);
  }

  @Override
  public void onBindViewHolder(ViewHolder viewHolder, int position) {
    final ChallengeModel challenge = challengeModels.get(position);
    viewHolder.DataModelName.setText(challenge.getName());
    viewHolder.DataModelName.setTextColor(challenge.getColor());
    viewHolder.DataModelImage.setImageResource(challenge.getImageResourceId(mContext));
  }

  @Override
  public int getItemCount() {
    return challengeModels == null ? 0 : challengeModels.size();
  }

  public void setClickListener(ItemClickListener itemClickListener) {
    this.clickListener = itemClickListener;
  }

  public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView DataModelName;
    public ImageView DataModelImage;

    public ViewHolder(View itemView) {
      super(itemView);
      DataModelName = itemView.findViewById(R.id.hour_name);
      DataModelImage = itemView.findViewById(R.id.hour_image);
      itemView.setTag(itemView);
      itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
      if (clickListener != null) clickListener.onClick(view, getAdapterPosition());
    }
  }
}