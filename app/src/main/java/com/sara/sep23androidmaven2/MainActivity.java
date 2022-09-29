package com.sara.sep23androidmaven2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sara.emailvalidator.EmailValidate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText email = findViewById(R.id.editText1);
        Button validate = findViewById(R.id.button3);
        validate.setOnClickListener(v -> {
            if (EmailValidate.getInstance().isValid(String.valueOf(email.getText())))
                Toast.makeText(MainActivity.this, "VALID email entered",  Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(MainActivity.this, "INVALID email entered", Toast.LENGTH_SHORT).show();
        });
    }
}