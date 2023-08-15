package top;

import java.util.LinkedList;

public class Num53 {

    static class Solution {
        public int maxSubArray(int[] nums) {
            if(nums==null || nums.length==0){
                return 0;

            }
            if(nums.length==1){
                return nums[0];
            }

            int start=0;
            int end=0;
            int sum=0;
            int max=Integer.MIN_VALUE;

            while(start<=end && end<nums.length){
                sum+=nums[end];
                max=Math.max(max,sum);

                if(sum<=0){
                    end++;
                    start=end;
                    sum = 0;
                }else{
                    end++;
                }

            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int maxed = solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(maxed);
    }
}
