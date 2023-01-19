package src.CalculatorV2;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.GERMAN);
        System.out.println("Podaj pierwszą liczbę");
        double number1 = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double number2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Wybierz co chcesz zrobić: +, -, /, *");
        String operator = scanner.nextLine();

        scanner.close();

        CalculatorApp calculatorMeth = new CalculatorApp();
        double wynik= calculatorMeth.calculate(number1, number2, operator);
        System.out.println("Wynik = " + wynik);


    }

}
