package src.Calculator;

import java.sql.SQLOutput;

public class Calculate {
    public static void main(String[] args) {


        double x = 10;
        double y= 15;


        Calculator calc = new Calculator(x, y);
        System.out.println("dodoawanie");
        System.out.println(calc.add(x,y)) ;
        System.out.println("testBrancha");
        System.out.println("po mergu");

    }


}
