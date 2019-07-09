package cat.fatty.lss.lastsheltersurvivaltoolkit.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.HoursAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.HourManager;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.ChallengeModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.HourModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;

public class HoursActivity extends AppCompatActivity implements ItemClickListener {

  private RecyclerView mRecyclerView;
  private HoursAdapter mAdapter;
  private List<HourModel> hours;

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_city);
    hours = new HourManager(this.getApplicationContext()).getHours(getIntent().getStringExtra("day"));

    mRecyclerView = findViewById(R.id.list);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    mRecyclerView.setItemAnimator(new DefaultItemAnimator());

    mAdapter = new HoursAdapter(hours, R.layout.row_hours, this);
    mRecyclerView.setAdapter(mAdapter);
    mAdapter.setClickListener(this);
  }

  @Override
  public void onClick(View view, int position) {
    final HourModel hour = hours.get(position);
    Intent i = new Intent(this, ChallengeActivity.class);
    i.putExtra("city", hour.name);
    i.putExtra("desc", hour.challenge);
    i.putExtra("image", hour.imageName);
    Log.i("hello", hour.name);
    startActivity(i);
  }
}
