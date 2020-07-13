package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText opr1;
    private EditText opr2;
    private Button btnadd;
    private Button btnsub;
    private Button btnmul;
    private Button btndiv;
    private Button btnclr;
    private TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opr1 = (EditText) findViewById(R.id.num1);
        opr2 = (EditText) findViewById(R.id.num2);
        btnadd = (Button) findViewById(R.id.add);
        btnsub = (Button) findViewById(R.id.sub);
        btnmul = (Button) findViewById(R.id.mul);
        btndiv = (Button) findViewById(R.id.div);
        btnclr = (Button) findViewById(R.id.cls);
        txtresult = (TextView) findViewById(R.id.result);
        // Addition
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((opr1.getText().length() > 0) && (opr2.getText().length() > 0) &&
                        opr1.getText().toString().matches("[0-9]*")&& opr2.getText().toString().matches("[0-9]*.?[0-9]*"))  {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 + oper2;
                    txtresult.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((opr1.getText().length() > 0) && (opr2.getText().length() > 0)&&
                        opr1.getText().toString().matches("[0-9]*")&& opr2.getText().toString().matches("[0-9]*")) {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 - oper2;
                    txtresult.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((opr1.getText().length() > 0) && (opr2.getText().length() > 0)&&
                        opr1.getText().toString().matches("[0-9]*")&& opr2.getText().toString().matches("[0-9]*")) {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 * oper2;
                    txtresult.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((opr1.getText().length() > 0) && (opr2.getText().length() > 0) &&
                        opr1.getText().toString().matches("[0-9]*")&& opr2.getText().toString().matches("[0-9]*")) {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 / oper2;
                    txtresult.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opr1.setText("");
                opr2.setText("");
                txtresult.setText("0.00");
                opr1.requestFocus();
            }
        });
    }
}
