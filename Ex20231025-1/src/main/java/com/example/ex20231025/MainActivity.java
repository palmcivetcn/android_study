package com.example.ex20231025;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private double bmi = 0;
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double height_a, weight_a;
            EditText txtHeight = (EditText) findViewById(R.id.userInputEditText1);
            EditText txtweight = (EditText) findViewById(R.id.userInputEditText2);
            String height_s = txtHeight.getText().toString();
            String weight_s = txtweight.getText().toString();

            if (height_s.isEmpty() && weight_s.isEmpty()) {
                Toast.makeText(MainActivity.this, "未输入任何值", Toast.LENGTH_SHORT).show();
                height_s = "0";
                weight_s = "0";
            }
            if (height_s.isEmpty()) {
                Toast.makeText(MainActivity.this, "未输入身高值", Toast.LENGTH_SHORT).show();
                height_s = "0";
                weight_s = "0";
            }
            if (weight_s.isEmpty()) {
                Toast.makeText(MainActivity.this, "未输入体重值", Toast.LENGTH_SHORT).show();
                height_s = "0";
                weight_s = "0";
            }
            height_a = Double.parseDouble(height_s);
            weight_a = Double.parseDouble(weight_s);
            if (height_a != 0 || weight_a != 0) {
                if (height_a < 60 && weight_a < 20) {
                    Toast.makeText(MainActivity.this, "身高值和体重值均过小", Toast.LENGTH_SHORT).show();
                } else if (height_a < 60) {
                    Toast.makeText(MainActivity.this, "身高值过小", Toast.LENGTH_SHORT).show();
                } else if (weight_a < 20) {
                    Toast.makeText(MainActivity.this, "体重值过小", Toast.LENGTH_SHORT).show();
                } else if (height_a > 150 && weight_a > 250) {
                    Toast.makeText(MainActivity.this, "身高值和体重值均过大", Toast.LENGTH_SHORT).show();
                } else if (height_a > 150) {
                    Toast.makeText(MainActivity.this, "身高值过大", Toast.LENGTH_SHORT).show();
                } else if (weight_a > 250) {
                    Toast.makeText(MainActivity.this, "体重值过大", Toast.LENGTH_SHORT).show();
                } else {
                    height_a = height_a / 100;
                    bmi = weight_a / (height_a * height_a);
                    TextView output = (TextView) findViewById(R.id.textview1);
                    output.setText(Double.toString(bmi));
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(listener);

    }

    public void btn1_Click(View view) {
        if (bmi == 0) {
            Toast.makeText(MainActivity.this, "未计算bmi值", Toast.LENGTH_SHORT).show();
        } else if (bmi < 18.5) {
            TextView output = (TextView) findViewById(R.id.textview2);
            output.setText("体重过低");
        } else if (18.5 < bmi && bmi < 24) {
            TextView output = (TextView) findViewById(R.id.textview2);
            output.setText("正常");
        } else if (24 < bmi && bmi < 28) {
            TextView output = (TextView) findViewById(R.id.textview2);
            output.setText("超重");
        } else if (28 <= bmi) {
            TextView output = (TextView) findViewById(R.id.textview2);
            output.setText("肥胖");
        }
    }

    public void btn2_Click(View view) {
        bmi = 0;
        TextView output1 = (TextView) findViewById(R.id.textview1);
        output1.setText("？");
        TextView output2 = (TextView) findViewById(R.id.textview2);
        output2.setText("？");
        EditText txtHeight = (EditText) findViewById(R.id.userInputEditText1);
        EditText txtweight = (EditText) findViewById(R.id.userInputEditText2);
        txtHeight.setText("");
        txtweight.setText("");
    }
}