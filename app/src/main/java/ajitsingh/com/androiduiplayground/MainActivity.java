package ajitsingh.com.androiduiplayground;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
  public static final String VIEW_TO_LOAD = "viewToLoad";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void showLinearHorizontalLayout(View view) {
    Intent intent = new Intent(this, DemoActivity.class);
    intent.putExtra(VIEW_TO_LOAD, R.layout.linear_horizontal);

    startActivity(intent);
  }
}
