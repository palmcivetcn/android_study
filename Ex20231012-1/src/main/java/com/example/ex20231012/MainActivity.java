package com.example.ex20231012;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1_Click(View view) {
        TextInputLayout textInputLayout = findViewById(R.id.userInputLayout1);
        TextInputEditText textInputEditText = (TextInputEditText) textInputLayout.getEditText();
        String userInput1 = textInputEditText.getText().toString();
        int userinput_1 = Integer.parseInt(userInput1);

    }

}