public class Problem6 {

    public static void main(String args[]){
        int sumOfSquares = 0;
        int squareOfSums = 0;

        for (int x = 1; x <= 100; x++){
            sumOfSquares += x * x;
            squareOfSums += x;
        }
        squareOfSums *= squareOfSums;

        System.out.println(squareOfSums - sumOfSquares);
    }
}
