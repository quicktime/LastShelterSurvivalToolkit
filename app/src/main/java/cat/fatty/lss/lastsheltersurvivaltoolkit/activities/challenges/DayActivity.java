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
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.DayAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;
import cat.fatty.lss.lastsheltersurvivaltoolkit.managers.ChallengeManager;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.ChallengeModel;

/**
 * From WeekActivity
 */
public class DayActivity extends AppCompatActivity implements ItemClickListener {
  
  ArrayList<ChallengeModel> challengeList;
  private String day;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_city);
    day = getIntent().getStringExtra("day");

    ChallengeManager challengeManager = new ChallengeManager(this, day);
    challengeList = challengeManager.getManagedChallenges();

    RecyclerView mRecyclerView = findViewById(R.id.list);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    mRecyclerView.setItemAnimator(new DefaultItemAnimator());

    DayAdapter mAdapter = new DayAdapter(challengeList, R.layout.row_hours, this);
    mRecyclerView.setAdapter(mAdapter);
    mAdapter.setClickListener(this);
  }
  
  @Override
  public void onClick(View view, int position) {
    Intent intent = new Intent(this, ChallengeActivity.class);
    intent.putExtra("day", day);
    intent.putExtra("hour", position);
    startActivity(intent);
  }
}