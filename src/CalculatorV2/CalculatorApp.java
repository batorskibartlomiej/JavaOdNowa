package src.CalculatorV2;

public class CalculatorApp {

    public double calculate(double a, double b, String operator) {

        double result= 0;

        switch (operator) {
            case "+" -> result = (a + b);
            case "-" -> result =(a - b);
            case "/" -> result = (a / b);
            case "*" -> result = (a * b);
            default -> System.out.println("Wprowadzono błędny operator");
        };

        return  result;


    }





}
