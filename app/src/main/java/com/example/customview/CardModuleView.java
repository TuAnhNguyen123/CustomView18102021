package com.example.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;

public class CardModuleView extends LinearLayout {

    public CardModuleView(Context context) {
        super(context);
    }

    public CardModuleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CardModuleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
