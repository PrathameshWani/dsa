package arrays;

public class Arr1_FindingBigSmallNo {
    public static void main(String[] args) {

        int arr[] = {1, 2, 6, 4, 5, 4};
        System.out.println("Biggest No : " + findingBiggest(arr));
        System.out.println("Smallest No : " + findingSmallest(arr));

        System.out.println("#############################################################");

        System.out.println("Second Biggest : " + findingSecondBiggest(arr));
        System.out.println("Second Biggest : " + findingSecondSmallest(arr));

    }

    public static int findingBiggest(int[] nums) {
        int biggest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > biggest) {
                biggest = nums[i];
            }
        }
        return biggest;
    }

    public static int findingSmallest(int[] nums) {
        int smallest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        return smallest;
    }

    public static int findingSecondBiggest(int[] nums) {

        int big = nums[0];
        int secondBig = -1;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] > big){
                secondBig = big;
                big = nums[i];
            }else if(nums[i] < big && nums[i] > secondBig){
                secondBig = nums[i];
            }
        }

        return secondBig;

    }

    public static int findingSecondSmallest(int[] nums) {
        int small = nums[0];
        int secondSmall = Integer.MAX_VALUE;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] < small){
                secondSmall = small;
                small = nums[i];
            }else if(nums[i] > small && nums[i] < secondSmall){
                secondSmall = nums[i];
            }
        }




        return secondSmall;
    }


}
