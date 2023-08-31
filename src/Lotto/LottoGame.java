package src.Lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGame {
    public static void main(String[] args) {
        System.out.println("Witaj w grze");
        List<Integer> userNumbers= readNumbersFromUser();
        Lotto lotto = new Lotto();
        int result = lotto.checkResult(userNumbers);
        List<Integer> lottoResult = lotto.getLottoResult();
        System.out.println("Twoje liczby: " + userNumbers);
        System.out.println("Wynik losowania: " + lottoResult);
        System.out.println("Liczba trafień: " + result);


    }

    private static List<Integer> readNumbersFromUser() {
        List<Integer> userNumbers= new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < Lotto.MAX_NUMBERS; i++) {
            System.out.println("Podaj kolejną liczbę");
            int number = input.nextInt();
            userNumbers.add(number);


        }return  userNumbers;
    }
}
