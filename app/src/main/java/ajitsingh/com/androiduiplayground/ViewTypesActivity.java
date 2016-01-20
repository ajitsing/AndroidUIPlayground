package ajitsingh.com.androiduiplayground;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ViewTypesActivity extends AppCompatActivity {
  public static final String VIEW_TO_LOAD = "viewToLoad";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.view_types);
  }

  public void showViewDetails(View view) {
    Intent intent = new Intent(this, DemoActivity.class);
    intent.putExtra(VIEW_TO_LOAD, R.layout.random_views);
    startActivity(intent);
  }

  public void showViewGroups(View view) {
    Intent intent = new Intent(this, ViewGroupsActivity.class);
    startActivity(intent);
  }

  public void startAnimationDemo(View view) {
    Intent intent = new Intent(this, Animation.class);
    startActivity(intent);
  }

  public void refreshView(View view) {
    Intent intent = new Intent(this, SwipeRefresh.class);
    startActivity(intent);
  }
}
