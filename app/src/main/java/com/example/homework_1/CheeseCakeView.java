package com.example.homework_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class CheeseCakeView extends SurfaceView {

    /* Cheesecake model declaration */
    private CheeseCakeModel cheeseData;

    /* Declaration of positions of the different parts of the cheesecake */
    public static final int sauceTop = 880;
    public static final int cheeseTop = 900;
    public static final int crustTop = 1000;

    public static final int cheeseCakeLeft = 200;
    public static final int cheeseCakeWidth = 900;
    public static final int plateWidth = 1000;



    public CheeseCakeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
        setBackgroundColor(0xFFF5F5DC);
    }

    @Override
    public void onDraw(Canvas canvas)
    {

        CustomRect crustRect = new CustomRect("Cake Crust",0xFFC4A484, cheeseCakeLeft, crustTop, cheeseCakeWidth, crustTop+100);
        CustomRect cheeseRect = new CustomRect("Cheese Filling",0xFFFFFDD0, cheeseCakeLeft, cheeseTop, cheeseCakeWidth, crustTop);
        CustomRect sauceRect = new CustomRect("Raspberry Sauce",0xFFE30B5C, cheeseCakeLeft, sauceTop, cheeseCakeWidth, cheeseTop);
        CustomRect plate = new CustomRect("Plate",0xFFFFFFFF, cheeseCakeLeft-100, crustTop+101, plateWidth, crustTop+150);
        CustomRect tableTop = new CustomRect("Table Top", 0xFF964B00, cheeseCakeLeft-150, crustTop+152,plateWidth + 50, crustTop+202);
        CustomRect leftTableLeg = new CustomRect("Table Leg", 0xFF964B00, cheeseCakeLeft, crustTop+202,cheeseCakeLeft + 50, 2000);
        CustomRect rightTableLeg = new CustomRect("Table Leg", 0xFF964B00, cheeseCakeWidth, crustTop+202,cheeseCakeWidth + 50, 2000);


        crustRect.drawMe(canvas);
        cheeseRect.drawMe(canvas);
        sauceRect.drawMe(canvas);
        plate.drawMe(canvas);
        tableTop.drawMe(canvas);
        leftTableLeg.drawMe(canvas);
        rightTableLeg.drawMe(canvas);
    }

}
