package com.example.nyuscps.japan;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.widget.Toast;

/**
 * Created by nyuscps on 2/28/15.
 */
public class JapanView extends View {
    Paint paint = new Paint();

    public JapanView(Context context) {
        super(context);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);	//vs. STROKE
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();
        float radius = .3f * Math.min(width, height);

        // Makes the center the origin instead of the upperleft area
        canvas.translate(width/2f, height/2f);

        canvas.drawColor(Color.WHITE);	//background
        canvas.drawCircle(0f, 0f, radius, paint);
        String s = width + " \u00D7 " + height;

        // Made whenever onDraw is called
        Toast.makeText(getContext(), s, Toast.LENGTH_LONG).show();
    }
}
