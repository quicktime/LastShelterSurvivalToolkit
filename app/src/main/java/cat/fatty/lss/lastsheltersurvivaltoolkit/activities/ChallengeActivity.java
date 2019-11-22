package cat.fatty.lss.lastsheltersurvivaltoolkit.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;
import cat.fatty.lss.lastsheltersurvivaltoolkit.adapters.ChallengeAdapter;
import cat.fatty.lss.lastsheltersurvivaltoolkit.managers.QuestManager;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.ChallengeModel;
import cat.fatty.lss.lastsheltersurvivaltoolkit.models.QuestModel;

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

    // Alarm Clock FAB
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
