package cat.fatty.lss.lastsheltersurvivaltoolkit.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.BuildingAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;
import cat.fatty.lss.lastsheltersurvivaltoolkit.managers.BuildingManager;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.BuildingModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.BuildingTypeModel;

public class BuildingActivity extends AppCompatActivity implements ItemClickListener {

  private ArrayList<BuildingModel> buildings;

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_city);
    BuildingTypeModel buildingType = (BuildingTypeModel) getIntent().getSerializableExtra("type");
    buildings = new BuildingManager(buildingType).getBuildings();

    RecyclerView mRecyclerView = findViewById(R.id.list);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    mRecyclerView.setItemAnimator(new DefaultItemAnimator());

    BuildingAdapter mAdapter = new BuildingAdapter(buildings, R.layout.row_buildings);
    mRecyclerView.setAdapter(mAdapter);
    mAdapter.setClickListener(this);
  }

  @Override
  public void onClick(View view, int position) {
    final BuildingModel building = buildings.get(position);
    Intent intent = new Intent(this, BuildingActivity.class);
    intent.putExtra("building", building);
    intent.putExtra("level", position);
    startActivity(intent);
  }
}
