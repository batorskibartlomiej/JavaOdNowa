package src.Zbiory;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class NameReader {

    public static void main(String[] args) {
        final String fileName = "names3.txt";
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        try(Scanner sc = new Scanner(new File(fileName))){
            while (sc.hasNextLine()) {
                names.add(sc.nextLine());
            }
                System.out.println("Liczba unikalnych imion "+names.size());
                System.out.println("Pierwsze "+ names.first());
                System.out.println("Ostatnie "+ names.last());

        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku "+fileName);
        }

    }


}
