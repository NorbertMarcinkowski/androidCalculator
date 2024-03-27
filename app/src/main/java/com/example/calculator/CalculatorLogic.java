package com.example.calculator;


enum Operation {
    add, subtract, multiply, divide, none
}

public class CalculatorLogic {
    String expression = "";
    String firstNumber = "";
    Operation lastOperation;
    String secondNumber = "";
    public CalculatorLogic() {
    }

    public String logic(String value) {
        if (value.equals("AC")){
            expression = "";
            firstNumber = "";
            secondNumber = "";
            return expression;
        }
        if (value.equals("+")){
            if (expression.isEmpty() && firstNumber.isEmpty()) {
                return "";
            }
            if (!expression.isEmpty() && firstNumber.isEmpty()){
                firstNumber = expression;
                expression = "";
                lastOperation = Operation.add;
                return firstNumber;
            }
            if (!expression.isEmpty()) {
                float number1 = Float.parseFloat(firstNumber);
                float number2 = Float.parseFloat(expression);
                firstNumber = String.valueOf(number1 + number2);
                expression = "";
                return firstNumber;
            }

        }
        if (value.equals("=")){
            if (lastOperation == Operation.add) {
                if (!firstNumber.isEmpty() && !expression.isEmpty()) {
                    float number1 = Float.parseFloat(firstNumber);
                    float number2 = Float.parseFloat(expression);
                    String res = String.valueOf(number1 + number2);
                    firstNumber = res;
                    expression = "";
                    lastOperation = Operation.none;
                    return res;
                }
            }
            if (!firstNumber.isEmpty()) {
                return firstNumber;
            }
            return "";
        }
        if (expression.contains(".") && value.equals(".")) {
            return expression;
        }
        return expression += value;
    }
}
