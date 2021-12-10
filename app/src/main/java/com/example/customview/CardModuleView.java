package com.example.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class CardModuleView extends LinearLayout {

    RelativeLayout mContainerIcon;
    ImageView mIcon;
    TextView mTvTitle, mTvDescription;
    int mColorBackgroundData, mIconModuleData;
    String mTextTitleData,mTextDescriptionData;


    public CardModuleView(Context context) {
        super(context);
        initView(context,null);
    }

    public CardModuleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context,attrs);
    }

    public CardModuleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public void initView(Context context, AttributeSet attributeSet){
        if(attributeSet!=null && context != null){
            // Chuyễn layout sang kiểu view
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View view = layoutInflater.inflate(R.layout.custom_layout_module,this,true);
            TypedArray typedArray = context.obtainStyledAttributes(attributeSet,R.styleable.CardModuleView);
            mColorBackgroundData = typedArray.getColor(R.styleable.CardModuleView_backgroundIcon, Color.WHITE);
            mIconModuleData = typedArray.getResourceId(R.styleable.CardModuleView_iconModule,R.drawable.address);
            mTextTitleData = typedArray.getString(R.styleable.CardModuleView_titleModule);
            mTextDescriptionData = typedArray.getString(R.styleable.CardModuleView_descriptionModule);
            typedArray.recycle();
            mapView(view);


        }
    }

    private void mapView(View view) {
        mContainerIcon = view.findViewById(R.id.relativeIcon);
        mIcon = view.findViewById(R.id.imageViewIconModule);
        mTvTitle = view.findViewById(R.id.textViewTitleModule);
        mTvDescription = view.findViewById(R.id.textViewDescriptionModule);

    }
}
