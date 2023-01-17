package src.tablice;

public class Arrays2dCounting {

    double addRatioDiagonal( double [][]x){
        return (x[0][0] * x[1][1]* x[2][2]) +(x[0][2]*x[1][1]*x[2][0]);
    }

    double addRatioSumMiddleRowAndMiddleColumn( double [][]x){
        return (x[1][0]+ x[1][1]+x[1][2])* (x[0][1]+x[1][1]+x[2][1]);
    }

    double addEdges( double [][]x){

        return x[0][0]+ x[0][1]+ x[0][2]+ x[1][2]+ x[2][2]+ x[2][1]+x[2][0]+x[1][0];
    }
}
