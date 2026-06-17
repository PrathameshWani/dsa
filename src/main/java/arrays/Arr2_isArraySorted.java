package arrays;

public class Arr2_isArraySorted {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        System.out.println("Is Array Sorted : " + isArraySorted(arr));
    }

    public static boolean isArraySorted ( int[] nums){
        boolean flag = false;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] >= nums[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }
}
