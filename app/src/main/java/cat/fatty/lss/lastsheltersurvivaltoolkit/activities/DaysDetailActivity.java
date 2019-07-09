package cat.fatty.lss.lastsheltersurvivaltoolkit.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import cat.fatty.lss.lastsheltersurvivaltoolkit.R;

public class DaysDetailActivity extends AppCompatActivity {
  private TextView tvCityName;
  private TextView tvCityDesc;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_city_view);

    Toolbar toolbar = findViewById(R.id.toolbar);
    toolbar.setBackground(getResources().getDrawable(getResources().getIdentifier(getIntent().getStringExtra("image"), "drawable", getPackageName()), null));

    tvCityName = findViewById(R.id.tv_city_name);
    tvCityName.setText(getIntent().getStringExtra("city"));
    tvCityDesc = findViewById(R.id.tv_city_desc);
    tvCityDesc.setText(getIntent().getStringExtra("desc"));

  }
}
