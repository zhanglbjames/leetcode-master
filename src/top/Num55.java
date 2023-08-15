package top;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Num55 {

    static class Solution {
        public String largestNumber(int[] nums) {
            Integer[] numsArr = new Integer[1];
            return Stream.of(numsArr)
                    .map(String::valueOf)
                    .sorted((n1,n2)->-compare(n1,n2))
                    .collect(Collectors.joining());
        }


        private int compare(String n1,String n2){
            // if(n1.equals(n2)){
            //     return 0;
            // }
            // if(n1.startsWith(n2)){
            //     return -1;
            // }else if(n2.startsWith(n1)){
            //     return 1;
            // }

            int k=Math.min(n1.length(),n2.length());
            for(int i=0;i<k;i++){
                if(n1.charAt(i)!=n2.charAt(i)){
                    return Character.compare(n1.charAt(i),n2.charAt(i));
                }
            }
            return -Integer.compare(n1.length(),n2.length());
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String largestNumber = solution.largestNumber(new int[]{3, 30, 34, 5, 9});
        System.out.println(largestNumber);
    }
}
