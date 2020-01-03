package cat.fatty.lss.lastsheltersurvivaltoolkit.activities.buildings;

import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

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
    
    int drawable;
    
    switch (building.getType().getType().toLowerCase()) {
      case "base":
        drawable = R.drawable.base;
        break;
      case "vehicle factory":
        drawable = R.drawable.vf;
        break;
      case "shooting range":
        drawable = R.drawable.sr;
        break;
      case "fighter camp":
        drawable = R.drawable.fc;
        break;
      default: // If it gets here, something wrong happened.
        drawable = 0;
        Log.e("BuildingLevelActivity switch", "Got to default case!");
    }
    
    ImageView building_image = findViewById(R.id.building_level_type_image);
    building_image.setImageResource(drawable);
    
    TextView building_type = findViewById(R.id.building_level_type_name);
    building_type.setText(building.getType().getType());
    
    TextView building_lvl = findViewById(R.id.building_level);
    building_lvl.setText(String.format("Level: %s", building.getLvl()));
    
    ImageView requirementsImage = findViewById(R.id.requirements);
    requirementsImage.setImageResource(R.drawable.requirements); // TODO: crop out the requirements image
    
    BuildingLevelAdapter mAdapter = new BuildingLevelAdapter(building, R.layout.row_resources, this);
    GridView mGridView = findViewById(R.id.resources_grid);
    mGridView.setAdapter(mAdapter);
  }
}
