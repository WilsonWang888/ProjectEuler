public class Problem4 {


    public static boolean isPalindrome(int num){
        int rev = 0;
        int dup = num;

        while(dup > 0) {
            rev = 10 * rev + dup % 10;
            dup /= 10;
        }

        if(num == rev)
            return true;
        return false;
    }

    public static boolean isFactorable(int num){
        for(int x = 100; x < 999; x++){
            if(num % x == 0 && num / x >= 100 && num / x <= 999)
                return true;
        }
        return false;
    }

    public static void main(String args[]) {

        for(int x = 998001; x >= 0; x--) {
            if(isPalindrome(x)) {
                if(isFactorable(x)){
                System.out.print(x);
                break;
                }
            }
        }
    }

}
