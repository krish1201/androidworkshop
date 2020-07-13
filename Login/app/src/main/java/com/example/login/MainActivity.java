package com.example.login;
//  1RV18MCA14
//Build a Login with 3 attempts and timer including validation
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button ok,cancel;
    EditText user,pass;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ok=findViewById(R.id.ok);
        cancel=findViewById(R.id.cancel);
        user=findViewById(R.id.user);
        pass=findViewById(R.id.pass);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(count>=2)
                {
                    ok.setEnabled(false);
                    new CountDownTimer(10000,1000)
                    {
                        @Override
                        public void onTick(long l) {


                        }

                        @Override
                        public void onFinish() {
                            ok.setEnabled(true);
                            count=0;
                        }


                    }.start();
                }
                if(user.getText().toString().equals("krish") &&  pass.getText().toString().equals("1234")){
                    Toast.makeText(getApplicationContext(),"Welcome", Toast.LENGTH_LONG).show();
                    count=0;
                    Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                }
                else{
                    count++;
                    Toast.makeText(getApplicationContext(),"Login unsuccessful "+count,Toast.LENGTH_SHORT).show();
                }
            }
        });


        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
