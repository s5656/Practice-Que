import java.util.Arrays;

public class EqualArray {
    public static void main(String[] args) {
        int [] a1 = {1,2,3,4,5,7};
        int [] a2 = {1,2,3,4,5,6};

int count =0;
        System.out.println(Arrays.equals(a1, a2));

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == a2[i]){
                count++;
            }
        }
        System.out.println(count == a1.length);



    }
}
