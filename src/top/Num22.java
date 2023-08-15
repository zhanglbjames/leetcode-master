package top;

public class Num22 {

   static class Solution {
        String zero="0";
        public int compareVersion(String version1, String version2) {
            String[] v1Nums=version1.split("\\.");
            String[] v2Nums=version2.split("\\.");
            int n = v1Nums.length;
            int m = v2Nums.length;
            int np= 0;
            int mp=0;
            while(np<n||mp<m){
                if(np<n && mp<m){
                    int compare=compare(v1Nums[np++],v2Nums[mp++]);
                    if(compare!=0){
                        return compare;
                    }
                }else if(np<n){
                    int compare=compare(v1Nums[np++],zero);
                    if(compare!=0){
                        return compare;
                    }
                }else{
                    int compare=compare(zero,v2Nums[mp++]);
                    if(compare!=0){
                        return compare;
                    }
                }
            }
            return 0;
        }

        private int compare(String s1,String s2){
            int sum1= sum(s1);
            int sum2= sum(s2);
            return Integer.compare(sum1,sum2);
        }

        private int sum(String s){
            char[] chars = s.toCharArray();

            int sum=0;
            for(int i=chars.length-1,j=1;i>=0;i--,j=j*10){
                sum+= (chars[i]-'0') * j;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.compareVersion("0.1", "1.1");
        System.out.println(i);
    }
}
