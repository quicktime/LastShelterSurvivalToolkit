package cat.fatty.lss.lastsheltersurvivaltoolkit.activities.challenges;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.WeekAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;
import cat.fatty.lss.lastsheltersurvivaltoolkit.managers.DayManager;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.DayModel;

public class WeekActivity extends AppCompatActivity implements ItemClickListener {
  
  private ArrayList<DayModel> days;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    RecyclerView mRecyclerView;
    WeekAdapter mAdapter;
    
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
    startActivity(i);
  }
}