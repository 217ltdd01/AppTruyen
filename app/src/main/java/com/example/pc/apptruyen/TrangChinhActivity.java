package com.example.pc.apptruyen;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TrangChinhActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button btn_them;
    ListView lvTruyen;
    ArrayList<Truyen> arrayTruyen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chinh);
        //Khởi tạo 1 toolbar mới thay cho ActionBar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Khởi tạo Navigation
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //------------------listview truyen
        lvTruyen = (ListView) findViewById(R.id.listviewTruyen);
        arrayTruyen = new ArrayList<Truyen>();

        arrayTruyen.add(new Truyen("Thần Đạo Đan Tôn","Cô Đơn Địa Phi",R.drawable.thandaodanton,3513,"2018-04-09 04:56:52"));
        arrayTruyen.add(new Truyen("Ông Xã Tổng Đài Bá Đạo Sủng: Bảo Bối Tiếp Tục","Thất Tịch",R.drawable.baoboitieptuc,135,"2018-04-09 02:29:44"));
        arrayTruyen.add(new Truyen("Một Thai Hai Bảo: Giám Đốc Hàng Tỉ Yêu Vợ Tận Xương","Hoa Dung Nguyệt",R.drawable.giamdochangtyyeuvotanxuong,251,"2018-04-09 02:23:52"));
        arrayTruyen.add(new Truyen("Tân Hôn Không Tình Yêu, Thế Tội Vợ Trước","Hạ Nhiễm Tuyết",R.drawable.thetoivotruoc,148,"2018-04-09 04:13:17"));
        arrayTruyen.add(new Truyen("Vợ Tổng Thống Cưng Chiều Vật Nhỏ","An Chỉ Manh",R.drawable.tongthongcungchieuvatnho,175,"2018-04-09 02:11:17"));

        TruyenAdapter truyenAdapter = new TruyenAdapter(
                TrangChinhActivity.this,
                R.layout.truyen,
                arrayTruyen
        );
        lvTruyen.setAdapter(truyenAdapter);
        //---------------------------------
    }
    //Sự kiện khi nhấn vào nút back trên thiết bị
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.trang_chinh, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    // Bắt sự kiện khi click vào mỗi item trong NavigationView
    //Ở đây đang là không làm gì cả, chỉ đóng NavigationView lại
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
            // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment = null;
        Bundle bundle = new Bundle();
        if (id == R.id.nav_trangchu) {

        } else if (id == R.id.nav_theloai) {

        } else if (id == R.id.nav_thuvien) {
            Toast.makeText(this, "Clicked item one", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_congdong) {
            Toast.makeText(this, "Clicked item one", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_share) {
            Toast.makeText(this, "Clicked item one", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
