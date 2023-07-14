import java.util.Arrays;

public class BinarySortWithOnlyOneLoop {
    public static void main(String[] args) {
        int [] num = {0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1};

        System.out.println(Arrays.toString(sortArray(num)));
    }
    public static int[] sortArray(int[] binary){

        int right = binary.length-1;
        int left = 0;

        while (left <= right){
            if(binary[left] == 0){
                left++;
            }
            else if (binary[right] == 1){
                right--;
            }
            else {
                int temp = binary[left];
                binary[left] = binary[right];
                binary[right] = temp;
                left++;
                right--;
            }

        }

        return binary;
    }
}

