package cat.fatty.lss.lastsheltersurvivaltoolkit.activities.buildings;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Objects;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.BuildingLevelAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.BuildingModel;

/**
 * Comes from BuildingActivity
 */
public class BuildingLevelActivity extends AppCompatActivity {
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_building_level);
    BuildingModel building = (BuildingModel) getIntent().getSerializableExtra("building");
    
    building.setResources();

    ImageView building_image = findViewById(R.id.building_level_type_image);
    building_image.setImageResource(building.getType().getDrawable());
    
    TextView building_type = findViewById(R.id.building_level_type_name);
    building_type.setText(building.getType().getType());
    
    TextView building_lvl = findViewById(R.id.building_level);
    building_lvl.setText(String.format("Level: %s", building.getLvl()));
    
    ImageView requirementsImage = findViewById(R.id.requirements);
    requirementsImage.setImageResource(R.drawable.requirements);
    
    RecyclerView mRecyclerView = findViewById(R.id.resources_grid);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    mRecyclerView.setItemAnimator(new DefaultItemAnimator());
    DividerItemDecoration itemDecorator = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
    itemDecorator.setDrawable(Objects.requireNonNull(ContextCompat.getDrawable(this, R.drawable.divider)));
    mRecyclerView.addItemDecoration(itemDecorator);

    BuildingLevelAdapter testAdapter = new BuildingLevelAdapter(building, R.layout.row_resources, this);
    mRecyclerView.setAdapter(testAdapter);
  }
}
