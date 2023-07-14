public class ReverseTheDigitRecursion {
    public static void main(String[] args) {
       reverseTheDigit(12345);
        System.out.println(sum);
    }
    static int sum = 0;
    private static void reverseTheDigit(int num){
        if(num == 0){
            return;
        }
        sum = num%10+sum*10;

        reverseTheDigit(num/10);

    }
}
