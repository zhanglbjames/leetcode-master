package array;

public class Array0977 {

    public static void main(String[] args) {

    }

    public static int[] sortedSquares(int[] nums) {
        int[] newNums = new int[nums.length];

        int i = 0;
        int j = nums.length - 1;
        int indexCount = nums.length - 1;

        while (i <= j) {
            int left = nums[i];
            int right = nums[j];
            if (Math.abs(left) > Math.abs(right)) {
                newNums[indexCount--] = left * left;
                i++;
            }else {
                newNums[indexCount--] = right * right;
                j--;
            }
        }
        return newNums;
    }
}
