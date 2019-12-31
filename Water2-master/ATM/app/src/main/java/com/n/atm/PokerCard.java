package com.n.atm;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.jar.Attributes;

public class PokerCard extends ConstraintLayout {
    int value;
    private ImageView typeImage;
    private TextView leftPoint;
    private TextView rightPoint;

    public PokerCard(Context context) {
        super(context);
    }

    public PokerCard(Context context, AttributeSet attrs) {
        super(context,attrs);
        inflate(context,R.layout.card,this);
        typeImage = findViewById(R.id.type);
        leftPoint = findViewById(R.id.point_left_top);
        rightPoint = findViewById(R.id.point_right_bottom);
    }
}
