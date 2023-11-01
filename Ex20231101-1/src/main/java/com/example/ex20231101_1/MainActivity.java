package com.example.ex20231101_1;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1_Click(View view) {
        int amount = 0, quantity = 1;
        EditText txtquantity = findViewById(R.id.txtquantity);
        quantity = Integer.parseInt(txtquantity.getText().toString());
        CheckBox Original = findViewById(R.id.chkOriginal);
        if (Original.isChecked()) {
            amount += 250 * quantity;
        }
        CheckBox beef = findViewById(R.id.chkbeef);
        if (beef.isChecked()) {
            amount += 275 * quantity;
        }
        CheckBox food = findViewById(R.id.chkfood);
        if (food.isChecked()) {
            amount += 350 * quantity;
        }
        TextView output = findViewById(R.id.lb1output);
        output.setText(Integer.toString(amount));

    }


}