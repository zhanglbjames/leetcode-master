package top;

public class Num33 {
   static class Solution {
        public String minWindow(String s, String t) {
            if(t.length()>s.length()){
                return "";
            }
            // -1 表示不存在，大于等于0表示存在
            int[] charMap = new int[26*2];
            for(char c:t.toCharArray()){
                int index;
                if (c>'Z'){
                    index=  26+ c-'a';
                }else {
                    index= c - 'A';
                }
                charMap[index]=charMap[index]+1;
            }

            int start=0;
            int end=-1;
            int min=Integer.MAX_VALUE;
            String res="";

            int[] tmpMap = new int[26*2];
            while(end<s.length()-1){
                end++;
                tmpMap[index(s,end)]=tmpMap[index(s,end)]+1;

                while (match(charMap,tmpMap) && start<=end){
                    if(end-start+1<min){
                        res=s.substring(start,end+1);
                        min = end-start+1;
                    }
                    tmpMap[index(s,start)]=tmpMap[index(s,start)]-1;
                    start++;
                }

            }
            return res;
        }

        private boolean match(int[] charMap, int[] tmpMap){
            for(int i=0;i<charMap.length;i++){
                if(charMap[i]>tmpMap[i]){
                    return false;
                }
            }
            return true;
        }

        private  int index(String s, int at){
            char c = s.charAt(at);
            if (c>'Z'){
                return  26+ c-'a';
            }else {
                return c - 'A';
            }
        }
    }

    public static void main(String[] args) {
        Solution ss = new Solution();
        String s = ss.minWindow("cabwefgewcwaefgcf", "cae");

        System.out.println('b'-'A');
        System.out.println(s);
    }
}
