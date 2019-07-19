package cat.fatty.lss.lastsheltersurvivaltoolkit.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.DayAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.ChallengeManager;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.ChallengeModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;

public class DayActivity extends AppCompatActivity implements ItemClickListener {

  private RecyclerView mRecyclerView;
  private DayAdapter mAdapter;
  private List<ChallengeModel> challenges;

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_city);
    String day = getIntent().getStringExtra("day");
    challenges = new ChallengeManager(day).getChallenges();

    mRecyclerView = findViewById(R.id.list);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    mRecyclerView.setItemAnimator(new DefaultItemAnimator());

    mAdapter = new DayAdapter(challenges, R.layout.row_hours, this);
    mRecyclerView.setAdapter(mAdapter);
    mAdapter.setClickListener(this);
  }

  @Override
  public void onClick(View view, int position) {
    final ChallengeModel challenge = challenges.get(position);
    Intent intent = new Intent(this, ChallengeActivity.class);
    intent.putExtra("challenge", challenge);
    intent.putExtra("hour", position);
    startActivity(intent);
  }
}