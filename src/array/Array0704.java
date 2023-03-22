package array;

public class Array0704 {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target =10;

        int search = search(nums, target);
        System.out.println(search);

    }

    public static int search(int[] nums, int target) {
        if (nums[0] > target) {
            return -1;
        }

        if (nums[nums.length - 1] < target) {
            return -1;
        }

        int startIndex = 0;
        int endIndex = nums.length - 1;

        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                startIndex = mid + 1;
            } else {
                endIndex = mid - 1;
            }
        }

        return -1;
    }
}
