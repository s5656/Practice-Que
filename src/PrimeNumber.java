import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(isPrime(sc.nextInt()) ? "Is Prime Number" : "Not a Prime Number");
    }
    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if(num%i== 0){
                return false;
            }
        }
        return true;
    }
}
