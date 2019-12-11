package cat.fatty.lss.lastsheltersurvivaltoolkit.activities;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.BuildingLevelAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.BuildingModel;

public class BuildingLevelActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_building_level);
    BuildingModel building = (BuildingModel) getIntent().getSerializableExtra("building");

    building.setResources();

    BuildingLevelAdapter mAdapter = new BuildingLevelAdapter(building, R.layout.row_resources, this);

    GridView mGridView = findViewById(R.id.resources_grid);
    mGridView.setAdapter(mAdapter);
  }
}
