package ajitsingh.com.androiduiplayground.adapter;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;

import ajitsingh.com.androiduiplayground.ListViewSwipe;
import ajitsingh.com.androiduiplayground.R;

public class SwipeAdapter extends ArrayAdapter {
  private final Context context;
  private ArrayList<String> objects;

  public SwipeAdapter(Context context, int resource, String[] objects) {
    super(context, resource);
    this.context = context;
    this.objects = new ArrayList<>(Arrays.asList(objects));
  }

  @Override
  public Object getItem(int position) {
    return objects.get(position);
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    final ViewPager viewPager = (ViewPager) inflater.inflate(R.layout.swipe_list_view_item, parent, false);
    FragmentManager supportFragmentManager = ((ListViewSwipe) context).getSupportFragmentManager();
    final SwipeViewPageAdapter adapter = new SwipeViewPageAdapter(supportFragmentManager, objects, position, this);
    viewPager.setAdapter(adapter);
    viewPager.setId(position + getCount() * 100);

    viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
      @Override
      public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

      }

      @Override
      public void onPageSelected(int position) {
        SwipeViewPageAdapter adapter = (SwipeViewPageAdapter) viewPager.getAdapter();
        if (position != 0) {
          adapter.deleteItemFromList();
        }
      }

      @Override
      public void onPageScrollStateChanged(int state) {

      }
    });

    return viewPager;
  }

  @Override
  public long getItemId(int position) {
    return position;
  }

  @Override
  public int getCount() {
    return objects.size();
  }

  public void deleteItem(final int position) {
    new Handler().postDelayed(new Runnable() {
      @Override
      public void run() {
        Log.d("delete", "item:" + position);
        objects.remove(position);
        notifyDataSetChanged();
      }
    }, 2000l);
  }
}
