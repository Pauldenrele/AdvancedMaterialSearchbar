package com.example.advancedmaterialsearchbar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

public class MainActivity extends AppCompatActivity {
    MaterialSearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Search Bar ");

        toolbar.setTitleTextColor(Color.parseColor("FFFFFF"));

      searchView = findViewById(R.id.searchBar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

   getMenuInflater().inflate(R.menu.menu , menu);
        MenuItem item = menu.findItem(R.id.action_serach);
       searchView.setMenuItem(item);
       return true;


    }
}
