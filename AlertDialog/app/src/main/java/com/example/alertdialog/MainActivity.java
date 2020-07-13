package com.example.alertdialog;

import android.app.AlertDialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button alertbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alertbtn=findViewById(R.id.albtn);
        alertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog=new AlertDialog.Builder(MainActivity.this).create();

                alertDialog.setTitle("Alert Dialog");
                alertDialog.setMessage("Hello world!");
                alertDialog.setIcon(R.drawable.ic_launcher_foreground);
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(),"CLicked ohk",Toast.LENGTH_LONG);
                            }
                        });

                alertDialog.setButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"CLicked Cancel",Toast.LENGTH_LONG);
                    }
                });

               // alertDialog.setCancelable(true);
                alertDialog.show();
            }
        });
    }
}
