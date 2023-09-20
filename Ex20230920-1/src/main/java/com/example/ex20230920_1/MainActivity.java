package com.example.ex20230920_1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btn1_Click(View view) {
        String str = "";
        customer cust = new customer("尹启天", "哈尔滨市", 40);
        str += cust.getlableldata();
        str += "\n姓名：" + cust.getName();
        str += "\n年龄：" + cust.getAge();
        str += "\n地址：" + cust.getAddress();
        TextView output = findViewById(R.id.textview1);
        output.setText(str);
    }
}