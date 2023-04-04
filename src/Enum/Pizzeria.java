package src.Enum;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {
        System.out.println("Dostepne pizze:");

        for (Pizza p : Pizza.values()) {
            System.out.println(p);

        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Jak chcesz pizze ?");
        Pizza pizza = Pizza.valueOf(sc.nextLine().toUpperCase());
        System.out.println("Dziękujemy za wybór pizzy " + pizza.name());
        sc.close();
    }


}

