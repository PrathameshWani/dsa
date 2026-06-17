package arrays;
import java.util.HashSet;

public class Arr3_RemoveDeuplicateFromSortedArr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4, 5, 6};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> data = new HashSet<>();

        for (int a : nums) {
            data.add(a);
        }

        return data.size();
    }


}
