package com.example.sms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    EditText phoneNumber,smsBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=findViewById(R.id.bt1);
        phoneNumber=findViewById(R.id.phone);
        smsBody=findViewById(R.id.smsBody);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   sendSMSByIntend();
            }



    });
    }
    public void sendSMSByIntend()
    {
        Uri uri = Uri.parse("smsto:" + phoneNumber.getText().toString());
        Intent smsIntent=new Intent(Intent.ACTION_SENDTO,uri);
        smsIntent.putExtra("sms_body",smsBody.getText().toString());
        try{
            startActivity(smsIntent);
        } catch(Exception ex){
            Toast.makeText(MainActivity.this,"Error occured...",Toast.LENGTH_LONG).show();
            ex.printStackTrace();
        }
    }
}
