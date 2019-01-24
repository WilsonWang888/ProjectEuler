public class Problem2 {
    public static void main(String[] args){

        int fib1 = 1, fib2 = 1, sum = 0, swap;

        do{
            swap = fib2;
            fib2 += fib1;
            fib1 = swap;

            if(fib2 % 2 == 0)
                sum += fib2;
        }
        while(sum < 4000000);

        System.out.print(sum);


    }
}
