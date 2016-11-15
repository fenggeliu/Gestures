package com.fenggeliu.gestures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener {

    private TextView liuMessage;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liuMessage  = (TextView)findViewById(R.id.liuMessage);
        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    //Begin Gesture


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        liuMessage.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        liuMessage.setText("onDoubleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        liuMessage.setText("onDoubleTapEventConfirmed");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        liuMessage.setText("onDownConfirmed");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        liuMessage.setText("onShowPressConfirmed");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        liuMessage.setText("onSingleTapUpConfirmed");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        liuMessage.setText("onScrollConfirmed");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        liuMessage.setText("onLongPressConfirmed");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        liuMessage.setText("onFlingConfirmed");
        return true;
    }
}
