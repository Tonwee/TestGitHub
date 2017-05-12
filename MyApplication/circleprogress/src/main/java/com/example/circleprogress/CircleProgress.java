package com.example.circleprogress;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public class CircleProgress extends View {


    public CircleProgress(Context context) {
        super(context);
        init(null, 0);
    }

    public CircleProgress(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public CircleProgress(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }
    private void init(AttributeSet attrs, int defStyle){
//        TypedArray a = getContext().obtainStyledAttributes()
    }
}
