package cat.fatty.lss.lastsheltersurvivaltoolkit.activities.heroes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;

/**
 * This class will be a navigation page for users to select different areas of heroes.
 * The different areas for hero information is as follows:
 * <p>
 * XP needed for each level upgrade
 * Hero List
 * Regular
 * S1
 * S2
 * Etc
 * Guides
 * Setup
 * Skill upgrade order
 * In-depth Explanations
 */
public class HeroNavActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_hero_nav);
  }
}
