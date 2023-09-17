package com.example.ex20230915_test1;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // 从Intent中获取数据
        Intent intent = getIntent();
        String value = intent.getStringExtra("key");  // 这里的"value"就是我们之前传递的数据


    }
    public void btn3_Click(View view){
//         创建Intent
        Intent intent = new Intent(SecondActivity.this,MainActivity.class);

//         将数据放入Intent中
        intent.putExtra("key", "value");

//         启动SecondActivity
        startActivity(intent);
    }
    public void btn5_Click(View view){
//         创建Intent
        Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);

//         将数据放入Intent中
        intent.putExtra("key", "value");

//         启动SecondActivity
        startActivity(intent);
    }
}

