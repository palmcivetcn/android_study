package com.example.ex20230915_test1;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btn1_Click(View view) {
        showFirstDialog();

    }

    private void showFirstDialog() {
        new AlertDialog.Builder(this)
                .setTitle("第一个弹窗")
                .setMessage("这是第一个弹窗的内容")
                .setPositiveButton("显示第二个弹窗", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // 关闭第一个弹窗
                        dialog.dismiss();

                        // 显示第二个弹窗
                        showSecondDialog();
                    }
                })
                .setNegativeButton("取消", null)
                .show();
    }

    private void showSecondDialog() {
        new AlertDialog.Builder(this)
                .setTitle("第二个弹窗")
                .setMessage("这是第二个弹窗的内容")
                .setPositiveButton("显示第一个弹窗", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // 关闭第二个弹窗
                        dialog.dismiss();

                        // 显示第一个弹窗
                        showFirstDialog();
                    }
                })
                .setNegativeButton("取消", null)
                .show();
    }

    public void btn2_Click(View view) {
//         创建Intent
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

//         将数据放入Intent中
        intent.putExtra("key", "value");

//         启动SecondActivity
        startActivity(intent);
    }

}