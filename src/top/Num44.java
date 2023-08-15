//package top;
//
//import java.util.Arrays;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Num44 {
//    static class Solution {
//
//        public int coinChange(int[] coins, int amount) {
//
//            String collect = Stream.of(coins)
//                    .map(String::valueOf)
//                    .sorted((n1, n2) -> n1.compareTo(n2))
//                    .collect(Collectors.joining());
//
//
//
//
//
//            Stream.of(coins).map(String::valueOf).sorted().collect(Collectors.joining())
//            int[] dp = new int[amount+1];
//            Arrays.sort(dp,(o1,o2)->Integer.compare(o1,o2));
//            Character.compare()
//            dp[0]=0;
//
//            for(int i=1;i<=amount;i++){
//                int min=Integer.MAX_VALUE;
//                for(int j=0;j<coins.length;j++){
//                    if(i-coins[j]>=0){
//                        min=Math.min(min,dp[i-coins[j]]+1);
//                    }
//                }
//                dp[i]=min;
//
//            }
//            return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Stream.of(args).collect(Collectors.groupingBy(Function.identity(),Collectors::counting))
//        Solution solution = new Solution();
//        int change = solution.coinChange(new int[]{1, 2, 5}, 11);
//        System.out.println(change);
//        String.valueOf()
//        Arrays.sort(new int[]{111},(o1,o2)->Integer.compare(o1,o2))
//        "".compareTo()
//        Integer.compare()
//        new String()
//    }
//}
