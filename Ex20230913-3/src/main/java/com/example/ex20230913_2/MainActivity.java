package com.example.ex20230913_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn1_Click(View view) {
        String str = " ";
        try {
            for (int i = 2; i > -1; i--) {
                str += "计算结果:" + 6 / i + "\n";
            }
        } catch (ArithmeticException ex) {
            // TODO: handle exception
            str += "异常说明：" + ex.getMessage() + "\n";
        } finally {
            str += "错误处理结束！\n";

        }
        str += "程序结束！";
        TextView output = (TextView) findViewById(R.id.textview1);
        output.setText(str);
    }
}