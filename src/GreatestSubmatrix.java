public class GreatestSubmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, -1, -4, -20},
                {-8, -3, 4, 2, 1},
                {3, 8, 10, 1, 3},
                {-4, -1, 1, 7, -6}
        };

        int greatestSubmatrixSum = findGreatestSubmatrix(matrix);
        System.out.println("Greatest Submatrix Sum: " + greatestSubmatrixSum);
    }

    public static int findGreatestSubmatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int maxSum = Integer.MIN_VALUE;

        for (int left = 0; left < cols; left++) {
            int[] temp = new int[rows];
            for (int right = left; right < cols; right++) {
                for (int i = 0; i < rows; i++) {
                    temp[i] += matrix[i][right];
                }
                int currentMax = kadane(temp);
                maxSum = Math.max(maxSum, currentMax);
            }
        }

        return maxSum;
    }

    public static int kadane(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
