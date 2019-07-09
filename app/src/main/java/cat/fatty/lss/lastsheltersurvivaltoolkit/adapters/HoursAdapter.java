package cat.fatty.lss.lastsheltersurvivaltoolkit.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.HourModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;

public class HoursAdapter extends RecyclerView.Adapter<HoursAdapter.ViewHolder>{

  private List<HourModel> hours;
  private int rowLayout;
  private Context mContext;
  private ItemClickListener clickListener;

  public HoursAdapter(List<HourModel> hours, int rowLayout, Context context) {
    this.hours = hours;
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
    final HourModel hourModel = hours.get(position);
    viewHolder.DataModelName.setText(hourModel.getName());
    Log.i("HoursAdapter#onBindViewHolder()", hourModel.name);
    Log.i("HoursAdapter#onBindViewHolder()", String.valueOf(hourModel.getImageResourceId(mContext)));
    viewHolder.DataModelImage.setImageResource(hourModel.getImageResourceId(mContext));
  }

  @Override
  public int getItemCount() {
    return hours == null ? 0 : hours.size();
  }

  public void setClickListener(ItemClickListener itemClickListener) {
    this.clickListener = itemClickListener;
  }

  public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView DataModelName;
    public ImageView DataModelImage;

    public ViewHolder(View itemView) {
      super(itemView);
      DataModelName = itemView.findViewById(R.id.city_name);
      DataModelImage = itemView.findViewById(R.id.city_image);
      itemView.setTag(itemView);
      itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
      if (clickListener != null) clickListener.onClick(view, getAdapterPosition());
    }
  }
}