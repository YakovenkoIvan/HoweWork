package com.company;

public class Operatoins {


    public static String calculate(String expression) {
        if (expression.contains("+")) {
            String[] arrayString = expression.split("\\+");
            double a = Double.parseDouble(arrayString[0]);
            double b = Double.parseDouble(arrayString[1]);
            String string = Double.toString(addition(a, b));
            return string;
        }
        if (expression.contains("-")) {
            String[] arrayString = expression.split("\\-");
            double a = Double.parseDouble(arrayString[0]);
            double b = Double.parseDouble(arrayString[1]);
            String string = Double.toString(subtraction(a, b));
            return string;
        }
        if (expression.contains("*")) {
            String[] arrayString = expression.split("\\*");
            double a = Double.parseDouble(arrayString[0]);
            double b = Double.parseDouble(arrayString[1]);
            String string = Double.toString(multiplication(a, b));
            return string;
        }
        if (expression.contains("/")) {
            String[] arrayString = expression.split("\\/");
            double a = Double.parseDouble(arrayString[0]);
            double b = Double.parseDouble(arrayString[1]);
            String string = Double.toString(division(a, b));
            return string;
        }
        return expression;
    }


    private static double addition(double a, double b) {
        double resaul = a + b;
        return resaul;
    }

    private static double subtraction(double a, double b) {
        double resaul = a - b;
        return resaul;
    }

    private static double multiplication(double a, double b) {
        double resaul = a * b;
        return resaul;
    }

    private static double division(double a, double b) {
        double resaul = a / b;
        return resaul;
    }
}
