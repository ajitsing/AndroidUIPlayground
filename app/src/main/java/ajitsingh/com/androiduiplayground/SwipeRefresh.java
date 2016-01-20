package ajitsingh.com.androiduiplayground;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;

public class SwipeRefresh extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.swip_refresh);

    final SwipeRefreshLayout swipeToRefreshContainer = (SwipeRefreshLayout) findViewById(R.id.swip_refresh_layout);
    swipeToRefreshContainer.setColorScheme(R.color.link_text_material_light);
    swipeToRefreshContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
      @Override
      public void onRefresh() {
        new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
            swipeToRefreshContainer.setRefreshing(false);
          }
        }, 5000l);
      }
    });
  }
}
