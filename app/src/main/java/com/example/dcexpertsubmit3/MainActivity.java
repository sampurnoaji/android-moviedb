package com.example.dcexpertsubmit3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.dcexpertsubmit3.adapter.ViewPagerAdapter;
import com.example.dcexpertsubmit3.fragment.MovieFragment;
import com.example.dcexpertsubmit3.fragment.TvshowFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getString(R.string.title_main));
        setupTabLayout();
    }

    private void setupTabLayout() {
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager viewPager = findViewById(R.id.viewPager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapter.addFragment(new MovieFragment(), getString(R.string.movies));
        adapter.addFragment(new TvshowFragment(), getString(R.string.tv_shows));

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.menu_bahasa:
                Intent intentBhs = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                startActivity(intentBhs);
                break;
            case R.id.menu_favorite:
                Intent intentFav = new Intent(MainActivity.this, FavoriteActivity.class);
                startActivity(intentFav);
                break;
            case R.id.menu_alarm:
                Intent intentAlarm = new Intent(MainActivity.this, SetAlarmActivity.class);
                startActivity(intentAlarm);
        }

        return super.onOptionsItemSelected(item);
    }
}
