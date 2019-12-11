package cat.fatty.lss.lastsheltersurvivaltoolkit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Locale;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.BuildingModel;

public class BuildingLevelAdapter extends BaseAdapter {

  private BuildingModel building;
  private int mLayout;
  private Context mContext;

  public BuildingLevelAdapter(BuildingModel building, int layout, Context context) {
    this.building = building;
    this.mLayout = layout;
    this.mContext = context;
  }

  @Override
  public int getCount() {
    return building.getSize();
  }

  @Override
  public Object getItem(int i) {
    return i;
  }

  @Override
  public long getItemId(int i) {
    return i;
  }

  @Override
  public View getView(int i, View view, ViewGroup viewGroup) {
    if (view == null) {

      view = LayoutInflater.from(viewGroup.getContext()).inflate(mLayout, viewGroup, false);
      if (i % 2 == 0) {
        view.setBackgroundColor(mContext.getColor(R.color.even_quest_bg));
      } else {
        view.setBackgroundColor(mContext.getColor(R.color.odd_quest_bg));
      }
      TextView questName = view.findViewById(R.id.quest_name);
      TextView questReward = view.findViewById(R.id.quest_reward);

      questName.setText(building.getResources().get(i).getName());
      questReward.setText(String.format(Locale.getDefault(), "+ %d", building.getResources().get(i).getQuantRequired()));
    }
    return view;
  }


}