import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem8 {
    public static void main(String args[]){

        File file = new File("Problem8.txt");
        int product = 1, biggest = 0;
        int[] digits = new int[1000];

        try {
            Scanner sc = new Scanner(file).useDelimiter("");
            for (int x = 0; x < digits.length; x++)
                digits[x] = sc.nextInt();

            for (int x = 0; x < digits.length - 12; x++){
                for (int y = 0; y < 12; y++) {
                    product *= digits[x + y];
                }

                if(product > biggest)
                    biggest = product;

                product = 1;
            }

            System.out.println(biggest);

            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("oops");
        }
    }
}