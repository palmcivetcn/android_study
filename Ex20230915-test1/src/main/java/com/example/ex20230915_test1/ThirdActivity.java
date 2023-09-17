package com.example.ex20230915_test1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

    }
    public void btn4_Click(View view){
//         创建Intent
        Intent intent = new Intent(ThirdActivity.this,MainActivity.class);

//         将数据放入Intent中
        intent.putExtra("key", "value");

//         启动SecondActivity
        startActivity(intent);
    }
}
