package com.example.fontstyle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name;
    Button bold,italics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        bold = findViewById(R.id.bold);
        italics = findViewById(R.id.italics);
        bold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setTypeface(null,Typeface.BOLD);
            }
        });
        italics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setTypeface(null,Typeface.ITALIC);
            }
        });
    }
}
