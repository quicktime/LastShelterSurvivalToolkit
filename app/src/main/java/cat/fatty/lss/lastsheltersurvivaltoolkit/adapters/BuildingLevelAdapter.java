package cat.fatty.lss.lastsheltersurvivaltoolkit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.Locale;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.BuildingModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.ResourceModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.view.BuildingLevelViewHolder;

public class BuildingLevelAdapter extends RecyclerView.Adapter<BuildingLevelViewHolder> {

  private BuildingModel building;
  private int rowLayout;

  public BuildingLevelAdapter(BuildingModel building, int rowLayout, Context context) {
    this.building = building;
    this.rowLayout = rowLayout;
  }

  @NonNull
  @Override
  public BuildingLevelViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
    View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
    return new BuildingLevelViewHolder(v);
  }

  @Override
  public void onBindViewHolder(@NonNull BuildingLevelViewHolder viewHolder, int position) {
    final ResourceModel resource = building.getReqResources().get(position);

    viewHolder.getResourceAmount().setText(NumberFormat.getNumberInstance(Locale.getDefault()).format(resource.getQuantRequired()));
    viewHolder.getResourceImage().setImageResource(resource.getDrawable());
    viewHolder.getResourceCheck().setImageResource(R.drawable.checkmark2);
  }

  @Override
  public int getItemCount() {
    return building.getSize();
  }
}