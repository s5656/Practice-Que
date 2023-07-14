import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BreakTheNumberArray {
    public static void main(String[] args) {
        int[] num = {10,11,9,41};

        numbers(num);

    }
    public static void numbers(int [] num){

        List<Integer>temp = new ArrayList<>();

        for (int i=0 ; i< num.length ; i++) {

            int n = num[i];

                while (n > 0){
                   int value = n % 10;

                    temp.add(value);

                    n/=10;
                }
            }
        Collections.sort(temp);

        System.out.println(temp);

        for (int i = temp.size()-1; i >= 0; i--) {
            System.out.print(temp.get(i));
        }
        }
}

