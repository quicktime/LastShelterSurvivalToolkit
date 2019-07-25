package cat.fatty.lss.lastsheltersurvivaltoolkit.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.DayModel;

public class WeekAdapter extends RecyclerView.Adapter<WeekAdapter.ViewHolder>{

  private List<DayModel> days;
  private int rowLayout;
  private Context mContext;
  private ItemClickListener clickListener;

  public WeekAdapter(List<DayModel> days, int rowLayout, Context context) {
    this.days = days;
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
    final DayModel day = days.get(position);
    viewHolder.DataModelName.setText(day.getName());
    viewHolder.DataModelName.setTextColor(day.getColor());
    viewHolder.DataModelImage.setImageResource(day.getImageResourceId(mContext));
  }

  @Override
  public int getItemCount() {
    return days == null ? 0 : days.size();
  }

  public void setClickListener(ItemClickListener itemClickListener) {
    this.clickListener = itemClickListener;
  }

  public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView DataModelName;
    public ImageView DataModelImage;

    public ViewHolder(View itemView) {
      super(itemView);
      DataModelName = itemView.findViewById(R.id.day_name);
      DataModelImage = itemView.findViewById(R.id.day_image);
      itemView.setTag(itemView);
      itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
      if (clickListener != null) clickListener.onClick(view, getAdapterPosition());
    }
  }
}