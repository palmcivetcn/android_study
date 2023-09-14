package com.example.ex20230914_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {
    private TextInputLayout textInputLayout1, textInputLayout2;
    private TextInputEditText textInputEditText1, textInputEditText2;
    private int begin, end;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInputLayout1 = findViewById(R.id.userInputLayout1);
        textInputEditText1 = findViewById(R.id.userInputEditText1);
        textInputLayout2 = findViewById(R.id.userInputLayout2);
        textInputEditText2 = findViewById(R.id.userInputEditText2);
    }

    private static int numn2n(int begin, int end) {
        int total = 0;
        for (int i = begin; i <= end; i++) {
            total += i;
        }
        return total;
    }

    public void btn1_Click(View view) {
        String userInput1 = textInputEditText1.getText().toString();
        String userInput2 = textInputEditText2.getText().toString();
        try {
            begin = Integer.parseInt(userInput1);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        try {
            end = Integer.parseInt(userInput2);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        int total = numn2n(begin, end);
        TextView output = findViewById(R.id.textview1);
        output.setText(Integer.toString(total));
    }
}
