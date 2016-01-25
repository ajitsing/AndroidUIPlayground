package ajitsingh.com.androiduiplayground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import ajitsingh.com.androiduiplayground.adapter.SwipeAdapter;

public class ListViewSwipe extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.list_view_swipe);

    ListView listView = (ListView) findViewById(R.id.list);
    listView.setAdapter(new SwipeAdapter(this, R.layout.swipe_list_view_item, getResources().getStringArray(R.array.dummy_list)));
  }
}
