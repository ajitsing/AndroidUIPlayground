package ajitsingh.com.androiduiplayground;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ListItemFragment extends Fragment {

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    final String value = getArguments().getString("value");
    final LinearLayout view = (LinearLayout) inflater.inflate(R.layout.list_item, container, false);
    TextView textView = (TextView) view.findViewById(R.id.text);
    textView.setText(value);
    return view;
  }
}
