package com.example.ex20231011;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "用监听者来测试TOAST类信息框", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//      setContentView(R.layout.activity_main);

        TextView lbl01 = new TextView(this);
        lbl01.setText("自定义界面-标签1");
        lbl01.setTextSize(20);
        lbl01.setGravity(Gravity.CENTER);

        TextView lbl02 = new TextView(this);
        lbl02.setText("自定义界面-标签2");
        lbl02.setTextSize(40);
        lbl02.setGravity(Gravity.LEFT);  //      gravity空间位置

        Button btn01 = new Button(this);
        btn01.setText("TOAST");
        btn01.setTextSize(30);
        btn01.setGravity(Gravity.RIGHT);
        btn01.setOnClickListener(listener);

        LinearLayout l1 = new LinearLayout(this);
        l1.setOrientation(LinearLayout.VERTICAL);
        l1.setLayoutParams(new ViewGroup.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        l1.addView(lbl01);
        l1.addView(lbl02);
        l1.addView(btn01);

        setContentView(l1);

    }
}