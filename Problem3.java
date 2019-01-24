public class Problem3 {
    public static void main(String[] args){
        double num = 600851475143.0;
        int factor = 1;

        do{
            for(int x = 2; x <= num; x++){
                if(num % x == 0) {
                    num = num / x;

                    if (x > factor)
                        factor = x;
                }
            }
        }while(num != 1);

        System.out.println(factor);
    }
}
