package com.example.ex20231012;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class SecondActivity extends AppCompatActivity {
    private TextInputLayout textInputLayout2;
    private TextInputEditText textInputEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textInputLayout2 = findViewById(R.id.userInputLayout2);
        textInputEditText2 = findViewById(R.id.userInputEditText2);
    }

    public void btn2_Click(View view) {
        //         创建Intent
        Intent intent = getIntent();       //创建一个新的getIntent
        String name = intent.getStringExtra("user_num1");   //获取
//         将数据放入Intent中
        String userInput1 = textInputEditText2.getText().toString();
        try {


            //         启动SecondActivity
            startActivity(intent);

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

}
