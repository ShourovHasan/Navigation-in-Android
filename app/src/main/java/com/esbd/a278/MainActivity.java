package com.esbd.a278;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    MaterialToolbar materialToolbar;
    FrameLayout frameLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        =-==============================
        drawerLayout = findViewById(R.id.drawerLayout);
        materialToolbar = findViewById(R.id.materialToolbar);
        frameLayout = findViewById(R.id.frameLayout);
        navigationView = findViewById(R.id.navigationView);
//        =-==============================

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                MainActivity.this,
                drawerLayout, materialToolbar,
                R.string.drawer_close,
                R.string.drawer_open
        );
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
//        =-==============================
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.navHome){
                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else if (item.getItemId() == R.id.navProfile) {
                    Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }else if (item.getItemId() == R.id.navNotification) {
                    Toast.makeText(MainActivity.this, "Notification", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }else if (item.getItemId() == R.id.navSettings) {
                    Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                return true;
            }
        });
//        =-==============================
//        =-==============================
//        =-==============================



//        =-==============================


    }


//        =-==============================
}