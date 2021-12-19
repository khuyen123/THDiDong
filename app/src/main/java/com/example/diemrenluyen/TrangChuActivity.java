package com.example.diemrenluyen;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.android.volley.RequestQueue;
import com.example.diemrenluyen.fragment.DanhSachDiemFragment;
import com.example.diemrenluyen.fragment.DanhSachSinhVienFragment;
import com.example.diemrenluyen.fragment.TrangChuFragment;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class TrangChuActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private static final int FRAGMENT_TRANGCHU = 0;
    private static final int FRAGMENT_DS_SV = 1;
    private static final int FRAGMENT_DS_DIEM = 2;

    private int mCurrentFragment = FRAGMENT_TRANGCHU;

//    String getData = "http://192.168.1.3:8080/android/nguoidung.php";
//    String urlDelete = "http://192.168.1.3:8080/android/delete.php";
//    ListView lsvSinhVien;
//    ArrayList<SinhVien> sinhVienArrayList;
//    SinhVienAdapter sinhVienAdapter;
    DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle barDrawerToggle =  new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                R.string.open_navigation, R.string.close_navigation);
        mDrawerLayout.addDrawerListener(barDrawerToggle);
        barDrawerToggle.syncState();
        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
        replaceFragment(new TrangChuFragment());
        navigationView.getMenu().findItem(R.id.nav_trangchu_item).setChecked(true);
    }




    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.nav_trangchu_item){
            if (mCurrentFragment!=FRAGMENT_TRANGCHU) {
                replaceFragment(new TrangChuFragment());
                mCurrentFragment = FRAGMENT_TRANGCHU;
            }
        }else if (id == R.id.nav_ds_sv_item){
            if (mCurrentFragment!=FRAGMENT_DS_SV) {
                replaceFragment(new DanhSachSinhVienFragment());
                mCurrentFragment = FRAGMENT_DS_SV;
            }
        }else if(id == R.id.nav_ds_diem_item){
            if (mCurrentFragment!=FRAGMENT_DS_DIEM) {
                replaceFragment(new DanhSachDiemFragment());
                mCurrentFragment = FRAGMENT_DS_DIEM;
            }
        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    //Thoat app
    public  void  onBackPressed(){
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
    private void replaceFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame, fragment);
        transaction.commit();
    }
}
