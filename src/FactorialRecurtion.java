public class FactorialRecurtion {

    public static void main(String[] args) {
        System.out.println(factorialValue(5));
    }
    private static int factorialValue(int num){
        if(num == 1){
            return 1;
        }

        return factorialValue(num-1) * num;
    }
}
