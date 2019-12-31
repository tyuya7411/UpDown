package com.fju.water;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        int fee = (int) (getIntent().getDoubleExtra("fee",0)+0.5);
        TextView tv = findViewById(R.id.textView4);
        tv.setText(fee+"");

    }
}
