package com.n;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class GameMap extends View {
    int posX,posY =400;
    Cat cat;
    public GameMap(Context context, @Nullable AttributeSet attrs) {

        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (cat == null) {
            cat = new cat(this);
        }
        Log.d("Game","onDraw"+getWidth()+","+getHeight());
        Paint paint = new Paint();
        Paint paint0 = new Paint();
        paint0.setColor(0);
        canvas.drawLine(400,0,0,600,paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.cat);
        canvas.drawBitmap(bitmap,400,300,paint);
        for (int i=0; i<getHeight()-bitmap.getHeight();i+=50) {
            canvas.drawBitmap(bitmap,400,300,paint);
        }
    }

    public void moveDown(){
        if (cat.getY() < getHeight()-150){
            cat.setDaemon(Cat.DIRECTION_DOWN);
            invalidate();
        }
    }
    public void moveUp({
        if (cat.)
    })
}
