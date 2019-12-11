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
    setContentView(R.layout.activity_city);
    BuildingModel building = (BuildingModel) getIntent().getSerializableExtra("building");

    GridView mGridView = findViewById(R.id.quests_grid);

    BuildingLevelAdapter mAdapter = new BuildingLevelAdapter(building, R.layout.row_buildings, this);
    mGridView.setAdapter(mAdapter);
  }
}
