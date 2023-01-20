package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_4_2);

        Button btn1 = findViewById(R.id.btn1);
        TextView tv1 = findViewById(R.id.tv1);
        EditText et1 = findViewById(R.id.et1);
        Button btn2 = findViewById(R.id.btn2);

//        btn1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                String str1 =
//            }
//        })


    }
}
