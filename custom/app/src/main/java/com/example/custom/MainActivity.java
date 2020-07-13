package com.example.custom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    Button tbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        tbutton=findViewById(R.id.tbutton);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View Layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.toast_layout));
                ImageView imageView= findViewById(R.id.cimageView);
                //imageView.setImageDrawable(R.drawable.ic_launcher_foreground);
                imageView.setImageResource(R.drawable.ic_launcher_foreground);
                Toast toast=new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(imageView);
                toast.show();
            }
        });
    }
}
