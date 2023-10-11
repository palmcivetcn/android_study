package com.example.ex20230927_2;

import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        TextView lb101 = new TextView(this);
        lb101.setText("自定义界面-标签1");
        lb101.setTextScaleX(20);
        lb101.setGravity(Gravity.CENTER);
        TextView lb102 = new TextView(this);

        lb102.setText("自定义后台界面-标签2");
        lb102.setTextScaleX(20);
        lb102.setGravity(Gravity.LEFT);

        Button btn01 = new Button(this);
        btn01.setText("按钮toast");
        btn01.setTextScaleX(30);
        btn01.setGravity(Gravity.CENTER);

        LinearLayout l1 = new LinearLayout(this);
        l1.setOrientation(LinearLayout.VERTICAL);
        l1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        l1.addView(lb101);
        l1.addView(lb102);
        l1.addView(btn01);
        setContentView(l1);
    }
}