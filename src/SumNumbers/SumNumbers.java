package src.SumNumbers;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile liczba chcesz podać");
        int liczba = scanner.nextInt();

        int sum = 0;





        while ( liczba >0){

            System.out.println("podaj kolejną liczbę");
            sum = sum + scanner.nextInt();
            liczba--;
        }

        System.out.println("suma wszystkich liczb "+ sum);
        scanner.close();



    }
}
