package com.example.a2weekfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class WelcomeActivity extends AppCompatActivity {
    private TextView tvName;
    private String strName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        tvName = (TextView) findViewById(R.id.tvName);
        Bundle bundle = getIntent().getExtras();
        strName = bundle.getString("NAME");
        tvName.setText(strName);
    }
}