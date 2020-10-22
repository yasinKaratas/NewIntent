package com.example.a2weekfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText name;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.edtName);
        send = (Button) findViewById(R.id.btnSend);


        send.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (isValidName(name.getText().toString())) {
            goToWelcome(name.getText().toString());
        }
        else
        {
            Toast.makeText(this,"Lütfen geçerli bir isim girin.", Toast.LENGTH_SHORT).show();

        }

    }

    private boolean isValidName(String name) {
        return (name.length() > 2 && name.length() < 21);
    }

    private void goToWelcome(String name) {
        Bundle bundle = new Bundle();
        bundle.putString("NAME", name);
        Intent intent = new Intent(this, WelcomeActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}