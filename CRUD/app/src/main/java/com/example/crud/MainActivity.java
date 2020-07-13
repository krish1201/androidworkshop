package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {
    EditText id,name;
    Button add,delete,update,email,list;
    crud c;
    TextView listing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id=findViewById(R.id.id);
        name=findViewById(R.id.name);
        add=findViewById(R.id.add);
        delete=findViewById(R.id.delete);
        update=findViewById(R.id.update);
        list=findViewById(R.id.list);
        email=findViewById(R.id.email);
        listing=findViewById(R.id.listing);
        c=new crud(this,"",null,1);
        operation();
    }

    public void operation()
    {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    c.insert(id.getText().toString(), name.getText().toString());
                }
                catch (SQLiteException e)
                {
                    e.printStackTrace();
                }
                id.setText("");
                name.setText("");
                id.requestFocus();
            }

        });



        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    c.delete(id.getText().toString());
                }
                catch (SQLiteException e)
                {
                    e.printStackTrace();
                }
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    c.update(id.getText().toString(), name.getText().toString());
                }
                catch (SQLiteException e)
                {
                    e.printStackTrace();
                }
            }
        });
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    c.list(listing);
                }
                catch(SQLiteException e)
                {
                    e.printStackTrace();
                }
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("mailto:");
                Intent i=new Intent(Intent.ACTION_SENDTO,uri);
                i.putExtra(Intent.EXTRA_EMAIL,new String[]{"irammash1997@gmail.com"});
                i.putExtra(Intent.EXTRA_TEXT,"MESSAGE CAME");
                try
                {
                    startActivity(i);

                }
                catch(Exception e)
                {
                    Toast.makeText(MainActivity.this,"mail failed",Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }

        });

    }

}