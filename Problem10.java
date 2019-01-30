import java.util.ArrayList;

public class Problem10 {

    public static void main(String args[]){

        int sum = 0;
        boolean prime = true;

        ArrayList<Integer> list = new ArrayList<>();

        for(Integer x = 2; x < 2000000; x++){
            list.add(x);
        }

        for(int x = 0; x < list.size(); x++) {
            for (int y = 0; y < list.size(); y++) {
                if(list.get(y) % list.get(x) == 0 && list.get(y) != list.get(x)){
                    list.remove(y);
                    y--;
                }
            }
            sum += list.get(x);
        }
        System.out.print(sum);
    }
}
