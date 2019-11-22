package cat.fatty.lss.lastsheltersurvivaltoolkit.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.BuildingTypeAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;
import cat.fatty.lss.lastsheltersurvivaltoolkit.managers.BuildingTypeManager;

public class BuildingTypeActivity extends AppCompatActivity implements ItemClickListener {

  private RecyclerView mRecyclerView;
  private BuildingTypeAdapter mAdapter;
  private List<String> buildingTypes;

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_city);
    buildingTypes = new BuildingTypeManager().getBuildingTypes();

    mRecyclerView = findViewById(R.id.list);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    mRecyclerView.setItemAnimator(new DefaultItemAnimator());

    mAdapter = new BuildingTypeAdapter(buildingTypes, R.layout.row_building_types, this); // TODO: Create a new layout
    mRecyclerView.setAdapter(mAdapter);
    mAdapter.setClickListener(this);
  }

  @Override
  public void onClick(View view, int position) {
    final String type = buildingTypes.get(position);
    Intent intent = new Intent(this, BuildingActivity.class);
    intent.putExtra("type", type);
    startActivity(intent);
  }
}