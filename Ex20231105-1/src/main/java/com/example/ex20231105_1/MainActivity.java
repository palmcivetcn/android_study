package com.example.ex20231105_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private static final int MENU_ABOUT = 0;
    private static final int MENU_QUIT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        //初始化菜单
        menu.add(Menu.NONE, MENU_ABOUT, 0, "*T").setIcon(android.R.drawable.ic_dialog_info);
        menu.add(Menu.NONE, MENU_QUIT, 0, "");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        //功能化菜单
        switch (item.getItemId()) {
            case MENU_ABOUT:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("关于").setMessage("姓名:尹启天").setPositiveButton("确定", null).show();
                break;

            case MENU_QUIT:
                finish();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}