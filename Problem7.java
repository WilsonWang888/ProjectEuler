public class Problem7 {

    public static boolean isPrime(int num){
        boolean prime = true;

        for(int x = 2; x < (num +1) / 2; x++){
            if(num % x == 0)
                prime = false;
        }
        return prime;
    }
    public static void main(String args[]){

        int counter = 1;

        for(int x = 10002; x > 0; x--){
            counter++;

            if(!isPrime(counter))
                x++;
        }
        System.out.println(counter);
    }
}
