package array;

public class Array0027 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 3, 4, 6, 7};
        int val = 1;


        int i = removeElement(nums, val);
        System.out.println(i);
    }

    public static int removeElement(int[] nums, int val) {

        int indexForSet = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[indexForSet++] = nums[i];
            }
        }

        return indexForSet;
    }
}
