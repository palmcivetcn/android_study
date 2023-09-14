package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static void printTriang() {
        int i, j;
        str += "\n";
        for (i = 1; i < 9; i++) {
            for (j = 1; j <= i; j++) {
                str += "*";
            }
            ;
            str += "\n";
        }
        ;

    }

    public void btn1_Click(View view) {
        TextView output = (TextView) findViewById(R.id.textview1);
        printTriang();
        output.setText(str);
    }

    public void btn2_Click(View view) {
        TextView output = (TextView) findViewById(R.id.textview1);
        str = " ";
        output.setText(str);
    }
}