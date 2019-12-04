package cat.fatty.lss.lastsheltersurvivaltoolkit.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import cat.fatty.lss.lastsheltersurvivaltoolkit.LayoutManagers.AutoFitGridLayoutManager;
import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.MainAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.SelectionModel;

public class MainActivity extends AppCompatActivity implements MainAdapter.ItemListener {

  RecyclerView recyclerView;
  ArrayList<SelectionModel> arrayList;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    recyclerView = findViewById(R.id.recyclerView);
    arrayList = new ArrayList<>();
    arrayList.add(new SelectionModel("Item 1", R.drawable.battle, "#09A9FF", WeekActivity.class));
    arrayList.add(new SelectionModel("Item 2", R.drawable.beer, "#3E51B1", WeekActivity.class));
    arrayList.add(new SelectionModel("Item 3", R.drawable.ferrari, "#673BB7", WeekActivity.class));
    arrayList.add(new SelectionModel("Item 4", R.drawable.jetpack_joyride, "#4BAA50", WeekActivity.class));
    arrayList.add(new SelectionModel("Item 5", R.drawable.three_d, "#F94336", WeekActivity.class));
    arrayList.add(new SelectionModel("Item 6", R.drawable.terraria, "#0A9B88", BuildingTypeActivity.class));

    MainAdapter adapter = new MainAdapter(this, arrayList, this);
    recyclerView.setAdapter(adapter);

    AutoFitGridLayoutManager layoutManager = new AutoFitGridLayoutManager(this, 500);
    recyclerView.setLayoutManager(layoutManager);
  }

  @Override
  public void onItemClick(SelectionModel item) {
    Toast.makeText(getApplicationContext(), item.getText() + " is clicked", Toast.LENGTH_SHORT).show();
    Intent i = new Intent(this, item.getAClass());
    startActivity(i);
  }
}
