package cat.fatty.lss.lastsheltersurvivaltoolkit.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;

public class BuildingTypeAdapter extends RecyclerView.Adapter<BuildingTypeAdapter.ViewHolder> {

  private List<String> buildingTypes;
  private int rowLayout;
  private ItemClickListener clickListener;

  public BuildingTypeAdapter(List<String> buildingTypes, int rowLayout, Context context) {
    this.buildingTypes = buildingTypes;
    this.rowLayout = rowLayout;
  }

  @Override
  public BuildingTypeAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
    View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
    return new BuildingTypeAdapter.ViewHolder(v);
  }

  @Override
  public void onBindViewHolder(BuildingTypeAdapter.ViewHolder viewHolder, int position) {
    final String buildingType = buildingTypes.get(position);

    int drawable;

    switch (buildingType.toLowerCase()) {
      case "base" :
        drawable = R.drawable.base;
        break;
      case "vehicle-factory" :
        drawable = R.drawable.VF;
        break;
      case "shooting-range" :
        drawable = R.drawable.SR;
        break;
      case "fighter-camp" :
        drawable = R.drawable.FC;
        break;
      default : // If it gets here, something wrong happened.
        drawable = 0;
        Log.e("buildingType switch", "Got to default case!");
    }

    viewHolder.DataModelName.setText(buildingType);
    viewHolder.DataModelImage.setImageResource(drawable);
  }

  @Override
  public int getItemCount() {
    return buildingTypes == null ? 0 : buildingTypes.size();
  }

  public void setClickListener(ItemClickListener itemClickListener) {
    this.clickListener = itemClickListener;
  }

  public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView DataModelName;
    private ImageView DataModelImage;

    private ViewHolder(View itemView) {
      super(itemView);
      DataModelName = itemView.findViewById(R.id.hour_name); // TODO: Create new view for building type name
      DataModelImage = itemView.findViewById(R.id.hour_image); // TODO: Create new view for building type image
      itemView.setTag(itemView);
      itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
      if (clickListener != null) clickListener.onClick(view, getAdapterPosition());
    }
  }
}