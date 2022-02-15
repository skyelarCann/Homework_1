package com.example.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    //Declaration of the view to use
    private CheeseCakeView nuxView;

    //Declaration of the RGB SeekBars
    private SeekBar redBar;
    private SeekBar greenBar;
    private SeekBar blueBar;

    //Declaration of the RGB TextViews
    private TextView redText;
    private TextView greenText;
    private TextView blueText;

    //Declaration of the resetButton to reset the view
    private Button resetButton;

    @SuppressLint("ClickableViewAccessibility") //Android IDE recommendation to not highlight the entirety of onTouch

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Assignment of the SurfaceView */
        nuxView = findViewById(R.id.cheeseCakeView);

        /* Assignment of the TextViews */
        redText = findViewById(R.id.redRGB);
        greenText = findViewById(R.id.greenRGB);
        blueText = findViewById(R.id.blueRGB);

        /* Setting of the redBar and the appropriate listener */
        redBar = findViewById(R.id.redBar);
        redBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressNum, boolean b) {
                //Switch statement for the currentElement string of the combined view and model
                switch (nuxView.currElement)
                {
                    case "Cake Crust":
                        int crustColor = nuxView.crustRect.getColor();
                        nuxView.crustRect.setColor(Color.rgb(progressNum, Color.green(crustColor), Color.blue(crustColor)));
                        break;

                    case "Cheese Filling":
                        int cheeseColor = nuxView.cheeseRect.getColor();
                        nuxView.cheeseRect.setColor(Color.rgb(progressNum, Color.green(cheeseColor), Color.blue(cheeseColor)));
                        break;

                    case "Raspberry Sauce":
                        int raspberryColor = nuxView.sauceRect.getColor();
                        nuxView.sauceRect.setColor(Color.rgb(progressNum, Color.green(raspberryColor), Color.blue(raspberryColor)));
                        break;

                    case "Plate":
                        int plateColor = nuxView.plate.getColor();
                        nuxView.plate.setColor(Color.rgb(progressNum, Color.green(plateColor), Color.blue(plateColor)));
                        break;

                    case "Table Top":
                        int tableTopColor = nuxView.tableTop.getColor();
                        nuxView.tableTop.setColor(Color.rgb(progressNum, Color.green(tableTopColor), Color.blue(tableTopColor)));
                        break;

                    case "Table Leg Left":
                        int tableLegLeftColor = nuxView.leftTableLeg.getColor();
                        nuxView.leftTableLeg.setColor(Color.rgb(progressNum, Color.green(tableLegLeftColor), Color.blue(tableLegLeftColor)));
                        break;

                    case "Table Leg Right":
                        int tableLegRightColor = nuxView.rightTableLeg.getColor();
                        nuxView.rightTableLeg.setColor(Color.rgb(progressNum, Color.green(tableLegRightColor), Color.blue(tableLegRightColor)));
                        break;
                }
                //Concatenates the text inside the view to the current progressNum
                redText.setText("" + progressNum);

                nuxView.invalidate();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Do nothing
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Do nothing
            }
        });

        /* Setting of the greenBar and the appropriate listener */
        greenBar = findViewById(R.id.greenBar);
        greenBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressNum, boolean b) {
                //Switch statement for the currentElement string of the combined view and model
                switch (nuxView.currElement)
                {
                    case "Cake Crust":
                        int crustColor = nuxView.crustRect.getColor();
                        nuxView.crustRect.setColor(Color.rgb(Color.red(crustColor), progressNum, Color.blue(crustColor)));
                        break;

                    case "Cheese Filling":
                        int cheeseColor = nuxView.cheeseRect.getColor();
                        nuxView.cheeseRect.setColor(Color.rgb(Color.red(cheeseColor), progressNum, Color.blue(cheeseColor)));
                        break;

                    case "Raspberry Sauce":
                        int raspberryColor = nuxView.sauceRect.getColor();
                        nuxView.sauceRect.setColor(Color.rgb(Color.red(raspberryColor), progressNum, Color.blue(raspberryColor)));
                        break;

                    case "Plate":
                        int plateColor = nuxView.plate.getColor();
                        nuxView.plate.setColor(Color.rgb(Color.red(plateColor), progressNum, Color.blue(plateColor)));
                        break;

                    case "Table Top":
                        int tableTopColor = nuxView.tableTop.getColor();
                        nuxView.tableTop.setColor(Color.rgb(Color.red(tableTopColor), progressNum, Color.blue(tableTopColor)));
                        break;

                    case "Table Leg Left":
                        int tableLegLeftColor = nuxView.leftTableLeg.getColor();
                        nuxView.leftTableLeg.setColor(Color.rgb(Color.red(tableLegLeftColor), progressNum, Color.blue(tableLegLeftColor)));
                        break;

                    case "Table Leg Right":
                        int tableLegRightColor = nuxView.rightTableLeg.getColor();
                        nuxView.rightTableLeg.setColor(Color.rgb(Color.red(tableLegRightColor), progressNum, Color.blue(tableLegRightColor)));
                        break;
                }
                //Concatenates the text inside the view to the current progressNum
                greenText.setText("" + progressNum);

                nuxView.invalidate();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Do nothing
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Do nothing
            }
        });

        /* Setting of the blueBar and the appropriate listener */
        blueBar = findViewById(R.id.blueBar);
        blueBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressNum, boolean b) {
                //Switch statement for the currentElement string of the combined view and model
                switch (nuxView.currElement)
                {
                    case "Cake Crust":
                        int crustColor = nuxView.crustRect.getColor();
                        nuxView.crustRect.setColor(Color.rgb(Color.red(crustColor), Color.green(crustColor), progressNum));
                        break;

                    case "Cheese Filling":
                        int cheeseColor = nuxView.cheeseRect.getColor();
                        nuxView.cheeseRect.setColor(Color.rgb(Color.red(cheeseColor), Color.green(cheeseColor), progressNum));
                        break;

                    case "Raspberry Sauce":
                        int raspberryColor = nuxView.sauceRect.getColor();
                        nuxView.sauceRect.setColor(Color.rgb(Color.red(raspberryColor), Color.green(raspberryColor), progressNum));
                        break;

                    case "Plate":
                        int plateColor = nuxView.plate.getColor();
                        nuxView.plate.setColor(Color.rgb(Color.red(plateColor), Color.green(plateColor), progressNum));
                        break;

                    case "Table Top":
                        int tableTopColor = nuxView.tableTop.getColor();
                        nuxView.tableTop.setColor(Color.rgb(Color.red(tableTopColor), Color.green(tableTopColor), progressNum));
                        break;

                    case "Table Leg Left":
                        int tableLegLeftColor = nuxView.leftTableLeg.getColor();
                        nuxView.leftTableLeg.setColor(Color.rgb(Color.red(tableLegLeftColor), Color.green(tableLegLeftColor), progressNum));
                        break;

                    case "Table Leg Right":
                        int tableLegRightColor = nuxView.rightTableLeg.getColor();
                        nuxView.rightTableLeg.setColor(Color.rgb(Color.red(tableLegRightColor), Color.green(tableLegRightColor), progressNum));
                        break;
                }
                //Concatenates the text inside the view to the current progressNum
                blueText.setText("" + progressNum);

                nuxView.invalidate();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Do nothing
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Do nothing
            }
        });

        /* Setting of the resetButton and appropriate listener */
        resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(view -> {

            /* First, resets the current element string for the drawText method */
            nuxView.currElement = "No Element Selected";

            /* Sets the color of all custom elements back to their original values */
            nuxView.crustRect.setColor(0xFFC4A484);
            nuxView.cheeseRect.setColor(0xFFFFFDD0);
            nuxView.sauceRect.setColor(0xFFE30B5C);
            nuxView.plate.setColor(0xFFFFFFFF);
            nuxView.tableTop.setColor(0xFF964B00);
            nuxView.leftTableLeg.setColor(0xFF964B00);
            nuxView.rightTableLeg.setColor(0xFF964B00);

            /* Resets the progress of all the seekbars to 0 */
            redBar.setProgress(0);
            greenBar.setProgress(0);
            blueBar.setProgress(0);

            /* Resets all the textViews to 0 */
            redText.setText("0");
            greenText.setText("0");
            blueText.setText("0");

            nuxView.invalidate();
        });

        /* Setting an OnTouchListener to nuxView */
        nuxView.setOnTouchListener((view, motionEvent) -> {
            //Get the x and y positions of the touch event for use in the if else tree below
            nuxView.xPos = (int)motionEvent.getX();
            nuxView.yPos = (int)motionEvent.getY();




            /*
             * This block will check the six components to see if the touch event occurred within their bounds
             * Then, it will set the currentElement string to the name of the element within the touch event
             * Progress of the SeekBars will be updated accordingly as well
             */
            if(nuxView.crustRect.containsPoint(nuxView.xPos,nuxView.yPos))
            {
                /**
                 * External Citation
                 *   Date:       14 February 2022
                 *   Problem:    Decided to use bit shifting to extract individual RGB values
                 *   Resource:
                 *      https://stackoverflow.com/questions/4129666/how-to-convert-hex-to-rgb-using-java
                 *  Solution: Used the syntax from Andrew Beck's response to extract individual RGB values
                 */
                nuxView.currElement = nuxView.crustRect.myName;
                redBar.setProgress((nuxView.crustRect.getColor() & 0xFF0000) >> 16);
                greenBar.setProgress((nuxView.crustRect.getColor() & 0xFF00) >> 8);
                blueBar.setProgress(nuxView.crustRect.getColor() & 0xFF);
            }
            else if(nuxView.cheeseRect.containsPoint(nuxView.xPos,nuxView.yPos))
            {
                nuxView.currElement = nuxView.cheeseRect.myName;
                redBar.setProgress((nuxView.cheeseRect.getColor() & 0xFF0000) >> 16);
                greenBar.setProgress((nuxView.cheeseRect.getColor() & 0xFF00) >> 8);
                blueBar.setProgress(nuxView.cheeseRect.getColor() & 0xFF);
            }
            else if(nuxView.sauceRect.containsPoint(nuxView.xPos,nuxView.yPos))
            {
                nuxView.currElement = nuxView.sauceRect.myName;
                redBar.setProgress((nuxView.sauceRect.getColor() & 0xFF0000) >> 16);
                greenBar.setProgress((nuxView.sauceRect.getColor() & 0xFF00) >> 8);
                blueBar.setProgress(nuxView.sauceRect.getColor() & 0xFF);
            }
            else if(nuxView.plate.containsPoint(nuxView.xPos,nuxView.yPos))
            {
                nuxView.currElement = nuxView.plate.myName;
                redBar.setProgress((nuxView.plate.getColor() & 0xFF0000) >> 16);
                greenBar.setProgress((nuxView.plate.getColor() & 0xFF00) >> 8);
                blueBar.setProgress(nuxView.plate.getColor() & 0xFF);
            }
            else if(nuxView.tableTop.containsPoint(nuxView.xPos,nuxView.yPos))
            {
                nuxView.currElement = nuxView.tableTop.myName;
                redBar.setProgress((nuxView.tableTop.getColor() & 0xFF0000) >> 16);
                greenBar.setProgress((nuxView.tableTop.getColor() & 0xFF00) >> 8);
                blueBar.setProgress(nuxView.tableTop.getColor() & 0xFF);
            }
            else if(nuxView.leftTableLeg.containsPoint(nuxView.xPos,nuxView.yPos))
            {
                nuxView.currElement = nuxView.leftTableLeg.myName;
                redBar.setProgress((nuxView.leftTableLeg.getColor() & 0xFF0000) >> 16);
                greenBar.setProgress((nuxView.leftTableLeg.getColor() & 0xFF00) >> 8);
                blueBar.setProgress(nuxView.leftTableLeg.getColor() & 0xFF);
            }
            else if(nuxView.rightTableLeg.containsPoint(nuxView.xPos,nuxView.yPos))
            {
                nuxView.currElement = nuxView.rightTableLeg.myName;
                redBar.setProgress((nuxView.rightTableLeg.getColor() & 0xFF0000) >> 16);
                greenBar.setProgress((nuxView.rightTableLeg.getColor() & 0xFF00) >> 8);
                blueBar.setProgress(nuxView.rightTableLeg.getColor() & 0xFF);
            }
            else
            {
                nuxView.currElement = "No Element Selected";

                redBar.setProgress(0);
                greenBar.setProgress(0);
                blueBar.setProgress(0);

                redText.setText("" + 0);
                greenText.setText("" + 0);
                blueText.setText("" + 0);

            }
            nuxView.invalidate();
            return false;
        });

    }
}