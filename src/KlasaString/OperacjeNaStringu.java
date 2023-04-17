package src.KlasaString;

import java.util.Scanner;

public class OperacjeNaStringu {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile wyrazów chcesz wprowadzić");
        int wordsNumber = scanner.nextInt();
        scanner.nextLine();

        String[] strings = new String[wordsNumber];

        for (int i = 0; i < wordsNumber; i++) {
            System.out.println("Podaj kolejny wyraz");

            strings[i]=scanner.nextLine();

        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < wordsNumber; i++) {
            stringBuilder.append(strings[i].charAt(strings[i].length()-1));


        }
        System.out.println("Nowe słowo " + stringBuilder.toString());

        scanner.close();


    }
}
