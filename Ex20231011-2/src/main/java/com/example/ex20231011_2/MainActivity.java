package com.example.ex20231011_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int num1, num2;
    private sumoperator sum = new sumoperator();
    View.OnClickListener listener1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            num1 = sum.getNum1();
            Toast.makeText(MainActivity.this, Integer.toString(num1), Toast.LENGTH_SHORT).show();
            TextView output = findViewById(R.id.textview1);
            output.setText(sum.getArr1());
        }
    };
    View.OnClickListener listener2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            num2 = sum.getNum2();
            Toast.makeText(MainActivity.this, Integer.toString(num2), Toast.LENGTH_SHORT).show();
            TextView output = findViewById(R.id.textview2);
            output.setText(sum.getArr2());
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(listener1);
        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(listener2);

    }
}