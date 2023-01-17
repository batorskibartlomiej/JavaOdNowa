package src.tablice;

public class Arrays2d {
    public static void main(String[] args) {

//        double [][] numbers = new double[3][3];
//        numbers [0][0] = 1.0;
//        numbers [0][1] = 1.5;
//        numbers [0][2] = 2.0;
//        numbers [1][0] = 1.5;
//        numbers [1][1] = 2.0;
//        numbers [1][2] = 2.5;
//        numbers [2][0] = 2.0;
//        numbers [2][1] = 2.5;
//        numbers [2][2] = 3.0;

        double [][] numbers = {
                {1.0, 1.5, 2.0},
                {1.5, 2.0, 2.5},
                {2.0, 2.5, 3.0}
        };


        Arrays2dCounting arrays2dCounting = new Arrays2dCounting();
        double result= arrays2dCounting.addRatioDiagonal(numbers);
        System.out.println("Suma iloczynów przekątnych tablicy = "+result );

        double result2 = arrays2dCounting.addRatioSumMiddleRowAndMiddleColumn(numbers);
        System.out.println("Iloczyn sum środkowego wiersza i środkowej kolumny tablicy = "+ result2);

        double result3= arrays2dCounting.addEdges(numbers);
        System.out.println("Sumę wszystkich elementów znajdujących się przy krawędzi tablicy: "+ result3);


    }
}
