package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrar(View v){
/*
        EditText val1 = findViewById(R.id.editTextNumberDecimal);
        val1.getText().toString();
        EditText val2 = findViewById(R.id.editTextNumberDecimal3);
        val2.getText().toString();

        Double result= val1 + val2;
*/
        EditText ver = findViewById(R.id.editName);
        EditText result =findViewById(R.id.editName);
        result.setText(ver.getText().toString());
            }
}