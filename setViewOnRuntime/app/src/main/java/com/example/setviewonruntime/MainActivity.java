package com.example.setviewonruntime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Paint mpaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    setContentView(R.layout.activity_main);
        setContentView(new CustomView(this));


    }
    public class CustomView extends View {
        public CustomView(Context context)
        {
            super(context);
            mpaint=new Paint();
            mpaint.setTextSize(24);
            mpaint.setColor(Color.CYAN);
        }
        public void onDraw(Canvas canvas)
        {
            super.onDraw(canvas);
            canvas.drawText("Hello World!!",100,200,mpaint);
            setBackgroundColor(Color.BLACK);
            //setBackgroundResource(R.drawable.img);

            invalidate();
        }
    }
}
