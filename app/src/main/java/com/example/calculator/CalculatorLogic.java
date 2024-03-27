package com.example.calculator;

public class CalculatorLogic {
    String something = "";
    public CalculatorLogic() {
    }

    public String logic(String value) {
        if (value.equals("AC")){
            something = "";
            return something;
        }
        return something += value;
    }
}
