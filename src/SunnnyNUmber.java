import java.util.Scanner;

public class SunnnyNUmber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i < end; i++) {
            if(isSunnyNumber(i+1)){
                System.out.println("sunny number: "+i);
            }
        }
    }
    public static boolean isSunnyNumber(int num){
        return Math.sqrt(num)%1 == 0;
    }
}
