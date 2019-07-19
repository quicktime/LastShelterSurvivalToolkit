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

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.WeekAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.DayManager;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.DayModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;

public class WeekActivity extends AppCompatActivity implements ItemClickListener {

  private RecyclerView mRecyclerView;
  private WeekAdapter mAdapter;
  private ArrayList<DayModel> days;

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_city);
    days = new DayManager(this.getApplicationContext()).getDays();

    mRecyclerView = findViewById(R.id.list);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    mRecyclerView.setItemAnimator(new DefaultItemAnimator());

    mAdapter = new WeekAdapter(days, R.layout.row_days, this);
    mRecyclerView.setAdapter(mAdapter);
    mAdapter.setClickListener(this);
  }

  @Override
  public void onClick(View view, int position) {
    final DayModel day = days.get(position);
    Intent i = new Intent(this, DayActivity.class);
    i.putExtra("day", day.name);
    i.putExtra("image", day.imageName);
    Log.i("hello", day.name);
    startActivity(i);
  }
}