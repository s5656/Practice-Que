import java.util.Scanner;

public class PatternsOfWords {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter your name initial");
        String initial = input.next().toUpperCase();

        switch (initial) {
            case "A":
                charAPattern();
                break;
            case "B":
                charBPattern();
                break;
            case "C":
                charCPattern();
                break;
            case "D":
                charDPattern();
                break;
            case "E":
                charEPattern();
                break;
            case "F":
                charFPattern();
                break;
            case "G":
                charGPattern();
                break;
            case "H":
                charHPattern();
                break;
            case "I":
                charIPattern();
                break;
            case "J":
                charJPattern();
                break;
            case "K":
                charKPattern();
                break;
            case "L":
                charLPattern();
                break;
            case "M":
                charMPattern();
                break;
            case "N":
                charNPattern();
                break;
            case "O":
                charOPattern();
                break;
            case "P":
                charPPattern();
                break;
            case "Q":
                charQPattern();
                break;
            case "R":
                charRPattern();
                break;
            case "S":
                charSPattern();
                break;
            case "T":
                charTPattern();
                break;
            case "U":
                charUPattern();
                break;
            case "V":
                charVPattern();
                break;
            case "W":
                charWPattern();
                break;
            case "X":
                charXPattern();
                break;
            case "Y":
                charYPattern();
                break;
            case "Z":
                charZPattern();
                break;







        }
    }
    private static void charZPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (i == 0 || i== num-1 || i + j==num-1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charYPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (j == 2 && i>2|| i == j && i<=2 || i+j == 4 && i<=2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charXPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (i == j|| i+j == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charWPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (j == 0 || j== num-1 || i == j && i>2 || i+j == 4 && i>=2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charVPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if ((j == 0 && i <3)|| (j == num-1 && i <3) || (i+j==4 && i==3) ||i+j ==6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charUPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (j == 0 || j == num-1 || i == num-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charTPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (i == 0 || j == 2 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charSPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if ((j == 0 && i<3) || (j == num-1 && i >2) || i == 0 || i == 2 || i ==num-1 ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charRPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (j == 0 || (j == num-1 && i <3) || i == 0 || i == 2 ) { 
                    System.out.print("* ");
                } else if (i==3 && j ==2 || i+j == 8) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charQPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if ((j == 0 && i<3) || (j == num-1 && i <3) || i == 0 || i == 2 ||(i==3 && j ==2 || i+j == 8)) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charPPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (j == 0 || (j == num-1 && i <3) || i == 0 || i == 2 ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charOPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (j == 0 || j == num-1 || i == 0 || i==num-1 ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charNPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (j == 0 || j == num-1 || i == j ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charMPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (j == 0 || j == num-1) {
                    System.out.print("* ");
                } else if (i == j && i < 3 || i+j == num-1 && i < 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charLPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (j == 0 || i == num-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charKPattern() {

        int num = 5;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == 1 ) {
                    System.out.print("* ");
                } else if (i == 3 && j < 4) {
                    System.out.print("* ");
                } else if (i > 3 && j == i) {
                    System.out.print("* ");
                } else if (i+j == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charJPattern() {
        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (i == 0 || j == num-3) {
                    System.out.print("* ");
                } else if ((i==num-1 && j <=2)||(j==0 && i > 2) ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charIPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (i == 0 || i == num-1 || j == num-3) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charHPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (j == 0 || j == num-1 || i == num-3) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charGPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (i == 0 || j == 0 || i == num-1 ) {

                    System.out.print("* ");
                }
                else if ((i == 2 && j >= 2 )||(i == num-2 && j == num-1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charFPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (i == 0 || j == 0 || i == num-3) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charEPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (i == 0 || j == 0 || i == num - 1 || i == num-3) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charCPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (i == 0 || j == 0 || i == num - 1 ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charDPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (i == 0 || j == 0 || i == num - 1 || j == num - 1 ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charBPattern() {

        int num = 5 ;
        for (int i = 0; i < num ; i++) {
            for (int j =0 ;j < num;j++) {
                if (i == 0 || j == 0 || i == num - 1 || j == num - 1 || i == num - 3) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void charAPattern(){
        int num = 5 ;
        for (int i = 1; i <= num ; i++) {
            for (int j = 0; j < num-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == num-2 || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
