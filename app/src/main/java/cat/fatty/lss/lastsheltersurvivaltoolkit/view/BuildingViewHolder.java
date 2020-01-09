package cat.fatty.lss.lastsheltersurvivaltoolkit.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.BuildingAdapter;

public class BuildingViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

  private TextView DataModelName;
  private ImageView DataModelImage;

  public BuildingViewHolder(View itemView) {
    super(itemView);
    DataModelName = itemView.findViewById(R.id.building_name);
    DataModelImage = itemView.findViewById(R.id.building_image);
    itemView.setTag(itemView);
    itemView.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    if (BuildingAdapter.clickListener != null) {
      BuildingAdapter.clickListener.onClick(view, getAdapterPosition());
    }
  }

  public ImageView getDataModelImage() {
    return DataModelImage;
  }

  public TextView getDataModelName() {
    return DataModelName;
  }
}
