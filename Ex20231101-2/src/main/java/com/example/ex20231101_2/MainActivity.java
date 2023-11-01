package com.example.ex20231101_2;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView output;
    private RadioGroup radioGroup;
    private RadioButton rdb01, rdb02, rdb03, rdb04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.lbloutput);
        radioGroup = findViewById(R.id.rdgsteak);
        rdb01 = findViewById(R.id.rdgRare);
        rdb02 = findViewById(R.id.rdgmedium);
        rdb03 = findViewById(R.id.rdgmedwell);
        rdb04 = findViewById(R.id.rdgsmwelldone);
        radioGroup.setOnCheckedChangeListener(listener);
    }

    private RadioGroup.OnCheckedChangeListener listener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (i == rdb01.getId()) {
                output.setText(rdb01.getText());
            } else if (i == rdb02.getId()) {
                output.setText(rdb02.getText());
            } else if (i == rdb03.getId()) {
                output.setText(rdb03.getText());
            } else {
                output.setText(rdb04.getText());
            }
        }
    };
}