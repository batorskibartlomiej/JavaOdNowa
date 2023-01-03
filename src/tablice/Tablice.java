package src.tablice;

public class Tablice {

    public static void main(String[] args) {

        int[] inty= {1,3,5};
        int[] inty2={6,8,9};

        System.out.println(inty[0]+inty[1]+inty[2]+inty2[0]+inty2[1]+inty2[2]);

        ArraySum arraySum = new ArraySum();
        int sum = arraySum.arraysSum(inty,inty2);
        System.out.println("liczymy ponownie "+sum);

    }
}
