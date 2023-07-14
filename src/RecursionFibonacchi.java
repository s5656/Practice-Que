public class RecursionFibonacchi {
    public static void main(String[] args) {

        int num  = 50;
        for (int i = 0; i <= num; i++) {
            System.out.println(fibonacchi(i));
        }
    }
    public static long fibonacchi(int num){

        if (num < 2){
            return num;
        }

        long value = fibonacchi(num-1) + fibonacchi(num-2);

        return  value;
    }
}
