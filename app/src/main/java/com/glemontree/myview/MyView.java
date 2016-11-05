package com.glemontree.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/11/5.
 */

public class MyView extends View {
    private Paint mPaint;
    public MyView(Context context) {
        super(context);
    }
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(200, 200);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(2);
        canvas.drawRect(0, 0, getMeasuredWidth(), getMeasuredHeight(), mPaint);
    }
}
