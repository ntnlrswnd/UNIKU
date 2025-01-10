package com.project.uniku;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ActivityNAV extends AppCompatActivity {

    // Declare fragments
    private final Dashboard dashboardFragment = new Dashboard();
    private final Notification notificationFragment = new Notification();
    private final Setting settingFragment = new Setting();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        // Find BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.btm_nav);

        // Set listener for BottomNavigationView
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                // Handle navigation item selection
                if (id == R.id.dashboard) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.flFragment, dashboardFragment)
                            .commit();
                    return true;
                } else if (id == R.id.notif) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.flFragment, notificationFragment)
                            .commit();
                    return true;
                } else if (id == R.id.setting) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.flFragment, settingFragment)
                            .commit();
                    return true;
                }

                return false;
            }
        });

        // Set default selected item
        bottomNavigationView.setSelectedItemId(R.id.dashboard);
    }
}
