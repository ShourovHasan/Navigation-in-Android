package com.esbd.a278;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    MaterialToolbar materialToolbar;
//    FrameLayout frameLayout;
    NavigationView navigationView;

    ImageView headerImg;
    TextView headerName, headerEmail;
    View headerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        =-==============================
        drawerLayout = findViewById(R.id.drawerLayout);
        materialToolbar = findViewById(R.id.materialToolbar);
//        frameLayout = findViewById(R.id.frameLayout);
        navigationView = findViewById(R.id.navigationView);
//        =-==============================
        headerView = navigationView.getHeaderView(0);

        headerImg = headerView.findViewById(R.id.headerImg);
        headerName = headerView.findViewById(R.id.headerName);
        headerEmail = headerView.findViewById(R.id.headerEmail);
//        =-==============================

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                MainActivity.this,
                drawerLayout, materialToolbar,
                R.string.drawer_close,
                R.string.drawer_open
        );
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
//        =-==============================
//        =-==============================
        materialToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.toolbarShare){
                    Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
//        =-==============================

        FirstFragment.WEB_URL = "https://www.dsebd.org/index.php";

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout, new FirstFragment());
        fragmentTransaction.commit();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.dse){
                    FirstFragment.WEB_URL = "https://www.dsebd.org/index.php";

                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new FirstFragment());
                    fragmentTransaction.commit();

//                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else if (item.getItemId() == R.id.cse) {
                    FirstFragment.WEB_URL = "https://www.cse.com.bd/";

                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new FirstFragment());
                    fragmentTransaction.commit();

//                    Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
//                    headerName.setText("Ahsan Hasan");
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