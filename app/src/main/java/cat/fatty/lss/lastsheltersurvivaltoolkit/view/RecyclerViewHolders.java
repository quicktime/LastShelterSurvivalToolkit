package cat.fatty.lss.lastsheltersurvivaltoolkit.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

  public TextView textView;
  public ImageView imageView;

  public RecyclerViewHolders(View itemView) {
    super(itemView);
    itemView.setOnClickListener(this);
    textView = itemView.findViewById(R.id.textView);
    imageView = itemView.findViewById(R.id.imageView);
  }

  @Override
  public void onClick(View view) {
    Toast.makeText(view.getContext(), "Clicked item " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
  }
}
