package ajitsingh.com.androiduiplayground;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import static ajitsingh.com.androiduiplayground.MainActivity.VIEW_TO_LOAD;

public class DemoActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.demo);

    Intent intent = getIntent();
    int layout = intent.getIntExtra(VIEW_TO_LOAD, 0);

    FrameLayout frame = (FrameLayout) findViewById(R.id.main_frame);
    frame.removeAllViews();

    LayoutInflater inflator = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
    frame.addView(inflator.inflate(layout, null));
  }
}
