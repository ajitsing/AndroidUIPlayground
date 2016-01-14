package ajitsingh.com.androiduiplayground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Animation extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.animation_demo);
  }

  public void animate(View view) {
    RelativeLayout animationContainer = (RelativeLayout) findViewById(R.id.animation_container);
    TransitionManager.beginDelayedTransition(animationContainer);

    Button button = (Button) findViewById(R.id.button);
    RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
      ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
    params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
    button.setLayoutParams(params);
  }
}
