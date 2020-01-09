package cat.fatty.lss.lastsheltersurvivaltoolkit.activities.challenges;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.ChallengeAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.managers.ChallengeManager;
import cat.fatty.lss.lastsheltersurvivaltoolkit.managers.QuestManager;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.ChallengeModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.QuestModel;

/**
 * From DayActivity
 */
public class ChallengeActivity extends AppCompatActivity {

  ArrayList<ChallengeModel> challengeList;
  private String intentDay;
  private int intentHour;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_challenge);

    intentDay = getIntent().getStringExtra("day");
    intentHour = getIntent().getIntExtra("hour", 0);

    ChallengeManager challengeManager = new ChallengeManager(this, intentDay);
    challengeList = challengeManager.getManagedChallenges();

    ChallengeModel challenge = challengeList.get(intentHour);
    ArrayList<QuestModel> quests = new QuestManager(challenge).getQuests();

    RecyclerView mRecyclerView = findViewById(R.id.quests_grid);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    mRecyclerView.setItemAnimator(new DefaultItemAnimator());
    
    ChallengeAdapter mAdapter = new ChallengeAdapter(quests, R.layout.row_quests, this);
    mRecyclerView.setAdapter(mAdapter);

//  Alarm Clock FAB
    FloatingActionButton mFab = findViewById(R.id.alarm_fab);
    mFab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(ChallengeActivity.this, AlarmActivity.class);
        intent.putExtra("hour", intentHour);
        intent.putExtra("day", intentDay);
        startActivity(intent);
        finish();
      }
    });
  }
}
