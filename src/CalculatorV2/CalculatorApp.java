package src.CalculatorV2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double a = 0;
        double b = 0;
        String operator = null;


        boolean readComplete = false;

        while(!readComplete) {
            try {
                System.out.println("Podaj pierwszą liczbę");
                a = input.nextDouble();
                input.nextLine();
                System.out.println("Podaj druga liczbe");
                b = input.nextDouble();
                input.nextLine();
                System.out.println("Podaj operator");
                operator = input.nextLine();
                readComplete = true;
            }catch (UnknownOperatorException e){
                System.out.println("Niepoprawne dane");
                input.nextLine();
            }

        }


        try {
            double result = Calculator.calculate(a, b, operator);
            System.out.println(a + operator + b + "= " + result);
        }catch (UnknownOperatorException | ArithmeticException e){
            System.out.println(e.getMessage());
            System.err.println("Nie udało się obliczyć wyniku wyrażenia " + a + operator + b);
        }




    }

}