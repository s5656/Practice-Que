public class SumOfEachDigitRecursion {
    public static void main(String[] args) {
        System.out.println(eachDigit(1234));
    }
    private static int eachDigit(int num){
        if (num == 0){
            return num;
        }

        return eachDigit(num/10) + num%10;
    }
}
