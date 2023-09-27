package com.example.ex20230920_2;

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
        car nissan = new car("奇骏", 38, 5);
        car honda = new car("雅阁", 21, 4);
        str += nissan.getcarinfo();
        str += honda.getcarinfo();
        TextView output = findViewById(R.id.textview1);
        output.setText(str);
    }
}