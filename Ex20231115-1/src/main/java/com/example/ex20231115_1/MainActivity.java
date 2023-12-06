package com.example.ex20231115_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int MENU_ABOUT = 0;
    private static final int MENU_QUIT = 1;
    private static final int MENU_COLOR = 2;
    private static final int MENU_RED = 3;
    private static final int MENU_YELLOW = 4;
    private static final int MENU_GREEN = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        menu.add(menu.NONE, MENU_ABOUT, 0, "关于")
                .setIcon(android.R.drawable.ic_menu_help);
        menu.add(menu.NONE, MENU_QUIT, 1, "结束")
                .setIcon(android.R.drawable.ic_menu_close_clear_cancel);
        SubMenu subMenu = menu.addSubMenu(Menu.NONE, MENU_COLOR, 0, "背景颜色")
                .setIcon(android.R.drawable.ic_menu_add);
        subMenu.add(Menu.NONE, MENU_RED, 0, "红色");
        subMenu.add(Menu.NONE, MENU_YELLOW, 0, "黄色");
        subMenu.add(Menu.NONE, MENU_GREEN, 0, "绿色");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        TextView label = (TextView) findViewById(R.id.label1);
        switch (item.getItemId()) {
            case MENU_ABOUT:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("关于")
                        .setMessage("版本：1.0 \n 作者：秦雪碧")
                        .setPositiveButton("确定", null)
                        .show();
                break;
            case MENU_QUIT:
                finish();
                break;
            case MENU_RED:
                label.setBackgroundColor(Color.RED);
                break;
            case MENU_YELLOW:
                label.setBackgroundColor(Color.YELLOW);
                break;
            case MENU_GREEN:
                label.setBackgroundColor(Color.GREEN);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}