// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        hollowTriangle(4);
    }

    public static void hollowTriangle(int num){
        for (int i = 0; i <= num; i++) {

            for (int j =num-i;j>0;j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                // printing stars.
                if (k == 1 || i == num || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    public static void butterflyPattern(int num){
        for (int i = 0; i <= num*2; i++) {

            int s = i>num? i-num: num-i;

            for (int j = 0; j <= s; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void roumbusSq(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num-i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void zeroOnePyramid(int num){

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                if ((i+j)%2 ==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            for (int j = num-i; j >= 1; j--) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void increaseNumberPyramid(int  num){
        int count=1;
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(count++ +" ");
            }
            for (int j = 0; j < num-i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
        
    }
    public static void numberTriangle(int num){
        int i,j;
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void hollowSq(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 || i ==0 || j == num-1 || i == num-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern6(int num){
        int value=num;
        for (int row = 0; row <= num*2; row++) {
            for (int col = 0; col <= num*2; col++) {
                    int elementAt =value-Math.min( Math.min(row,col),Math.min(2*num-row,2*num-col));

                System.out.print(elementAt +" ");
            }
                System.out.println();
            }
        }
    public static void pattern5(int num){
        for (int i = 1; i <= num*2; i++) {

            int space = num<i ? i-num : num-i;

            int numberControl = i>num ? 2*num-i : i;

            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = numberControl; j >= 1; j--) {
                System.out.print(j +" ");
            }
            for (int j = 2; j <= numberControl; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int num){
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num -i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j +" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void pattern3a(int num){
        for(int i=0;i<=num*2;i++){

            int stars =i > num? 2*num -i : i;
            int spaces = num-stars;

            for(int j= 0;j<=spaces;j++){
                System.out.print("  ");
            }

            for(int j= 0;j<=stars*2;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int num){
        for(int i=0;i<=num*2;i++){

            int spaces = i-num >= 0 ? i-num:num-i;
            int stars = num-spaces;

            for(int j= 0;j<=spaces;j++){
                System.out.print("  ");
            }

            for(int j= 0;j<=stars*2;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    } // 3 and 3a are same with diff logics
    public static void pattern2(int num){
        for(int i=0;i<num*2;i++){
            if(i < num){
                for(int j=0;j<i;j++){
                    System.out.print("* ");
                }
            }else{
                for(int j=0;j<num*2-i;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern1(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<=num;i++){
            for(int j=0;j<=num-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}