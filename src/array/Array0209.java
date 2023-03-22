package array;

public class Array0209 {

    public static void main(String[] args) {


        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        int target = 7;
        int i = minSubArrayLen(target, nums);
        System.out.println(i);

    }



    public static int minSubArrayLen(int target, int[] nums) {
        int len = 0;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                int subLen = i - left + 1;
                if (len == 0 || subLen < len) {
                    len = subLen;
                }
                sum -= nums[left];
                left++;
            }
        }
        return len;
    }
}
