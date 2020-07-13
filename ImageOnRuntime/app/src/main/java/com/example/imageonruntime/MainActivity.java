package com.example.imageonruntime;
//1RV18MCA14
//Call images from resources or online at runtime

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    LinearLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=findViewById(R.id.layout);
        img=new ImageView(this);
        img.setImageResource(R.drawable.fl1);
        l.addView(img);
    }
}
