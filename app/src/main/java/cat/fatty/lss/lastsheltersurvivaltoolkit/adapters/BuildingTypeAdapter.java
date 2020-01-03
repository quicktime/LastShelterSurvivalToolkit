package cat.fatty.lss.lastsheltersurvivaltoolkit.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
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

    int drawable;

    switch (buildingType.getType().toLowerCase()) {
      case "base" :
        drawable = R.drawable.base;
        break;
      case "ration truck":
        drawable = R.drawable.ration_truck;
        break;
      case "vehicle factory" :
        drawable = R.drawable.vf;
        break;
      case "shooting range" :
        drawable = R.drawable.sr;
        break;
      case "fighter camp" :
        drawable = R.drawable.fc;
        break;
      default : // If it gets here, something wrong happened.
        drawable = 0;
        Log.e("buildingTypeAdapter switch", "Got to default case!");
    }

    viewHolder.getDataModelName().setText(buildingType.getType());
    viewHolder.getDataModelImage().setImageResource(drawable);
  }

  @Override
  public int getItemCount() {
    return buildingTypes == null ? 0 : buildingTypes.size();
  }

  public void setClickListener(ItemClickListener itemClickListener) {
    clickListener = itemClickListener;
  }


}