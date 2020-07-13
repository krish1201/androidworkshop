package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        ConstraintLayout Clayout=findViewById(R.id.Clayout);
        switch(menuItem.getItemId())
        {
            case R.id.blue:
                            Clayout.setBackgroundColor(Color.BLUE);return true;
            case R.id.red:
                            Clayout.setBackgroundColor(Color.RED);return true;
            case R.id.green:
                            Clayout.setBackgroundColor(Color.GREEN);return true;
                            default:
                                super.onOptionsItemSelected(menuItem);
        }
        return false;
    }
}
