package cat.fatty.lss.lastsheltersurvivaltoolkit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.SelectionModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.view.SelectionViewHolder;


public class MainAdapter extends RecyclerView.Adapter<SelectionViewHolder> {

  private ArrayList<SelectionModel> mValues;
  private Context mContext;
  public static ItemListener mListener;

  public MainAdapter(Context context, ArrayList<SelectionModel> values, ItemListener itemListener) {
    mValues = values;
    mContext = context;
    mListener = itemListener;
  }

  @NonNull
  @Override
  public SelectionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(mContext).inflate(R.layout.recycler_view_item, parent, false);

    return new SelectionViewHolder(view);
  }

  @Override
  public void onBindViewHolder(SelectionViewHolder viewHolder, int position) {
    viewHolder.setData(mValues.get(position));
  }

  @Override
  public int getItemCount() {
    return mValues.size();
  }

  public interface ItemListener {
    void onItemClick(SelectionModel item);
  }
}
