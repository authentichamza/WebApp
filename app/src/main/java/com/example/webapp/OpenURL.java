package com.example.webapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class OpenURL extends AppCompatActivity {
    private EditText et;
    private Button load,sendMail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_u_r_l);
        et=findViewById(R.id.input);
        load=findViewById(R.id.load);
        sendMail=findViewById(R.id.sendMail);
    }
}