package cat.fatty.lss.lastsheltersurvivaltoolkit.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;

public class BuildingLevelViewHolder extends RecyclerView.ViewHolder {

  private TextView resourceAmount;
  private ImageView resourceImage;
  private ImageView resourceCheck;

  public BuildingLevelViewHolder(View itemView) {
    super(itemView);
    resourceAmount = itemView.findViewById(R.id.resource_amount);
    resourceImage = itemView.findViewById(R.id.resource_image);
    resourceCheck = itemView.findViewById(R.id.resource_check);
    itemView.setTag(itemView);
  }

  public ImageView getResourceImage() {
    return resourceImage;
  }

  public TextView getResourceAmount() {
    return resourceAmount;
  }

  public ImageView getResourceCheck() {
    return resourceCheck;
  }
}