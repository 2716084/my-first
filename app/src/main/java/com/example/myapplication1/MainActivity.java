package com.example.myapplication1;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private EditText etWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        etWelcome=findViewById(R.id.text1);

    }

    public void change_text(View view) {
        etWelcome.setText("this is my first app");

    }
    public void finishApp(View view){
        finish();
        int status;
        System.exit(status:0);
    }
}