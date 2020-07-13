package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    f1 mf1;
    f2 mf2;
    int cf=0;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mf1= new f1();
        mf2=new f2();
        b1=findViewById(R.id.b1);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fl,mf1);
        ft.commit();
        cf=1;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                switch (cf)
                {
                    case 1: ft.add(R.id.fl,mf2);
                            cf=2;break;
                    case 2: ft.add(R.id.fl,mf1);
                            cf=1;break;
                }
                ft.commit();
            }
        });


    }
}
