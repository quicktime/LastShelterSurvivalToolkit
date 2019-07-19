package cat.fatty.lss.lastsheltersurvivaltoolkit.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;

import java.util.ArrayList;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.ChallengeAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.ChallengeModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.QuestManager;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.QuestModel;

public class ChallengeActivity extends AppCompatActivity {

  private GridView mGridView;
  private FloatingActionButton mFab;
  private ChallengeAdapter mAdapter;
  private ArrayList<QuestModel> quests;

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_challenge);
    ChallengeModel challenge = (ChallengeModel) getIntent().getSerializableExtra("challenge");
    quests = new QuestManager(challenge).getQuests();

    mGridView = findViewById(R.id.quests_grid);

    mFab = findViewById(R.id.alarm_fab);
    mFab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(ChallengeActivity.this, AlarmActivity.class);
        intent.putExtra("hour", getIntent().getIntExtra("hour", 0));
        startActivity(intent);
      }
    });

    mAdapter = new ChallengeAdapter(quests, R.layout.row_quests, this);
    mGridView.setAdapter(mAdapter);
  }
}
