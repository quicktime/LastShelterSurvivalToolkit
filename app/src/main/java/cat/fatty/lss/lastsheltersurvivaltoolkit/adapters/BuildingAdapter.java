package cat.fatty.lss.lastsheltersurvivaltoolkit.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.BuildingModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.view.BuildingViewHolder;

public class BuildingAdapter extends RecyclerView.Adapter<BuildingViewHolder> {

  private List<BuildingModel> buildings;
  private int rowLayout;
  public static ItemClickListener clickListener;

  public BuildingAdapter(List<BuildingModel> buildings, int rowLayout) {
    this.buildings = buildings;
    this.rowLayout = rowLayout;
  }

  @NonNull
  @Override
  public BuildingViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
    View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
    return new BuildingViewHolder(v);
  }

  @Override
  public void onBindViewHolder(@NonNull BuildingViewHolder viewHolder, int position) {
    final BuildingModel building = buildings.get(position);

    int drawable;

    if (position % 2 == 0) {
      drawable = R.drawable.level_dark;
    } else {
      drawable = R.drawable.level_light;
    }
    viewHolder.getDataModelName().setText(String.valueOf(building.getLvl()));
    viewHolder.getDataModelImage().setImageResource(drawable);
  }

  @Override
  public int getItemCount() { return buildings == null ? 0 : buildings.size(); }

  public void setClickListener(ItemClickListener itemClickListener) {
    clickListener = itemClickListener;
  }
}
