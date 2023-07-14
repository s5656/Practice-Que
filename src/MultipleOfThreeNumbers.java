public class MultipleOfThreeNumbers {
    public static void main(String[] args) {
        int num = 24;

        int [] arr = {1,2,3,4,5,6,8,9};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                        if(arr[i]*arr[j]*arr[k] == num){
                            System.out.print(arr[i] +" "+arr[j] +" "+ arr[k]+"  " +
                                    "");
                            break;
                        }
                }

            }
        }
    }
}
