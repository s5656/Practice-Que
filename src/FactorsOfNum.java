import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class FactorsOfNum {
    public static void main(String[] args) {
        int []num = {1,2,3,4,5,6};

        int m= 5;

        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {

                if (num[i]+num[j] == m){
                    System.out.print(num[i]+" "+num[j] + "   ");
                }
            }
        }
    }
}
