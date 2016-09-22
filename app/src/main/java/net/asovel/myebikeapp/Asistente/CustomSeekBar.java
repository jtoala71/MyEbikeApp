package net.asovel.myebikeapp.Asistente;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class CustomSeekBar extends SeekBar {

    private Paint paint = new Paint();

    public CustomSeekBar(Context context) {
        super(context);
    }

    public CustomSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomSeekBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStrokeWidth(3.f);
        paint.setARGB(255, 56, 47, 96);
        int width = canvas.getWidth();
        int x = width / 20;
        int y = canvas.getHeight() / 4;
        int stopY = canvas.getHeight() * 3 / 4;
        for (int i = 0; i <= getMax(); i++) {
            canvas.drawLine(x, y, x, stopY, paint);
            x += (width - width / 10) / getMax();
        }
    }

}