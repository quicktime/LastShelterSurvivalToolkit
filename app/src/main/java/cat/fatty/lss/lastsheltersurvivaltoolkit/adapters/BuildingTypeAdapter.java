package cat.fatty.lss.lastsheltersurvivaltoolkit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.BuildingTypeModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.view.BuildingTypeViewHolder;

public class BuildingTypeAdapter extends RecyclerView.Adapter<BuildingTypeViewHolder> {

  private List<BuildingTypeModel> buildingTypes;
  private int rowLayout;
  public static ItemClickListener clickListener;

  public BuildingTypeAdapter(List<BuildingTypeModel> buildingTypes, int rowLayout, Context context) {
    this.buildingTypes = buildingTypes;
    this.rowLayout = rowLayout;
  }

  @NonNull
  @Override
  public BuildingTypeViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
    View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
    return new BuildingTypeViewHolder(v);
  }

  @Override
  public void onBindViewHolder(@NonNull BuildingTypeViewHolder viewHolder, int position) {
    final BuildingTypeModel buildingType = buildingTypes.get(position);

    viewHolder.getDataModelName().setText(buildingType.getType());
    viewHolder.getDataModelImage().setImageResource(buildingType.getDrawable());
  }

  @Override
  public int getItemCount() {
    return buildingTypes == null ? 0 : buildingTypes.size();
  }

  public void setClickListener(ItemClickListener itemClickListener) {
    clickListener = itemClickListener;
  }
}