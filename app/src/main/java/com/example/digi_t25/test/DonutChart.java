/*
package com.example.digi_t25.test;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import static android.graphics.Color.*;

public class DonutChart extends View {

    private float radius;
    Paint  paint;
    Paint  shadowPaint;
    Path   myPath;
    Path   shadowPath;
    Bitmap bitmap;
    Context mContext;
    private int startX;
    private int startY;

    private ArrayList<Integer> colors;
    private ArrayList<Integer> values;
    RectF outterCircle;
    RectF innerCircle;
    RectF shadowRectF;



    public DonutChart(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.DonutChart, 0, 0);
        try {
            radius = a.getDimension(R.styleable.DonutChart_radius, 20.0f);
        } finally {
            a.recycle();
        }
        paint = new Paint();
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(radius / 14.0f);
        shadowPaint = new Paint();
        shadowPaint.setColor(0xf0000000);
        shadowPaint.setStyle(Paint.Style.STROKE);
        shadowPaint.setAntiAlias(true);
        shadowPaint.setStrokeWidth(6.0f);
        shadowPaint.setMaskFilter(new BlurMaskFilter(4, BlurMaskFilter.Blur.SOLID));
        myPath = new Path();
        shadowPath = new Path();
        outterCircle = new RectF();
        innerCircle = new RectF();
        shadowRectF = new RectF();
        float adjust = (.019f * radius);
        shadowRectF.set(adjust, adjust, radius * 2 - adjust, radius * 2 - adjust);
        adjust = .038f * radius;
        outterCircle.set(adjust, adjust, radius * 2 - adjust, radius * 2 - adjust);
        adjust = .276f * radius;
        innerCircle.set(adjust, adjust, radius * 2 - adjust, radius * 2 - adjust);

        colors = new ArrayList<Integer>();
        values = new ArrayList<>();
        startX = 320 / 4;
        startY = 480 / 8;
        radius = 320 / 2;

        colors.add(GREEN);
        colors.add(CYAN);
        colors.add(MAGENTA);
        colors.add(BLUE);
        colors.add(RED);

        values.add((int) 5f);
        values.add((int) 1f);
        values.add((int) 3f);
        values.add((int) 5f);
        values.add((int) 2f);
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // draw shadow
        paint.setShader(null);
        float adjust = (.0095f * radius);
        paint.setShadowLayer(8, adjust, -adjust, 0xaa000000);
        drawDonut(canvas, paint, 0, 359.9f);
        // green   
        setGradient(0xff84BC3D, 0xff5B8829);
        drawDonut(canvas, paint, 0, 60);
        //red
        setGradient(0xffe04a2f, 0xffB7161B);
        drawDonut(canvas, paint, 60, 60);
        // blue
        setGradient(0xff4AB6C1, 0xff2182AD);
        drawDonut(canvas, paint, 120, 60);
        // yellow
        setGradient(0xffFFFF00, 0xfffed325);
        drawDonut(canvas, paint, 180, 180);
    }

    public void drawDonut(Canvas canvas, Paint paint, float start, float sweep) {

        myPath.reset();
        myPath.arcTo(outterCircle, start, sweep, false);
        myPath.arcTo(innerCircle, start + sweep, -sweep, false);
        myPath.close();
        canvas.drawPath(myPath, paint);
    }

    public void setGradient(int sColor, int eColor) {
        paint.setShader(new RadialGradient(radius, radius, radius - 5,
                new int[]{sColor, eColor},
                new float[]{.6f, .95f}, TileMode.CLAMP));
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int desiredWidth = (int) radius * 2;
        int desiredHeight = (int) radius * 2;
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        int width;
        int height;
        //70dp exact
        if (widthMode == MeasureSpec.EXACTLY) {
            width = widthSize;
        } else if (widthMode == MeasureSpec.AT_MOST) {
            //wrap content
            width = Math.min(desiredWidth, widthSize);
        } else {
            width = desiredWidth;
        }

        //Measure Height
        if (heightMode == MeasureSpec.EXACTLY) {
            height = heightSize;
        } else if (heightMode == View.MeasureSpec.AT_MOST) {
            height = Math.min(desiredHeight, heightSize);
        } else {
            height = desiredHeight;
        }
        setMeasuredDimension(width, height);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
       */
/* int color = bitmap.getPixel((int) event.getX(), (int) event.getY());
        if (colors.contains(color)) {
            Log.e("", "is matching");
            if (color == RED) {
                Toast.makeText(mContext, "Is Red", Toast.LENGTH_SHORT).show();
            }

            if (color == CYAN) {
                Toast.makeText(mContext, "Is Cyan", Toast.LENGTH_SHORT).show();
            }

            if (color == MAGENTA) {
                Toast.makeText(mContext, "Is MAGENTA", Toast.LENGTH_SHORT)
                        .show();
            }
            if (color == BLUE) {
                Toast.makeText(mContext, "Is BLUE", Toast.LENGTH_SHORT).show();
            }
            if (color == GREEN) {
                Toast.makeText(mContext, "Is GREEN", Toast.LENGTH_SHORT).show();
            }
        }*//*

        return super.onTouchEvent(event);

    }
}*/
