package com.example.magicball;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyDraw extends View {
    public MyDraw(Context context) {
        super(context);
        x = new float[10];
        y = new float[10];
        for (int i = 0; i < x.length; i++){
            x[i] = (float)Math.random() * 500;
            y[i] = (float)Math.random() * 500;
        }

        vx = 1;
        vy = -0.5f;
    }

    Paint paint = new Paint();
    float[] x, y;

    float vx, vy;

    @Override
    protected void onDraw(Canvas canvas) {
        for (int i = 0; i < x.length; i++) {
            canvas.drawCircle(x[i], y[i], 50, paint);
            x[i] += vx;
            y[i] += vy;
        }
        invalidate();
        }
    }
