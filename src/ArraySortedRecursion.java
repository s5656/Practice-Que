public class ArraySortedRecursion {
    public static void main(String[] args) {

        System.out.println(isArraySorted(new int[] {1,2,3,4,5,6,7,8,9},0));

    }
    private static boolean isArraySorted(int [] nums , int index){

        if(index == nums.length-1){
            return true;
        }

        return nums[index] < nums[index+1] && isArraySorted(nums, ++index);
    }
}
