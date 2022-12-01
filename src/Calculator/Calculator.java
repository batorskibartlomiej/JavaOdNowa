package src.Calculator;

public class Calculator {

    double x;
    double y;

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double add(double x, double y){
        return x+y;
    }

    double subtract(double x, double y){
        return x-y;
    }

    double multiply(double x, double y){
        return x*y;
    }

    double divide(double x, double y){
        return x/y;
    }



}

