package com.fenght.moduledemo.view;

import android.content.Context;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

public class KeyBoardEditText extends AppCompatEditText implements KeyboardView.OnKeyboardActionListener {
    public KeyBoardEditText(Context context) {
        super(context);
    }

    public KeyBoardEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public KeyBoardEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onPress(int primaryCode) {

    }

    @Override
    public void onRelease(int primaryCode) {

    }

    @Override
    public void onKey(int primaryCode, int[] keyCodes) {

    }

    @Override
    public void onText(CharSequence text) {

    }

    @Override
    public void swipeLeft() {

    }

    @Override
    public void swipeRight() {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void swipeUp() {

    }
}
