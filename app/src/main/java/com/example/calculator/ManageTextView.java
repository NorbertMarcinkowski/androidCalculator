package com.example.calculator;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

public class ManageTextView {
    TextView textView;
    public ManageTextView(TextView textView) {
        this.textView = textView;
    }

    public void setTextView(String text) {
        this.textView.setText(text);
    }
}
