package cat.fatty.lss.lastsheltersurvivaltoolkit.view;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.MainAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.SelectionModel;

public class SelectionViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

  private TextView textView;
  private ImageView imageView;
  private RelativeLayout relativeLayout;
  private SelectionModel item;

  public SelectionViewHolder(View v) {
    super(v);

    v.setOnClickListener(this);
    textView = v.findViewById(R.id.textView);
    imageView = v.findViewById(R.id.imageView);
    relativeLayout = v.findViewById(R.id.relativeLayout);
  }

  public void setData(SelectionModel item) {
    this.item = item;

    textView.setText(item.getText());
    imageView.setImageResource(item.getDrawable());
    relativeLayout.setBackgroundColor(Color.parseColor(item.getColor()));
  }

  @Override
  public void onClick(View view) {
    if (MainAdapter.mListener != null) {
      MainAdapter.mListener.onItemClick(item);
    }
  }
}