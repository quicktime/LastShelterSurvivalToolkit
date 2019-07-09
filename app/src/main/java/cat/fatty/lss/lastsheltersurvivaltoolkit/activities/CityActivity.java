package cat.fatty.lss.lastsheltersurvivaltoolkit.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.List;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.DaysAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.CityManager;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.DayManager;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.DayModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;

public class CityActivity extends AppCompatActivity implements ItemClickListener {

  private RecyclerView mRecyclerView;
  private DaysAdapter mAdapter;
  private List<DayModel> cities;

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_city);
    cities = new CityManager(this.getApplicationContext()).getCites();
    mRecyclerView = findViewById(R.id.list);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    mRecyclerView.setItemAnimator(new DefaultItemAnimator());

    mAdapter = new DaysAdapter(cities, R.layout.row_city, this);
    mRecyclerView.setAdapter(mAdapter);
    mAdapter.setClickListener(this);
  }

  @Override
  public void onClick(View view, int position) {
    final DayModel city = cities.get(position);
    Intent i = new Intent(this, HoursActivity.class);
    i.putExtra("city", city.name);
    i.putExtra("image", city.imageName);
    Log.i("hello", city.name);
    startActivity(i);
  }
}