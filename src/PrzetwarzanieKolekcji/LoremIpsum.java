package src.PrzetwarzanieKolekcji;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class LoremIpsum {
    public static void main(String[] args)  {

        final String fileName = "text.txt";

        List<String> words = null;

        try {
            words = readFile(fileName);
            showWordStats(words);
        } catch (FileNotFoundException e) {
            System.err.println("Błąd odczytu pliku" + fileName);
        }



    }


//        List<String> words = new ArrayList<>();
//        String tmp = null;
//
//        while ((tmp = reader.readLine()) != null) {
//            words.addAll(Arrays.asList(tmp.split(" ")));
//        }


        private static void showWordStats (List < String > words) {
            long countsWords = words.stream()
                    .filter(s -> s.startsWith("s"))
                    .peek(s -> System.out.println(s + " "))
                    .count();
            System.out.println();

            long fiveLetters = words.stream()
                    .filter(s -> s.length() == 5)
                    .peek(s -> System.out.println(s + " "))
                    .count();
            System.out.println();

            System.out.println("Liczba wyrazów na 's': " + countsWords);
            System.out.println("Liczba wyrazów z 5 literami: " + fiveLetters);
        }

        private static List<String> readFile (String fileName) throws FileNotFoundException {
            var reader = new BufferedReader(new FileReader(fileName));
            List<String> words = new ArrayList<>();
            return reader.lines()
                    .map(line -> line.split(" "))
                    .flatMap(Arrays::stream)
                    .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                    .collect(Collectors.toList());

        }
    }


