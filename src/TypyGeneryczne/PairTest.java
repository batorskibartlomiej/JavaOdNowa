package src.TypyGeneryczne;

public class PairTest {

    public static void main(String[] args) {


        Pair<Integer, String> p1 = new Pair<>(1, "Joanna");
        Pair<Double, Double> p2 = new Pair<>(20.5, 31.7);
        Pair<String, String> p3 = new Pair<>("Jan", "Kowalski");

        printPair(p1);
        printPair(p2);
        printPair(p3);


    }
    static <T, V> void printPair(Pair<T,V> pair){
        System.out.println("<"+ pair.getT() +"; "+ pair.getV()+" >");
    }

    


}
