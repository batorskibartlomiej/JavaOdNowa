package src.Algorytmika;

import java.util.Scanner;

public class CheckSum {

    public static void main(String[] args) {
        int sum = 0;
        int next = 0;


        Scanner scanner = new Scanner(System.in);
        while ((next=scanner.nextInt())<= 100){
            sum = sum + next;
        }

        int mod= sum% 2;
        if(mod== 0){
            System.out.println("Suma "+ sum + " = Parzysta");

        }else{
            System.out.println("Suma "+ sum + " = Nieparzysta");
        }
    }
}
