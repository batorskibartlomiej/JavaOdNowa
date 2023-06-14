package src.ArrayAndLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValuesSum {

    private static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {


        ArrayList<Double> numbers = new ArrayList<>();
        fillList(numbers);
        printData(numbers);


    }


        private static void fillList (List <Double> list) {
            System.out.println("Podaj liczbę");
            String input = sc.nextLine();

            if (input.equals("EXIT"))
                return;
            try{
                double num = Double.parseDouble(input);
                list.add(num);
            }catch (NumberFormatException e) {
                System.err.println("Liczba w niepoprawnym formacie");
            }

            fillList(list);


        }

       private static void printData (List < Double > list) {
            if (!list.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                double sum = 0;
                for (Double d : list) {
                    sb.append(d);
                    sb.append("+");
                    sum = sum + d;
                }
                sb.replace(sb.length()-1, sb.length(), "=");
                sb.append(sum);
                System.out.println(sb.toString());

            }

        }

}


