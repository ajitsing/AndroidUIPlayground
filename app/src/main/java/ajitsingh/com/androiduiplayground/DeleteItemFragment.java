package ajitsingh.com.androiduiplayground;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ajitsingh.com.androiduiplayground.adapter.SwipeViewPageAdapter;

public class DeleteItemFragment extends Fragment {
  private SwipeViewPageAdapter adapter;

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    return inflater.inflate(R.layout.delete_list_item, container, false);
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
//    int position = getArguments().getInt("position");
//    adapter.deleteItemFromList(position);
  }


  public void setAdapter(SwipeViewPageAdapter adapter) {
    this.adapter = adapter;
  }
}
