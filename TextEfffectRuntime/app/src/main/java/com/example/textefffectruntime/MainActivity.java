package com.example.textefffectruntime;
//1RV18MC14 KrishnaShah
//1. Calling text view at run time and dynamically changing text effects of text
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout l;
    Button bold,italics,def;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=findViewById(R.id.linearlayout);
        t=new TextView(this);
        t.setText("1RV18MCA14");
        t.setTextSize(28);

        t.setTextColor(Color.BLACK);
        l.addView(t);


        bold = findViewById(R.id.bold);
        def = findViewById(R.id.def);
        italics = findViewById(R.id.italics);
        bold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setTypeface(null, Typeface.BOLD);
                Toast.makeText(MainActivity.this,"Bold",Toast.LENGTH_LONG).show();
            }
        });
        def.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setTypeface(null, Typeface.NORMAL);
                Toast.makeText(MainActivity.this,"Default",Toast.LENGTH_LONG).show();
            }
        });
        italics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setTypeface(null,Typeface.ITALIC);
                Toast.makeText(MainActivity.this,"Italics",Toast.LENGTH_LONG).show();
            }
        });
    }

}
