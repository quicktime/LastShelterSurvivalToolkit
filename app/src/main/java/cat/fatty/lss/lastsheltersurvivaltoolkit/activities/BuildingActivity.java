package cat.fatty.lss.lastsheltersurvivaltoolkit.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;

public class BuildingActivity extends AppCompatActivity implements ItemClickListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_city);
//    buildingTypes = new BuildingTypeManager().getBuildingTypes();

    RecyclerView mRecyclerView = findViewById(R.id.list);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    mRecyclerView.setItemAnimator(new DefaultItemAnimator());

//    BuildingTypeAdapter mAdapter = new BuildingTypeAdapter(buildingTypes, R.layout.row_building_types, this);
//    mRecyclerView.setAdapter(mAdapter);
//    mAdapter.setClickListener(this);
  }

  @Override
  public void onClick(View view, int position) {
//    final BuildingTypeModel type = buildingTypes.get(position);
    Intent intent = new Intent(this, BuildingActivity.class);
//    intent.putExtra("type", type.getType());
    startActivity(intent);
  }
}
