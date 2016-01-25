package ajitsingh.com.androiduiplayground.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.List;

import ajitsingh.com.androiduiplayground.DeleteItemFragment;
import ajitsingh.com.androiduiplayground.ListItemFragment;

public class SwipeViewPageAdapter extends FragmentPagerAdapter {

  private final List<String> stringArray;
  private final int position;
  private final SwipeAdapter swipeAdapter;

  public SwipeViewPageAdapter(FragmentManager fm, List<String> stringArray, int position, SwipeAdapter swipeAdapter) {
    super(fm);
    this.stringArray = stringArray;
    this.position = position;
    this.swipeAdapter = swipeAdapter;
  }

  @Override
  public Fragment getItem(final int position) {
    if (position == 0) {
      ListItemFragment listItemFragment = new ListItemFragment();
      Bundle bundle = new Bundle();
      bundle.putString("value", stringArray.get(this.position));
      listItemFragment.setArguments(bundle);
      return listItemFragment;
    } else {
      final DeleteItemFragment deleteItemFragment = new DeleteItemFragment();
      Bundle bundle = new Bundle();
      bundle.putInt("position", this.position);
      deleteItemFragment.setArguments(bundle);
      deleteItemFragment.setAdapter(this);
      return deleteItemFragment;
    }
  }

  public void deleteItemFromList() {
    Log.d("delete", "View Page item:" + this.position);
    swipeAdapter.deleteItem(this.position);
  }

  @Override
  public int getCount() {
    return 2;
  }
}