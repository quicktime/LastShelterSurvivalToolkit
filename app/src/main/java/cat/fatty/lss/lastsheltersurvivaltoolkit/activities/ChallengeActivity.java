package cat.fatty.lss.lastsheltersurvivaltoolkit.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.GridView;

import java.util.ArrayList;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.ChallengeAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.ChallengeModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.QuestManager;
import cat.fatty.lss.lastsheltersurvivaltoolkit.engine.QuestModel;

public class ChallengeActivity extends AppCompatActivity {

  private GridView mGridView;
  private ChallengeAdapter mAdapter;
  private ArrayList<QuestModel> quests;

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_challenge);
    ChallengeModel challenge = (ChallengeModel) getIntent().getSerializableExtra("challenge");
    quests = new QuestManager(challenge).getQuests();
    Log.i("ChallengeActivity#onCreate", Integer.toString(challenge.getQuestNum()));
    Log.i("ChallengeActivity#onCreate", quests.get(0).getName());

    mGridView = findViewById(R.id.quests_grid);
    mAdapter = new ChallengeAdapter(quests, R.layout.row_quests, this);
    mGridView.setAdapter(mAdapter);
  }
}
