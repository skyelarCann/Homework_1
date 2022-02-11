package com.example.homework_1;

import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;

public class CheeseCakeController implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener {
    private CheeseCakeView controlledCakeView;


    public CheeseCakeController(CheeseCakeView cakeView)
    {
      controlledCakeView = cakeView;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        int xCord = (int)motionEvent.getX();
        int yCord = (int)motionEvent.getY();

        return false;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progressNum, boolean fromUser) {

        switch(seekBar.getId())
        {
            case R.id.redBar:

                break;

            case R.id.greenBar:

                break;

            case R.id.blueBar:

                break;
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
