public class Problem5 {
    public static boolean evenlyDivisible(int num){
        boolean divisible = true;

        for(int x = 1; x <= 20; x++) {
            if (num % x != 0)
                divisible = false;
        }
        return divisible;
    }
    public static void main(String[] args){
        int product = 1;

        do{
            product++;
        }while(!evenlyDivisible(product));
        System.out.println(product);
    }
}
