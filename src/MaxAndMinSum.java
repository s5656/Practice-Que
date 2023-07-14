import java.util.Arrays;

public class MaxAndMinSum {
//    public static void main(String[] args) {
//        int [] num = {1,2,3,4,5};
//
//        Arrays.sort(num);
//
//        System.out.println(minSum(num));
//        System.out.println(maxSum(num));
//
//
//    }
//    public static int minSum(int[] num){
//        int sum= 0;
//        for (int i = 0;i < 4;i++){
//            sum += num[i];
//        }
//        return sum;
//    }
//    public static int maxSum(int[] num){
//        int sum= 0;
//        for (int i = num.length-1;i >= num.length-4;i--){
//            sum += num[i];
//        }
//        return sum;
//    }




        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            int k =4 ; // Window size

            int maxSum = findMaxSum(array, k);
            int minSum = findMinSum(array, k);

            System.out.println("Max Sum: " + maxSum);
            System.out.println("Min Sum: " + minSum);
        }

        public static int findMaxSum(int[] array, int k) {
            int maxSum = Integer.MIN_VALUE;

            System.out.println(maxSum);

            for (int i = 0; i <= array.length - k; i++) {
                int sum = 0;
                for (int j = i; j < i + k; j++) {
                    sum += array[j];
                }
                maxSum = Math.max(maxSum, sum);
            }

            return maxSum;
        }

        public static int findMinSum(int[] array, int k) {
            int minSum = Integer.MAX_VALUE;

            System.out.println(minSum);

            for (int i = 0; i <= array.length - k; i++) {
                int sum = 0;
                for (int j = i; j < i + k; j++) {
                    sum += array[j];
                }
                minSum = Math.min(minSum, sum);
            }

            return minSum;
        }
    }
