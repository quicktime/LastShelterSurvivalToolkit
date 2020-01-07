package cat.fatty.lss.lastsheltersurvivaltoolkit.activities.challenges;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.DayAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.listeners.ItemClickListener;
import cat.fatty.lss.lastsheltersurvivaltoolkit.managers.ChallengeManager;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.ChallengeModel;

public class DayActivity extends AppCompatActivity implements ItemClickListener {
  
  private List<ChallengeModel> challenges;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_city);
    String day = getIntent().getStringExtra("day");
    challenges = new ChallengeManager(day).getChallenges();
    
    RecyclerView mRecyclerView = findViewById(R.id.list);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    mRecyclerView.setItemAnimator(new DefaultItemAnimator());
    
    DayAdapter mAdapter = new DayAdapter(challenges, R.layout.row_hours, this);
    mRecyclerView.setAdapter(mAdapter);
    mAdapter.setClickListener(this);
  }
  
  @Override
  public void onClick(View view, int position) {
    final ChallengeModel challenge = challenges.get(position);
    Intent intent = new Intent(this, ChallengeActivity.class);
    String day = getIntent().getStringExtra("day");
    intent.putExtra("day", day);
    intent.putExtra("challenge", challenge);
    intent.putExtra("hour", position);
    startActivity(intent);
  }
}