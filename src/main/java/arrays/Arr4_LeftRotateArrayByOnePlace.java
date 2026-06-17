package arrays;

import java.util.Arrays;

public class Arr4_LeftRotateArrayByOnePlace {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(rotateArrayToTheLeftByOnePlace(arr)));
    }
    public static int[] rotateArrayToTheLeftByOnePlace(int[] arr){
        int temp = arr[0];
        int n = arr.length;
        for(int i =1; i < n; i++){
            arr[i-1] = arr[i];
        }
        arr[n - 1] = temp;

        return arr;
    }
}
