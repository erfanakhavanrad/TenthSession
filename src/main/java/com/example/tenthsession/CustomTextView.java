package com.example.tenthsession;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomTextView extends androidx.appcompat.widget.AppCompatTextView {
    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        //type face
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "vazir.ttf");
        this.setTypeface(typeface);
    }
}
