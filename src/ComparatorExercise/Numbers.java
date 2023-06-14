package src.ComparatorExercise;

import java.util.Arrays;
import java.util.Comparator;

public class Numbers {

    public static void main(String[] args) {
        Integer[] numbers= { 1,5,6,7,2,9,0};

        System.out.println("Nieposortowana");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Posortowana rosnąco");
        System.out.println(Arrays.toString(numbers));


        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);

            }
        });

        System.out.println("Posortowana malejąco");
        System.out.println(Arrays.toString(numbers));




    }
}
