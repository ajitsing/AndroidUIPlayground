package ajitsingh.com.androiduiplayground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class StackedViewActivity extends AppCompatActivity {
  final int[] colors = {R.color.colorPrimary, R.color.accent_material_dark, R.color.abc_search_url_text_normal};
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.stacked_view);

    final FrameLayout stackedViewContainer = (FrameLayout) findViewById(R.id.stackedViewContainer);
    stackedViewContainer.addView(getView(stackedViewContainer));
    stackedViewContainer.addView(getView(stackedViewContainer));
    stackedViewContainer.addView(getView(stackedViewContainer));
  }

  public View getView(FrameLayout parent) {
    LayoutInflater inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
    TextView textView = (TextView) inflater.inflate(R.layout.stacked_text_view, parent, false);
    FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);

    final int childCount = parent.getChildCount();
    final int margin = 20 * childCount;
    params.topMargin = margin;
    params.leftMargin = margin;
    textView.setLayoutParams(params);
    textView.setBackgroundResource(colors[childCount]);
    textView.setText("With Margin: " + margin + ", Child:" + childCount);

    return textView;
  }
}
