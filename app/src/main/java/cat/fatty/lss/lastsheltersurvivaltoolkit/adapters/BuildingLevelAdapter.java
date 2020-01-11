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
  private Context context;

  public BuildingLevelAdapter(BuildingModel building, int rowLayout, Context context) {
    this.building = building;
    this.rowLayout = rowLayout;
    this.context = context;
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

    viewHolder.getResourceImage().setImageResource(resource.getDrawable());

    String quantRequired;
    if (resource.getQuantRequired() == 1) {
      quantRequired = context.getResources().getString(R.string.missing_data);
    } else {
      quantRequired = NumberFormat.getNumberInstance(Locale.getDefault()).format(resource.getQuantRequired());
    }

    viewHolder.getResourceAmount().setText(quantRequired);
    viewHolder.getResourceCheck().setImageResource(R.drawable.checkmark);
  }

  @Override
  public int getItemCount() {
    return building.getSize();
  }
}