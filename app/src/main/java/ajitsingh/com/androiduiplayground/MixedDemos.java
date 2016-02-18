package ajitsingh.com.androiduiplayground;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MixedDemos extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.mixed_demos);
  }

  public void startAnimationDemo(View view) {
    Intent intent = new Intent(this, Animation.class);
    startActivity(intent);
  }

  public void refreshView(View view) {
    Intent intent = new Intent(this, SwipeRefresh.class);
    startActivity(intent);
  }

  public void listViewSwipe(View view) {
    Intent intent = new Intent(this, ListViewSwipe.class);
    startActivity(intent);
  }

  public void stackedView(View view) {
    Intent intent = new Intent(this, StackedViewActivity.class);
    startActivity(intent);
  }
}
