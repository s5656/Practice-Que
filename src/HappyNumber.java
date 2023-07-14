public class HappyNumber {
    public static void main(String[] args) {
        int num = 23;
        int value = sqNumber(num);

        while (value>9){
            value = sqNumber(value);
        }

        if(value==1){
            System.out.println("happy");
        }else {
            System.out.println("not happy");
        }
    }
    public static int sqNumber(int num){

        int sq=0;
        while (num>0){
            int value = num%10;

            sq += value*value;

            num/=10;

        }
        return sq;
    }
}
