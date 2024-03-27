package com.example.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CalculatorLogic  calculatorLogic;
    ManageTextView manageTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_calculator);
        Log.d("BUTTON", String.valueOf(R.id.buttonAC));
        this.manageTextView = new ManageTextView(findViewById(R.id.textViewDisplay));
        this.calculatorLogic = new CalculatorLogic();

    }

    public void buttonAcFunc(View view){
        Log.d("BUTTON", "buttonAcFunc");
        manageTextView.setTextView(calculatorLogic.logic("AC"));
    }
    public void buttonChangeSignFunc(View view){
        Log.d("BUTTON", "buttonChangeSignFunc");
        manageTextView.setTextView(calculatorLogic.logic("ChangeSign"));
    }
    public void buttonClearFunc(View view){
        Log.d("BUTTON", "buttonClearFunc");
        manageTextView.setTextView(calculatorLogic.logic("C"));
    }
    public void buttonDivideFunc(View view){
        Log.d("BUTTON", "buttonDivideFunc");
        manageTextView.setTextView(calculatorLogic.logic("/"));
    }
    public void buttonMultiplyFunc(View view){
        Log.d("BUTTON", "buttonMultiplyFunc");
        manageTextView.setTextView(calculatorLogic.logic("X"));
    }
    public void buttonSubtractFunc(View view){
        Log.d("BUTTON", "buttonSubtractFunc");
        manageTextView.setTextView(calculatorLogic.logic("-"));
    }
    public void buttonAddFunc(View view){
        Log.d("BUTTON", "buttonAddFunc");
        manageTextView.setTextView(calculatorLogic.logic("+"));
    }
    public void buttonEqualFunc(View view){
        Log.d("BUTTON", "buttonEqualFunc");
        manageTextView.setTextView(calculatorLogic.logic("="));
    }
    public void buttonDotFunc(View view){
        Log.d("BUTTON", "buttonDotFunc");
        manageTextView.setTextView(calculatorLogic.logic("."));
    }
    public void button0Func(View view){
        Log.d("BUTTON", "0");
        manageTextView.setTextView(calculatorLogic.logic("0"));
    }
    public void button1Func(View view){
        Log.d("BUTTON", "1");
        manageTextView.setTextView(calculatorLogic.logic("1"));
    }
    public void button2Func(View view){
        Log.d("BUTTON", "2");
        manageTextView.setTextView(calculatorLogic.logic("2"));
    }
    public void button3Func(View view){
        Log.d("BUTTON", "3");
        manageTextView.setTextView(calculatorLogic.logic("3"));
    }
    public void button4Func(View view){
        Log.d("BUTTON", "4");
        manageTextView.setTextView(calculatorLogic.logic("4"));
    }
    public void button5Func(View view){
        Log.d("BUTTON", "5");
        manageTextView.setTextView(calculatorLogic.logic("5"));
    }
    public void button6Func(View view){
        Log.d("BUTTON", "6");
        manageTextView.setTextView(calculatorLogic.logic("6"));
    }
    public void button7Func(View view){
        Log.d("BUTTON", "7");
        manageTextView.setTextView(calculatorLogic.logic("7"));
    }
    public void button8Func(View view){
        Log.d("BUTTON", "8");
        manageTextView.setTextView(calculatorLogic.logic("8"));
    }
    public void button9Func(View view){
        Log.d("BUTTON", "9");
        manageTextView.setTextView(calculatorLogic.logic("9"));
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.finish();
    }
}