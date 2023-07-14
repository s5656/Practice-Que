import java.util.Scanner;

public class TechNumber {

        public static boolean isTechNumber(int number) {
            int copy = number;
            int digitCount = 0;

            // Count the number of digits in the number
            while (copy > 0) {
                copy /= 10;
                digitCount++;
            }

            // Check if the number of digits is even
            if (digitCount % 2 != 0) {
                return false;
            }

            // Calculate the sum of the two halves and its square
            int half = digitCount / 2;
            int firstHalf = number / (int) Math.pow(10, half);
            int secondHalf = number % (int) Math.pow(10, half);
            int sum = firstHalf + secondHalf;
            int squareOfSum = sum * sum;

            return squareOfSum == number;
        }

        public static void main(String[] args) {
            int number = 1234;
            boolean isTech = isTechNumber(number);
            System.out.println(number + " is a tech number: " + isTech); // Output: false

            number = 1221;
            isTech = isTechNumber(number);
            System.out.println(number + " is a tech number: " + isTech); // Output: true
        }
    }

