package cat.fatty.lss.lastsheltersurvivaltoolkit.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.BuildingTypeAdapter;

public class BuildingTypeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

  private TextView DataModelName;
  private ImageView DataModelImage;

  public BuildingTypeViewHolder(View itemView) {
    super(itemView);
    DataModelName = itemView.findViewById(R.id.building_type_name);
    DataModelImage = itemView.findViewById(R.id.building_type_image);
    itemView.setTag(itemView);
    itemView.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    if (BuildingTypeAdapter.clickListener != null) {
      BuildingTypeAdapter.clickListener.onClick(view, getAdapterPosition());
    }
  }

  public ImageView getDataModelImage() {
    return DataModelImage;
  }

  public TextView getDataModelName() {
    return DataModelName;
  }

  public void setDataModelImage(ImageView dataModelImage) {
    DataModelImage = dataModelImage;
  }

  public void setDataModelName(TextView dataModelName) {
    DataModelName = dataModelName;
  }
}
