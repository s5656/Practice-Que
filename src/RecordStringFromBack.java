import java.util.Arrays;
import java.util.Scanner;

public class RecordStringFromBack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String [] reverse = str.split(" ");

        System.out.println(Arrays.toString(reverse));

        for (int i = reverse.length-1; i >= 0 ; i--) {
            System.out.print(reverse[i] +" ");
        }
    }
}
