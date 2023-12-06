package com.example.ex20231129_1;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SQLiteDatabase db;
    private MyDBHelper dbHelper;
    private static final String DATABASE_NAME="MyBooks";
    private static final int DATABASE_VERSION=2;

    private static String DATABASE_TABLE="titles";

    private TextView output;
    private EditText txtTitle, txtPrice, txtNewPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //创建SQLiteOpenHelper对象
        dbHelper=new MyDBHelper(this, DATABASE_NAME,null, DATABASE_VERSION);
        //开启数据库
        db=dbHelper.getWritableDatabase();

        output=(TextView) findViewById(R.id.lblOutput);
        txtTitle=(EditText) findViewById(R.id.txtTitle);
        txtPrice=(EditText) findViewById(R.id.txtPrice);
        txtNewPrice=(EditText) findViewById(R.id.txtPrice);
        output.setText("数据库是否开启:"+db.isOpen()+"\n数据库版本:"+db.getVersion());
    }

}