public class ReversePrint {
    public static void main(String[] args) {

        int num=5;

        printNumberInReverseTillOne(num);
        printNumberInReverseTillOneThenTillNum(num);
        printNumberInOneToNum(num);
    }
    private static void printNumberInReverseTillOne(int num){
        if(num == 0){
            return ;
        }
        System.out.println(num);
         printNumberInReverseTillOne(num-1);
    }
    private static void printNumberInOneToNum(int num){
        if(num == 0){
            return ;
        }
        printNumberInOneToNum(num-1);
        System.out.println(num);
    }
    private static void printNumberInReverseTillOneThenTillNum(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        printNumberInReverseTillOneThenTillNum(num-1);
        System.out.println(num);
    }
}
