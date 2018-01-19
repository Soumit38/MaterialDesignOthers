package com.example.soumit.materialdesignothers;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MaterialBottomNavigation extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemReselectedListener {

    BottomNavigationView bottomNavigationView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_bottom_navigation);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomnavigation_id);
        textView = (TextView) findViewById(R.id.text_id);

        bottomNavigationView.setOnNavigationItemReselectedListener(this);

    }

    @Override
    public void onNavigationItemReselected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.recents_id:
                textView.setText(getResources().getText(R.string.recents));
                break;
            case R.id.favourites_id:
                textView.setText(getResources().getText(R.string.favourites));
                break;
            case R.id.nearby_id:
                textView.setText(getResources().getText(R.string.near_by));
                break;
        }

    }
}
