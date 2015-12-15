package ajitsingh.com.androiduiplayground;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static ajitsingh.com.androiduiplayground.ViewTypesActivity.VIEW_TO_LOAD;

public class ViewGroupsActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.view_groups);
  }

  public void showLinearHorizontalLayout(View view) {
    startDemo(R.layout.linear_horizontal);
  }

  public void showLinearVerticalLayout(View view) {
    startDemo(R.layout.linear_vertical);
  }

  public void showTableLayout(View view) {
    startDemo(R.layout.table_layout);
  }

  public void showRelativeLayout(View view) {
    startDemo(R.layout.relative_layout);
  }

  public void showScrollLayout(View view) {
    startDemo(R.layout.scroll_layout);
  }

  public void showFrameLayout(View view) {
    startDemo(R.layout.frame_layout);
  }

  private void startDemo(int layout) {
    Intent intent = new Intent(this, DemoActivity.class);
    intent.putExtra(VIEW_TO_LOAD, layout);

    startActivity(intent);
  }
}
