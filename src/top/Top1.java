package top;

import java.util.*;

public class Top1 {
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }

            LinkedList<Character> q = new LinkedList<>();
           Set<Character> set = new HashSet<>();

            int maxLen = 1;
            for (int i = 0; i < s.length(); i++) {
                if (!set.contains(s.charAt(i))) {
                    set.add(s.charAt(i));
                } else {
                    for (; ; ) {
                        if (q.size() == 0) {
                            break;
                        }
                        Character c = q.getFirst();
                        if (c != s.charAt(i)) {
                            q.removeFirst();
                            set.remove(c);
                        } else {
                            break;
                        }
                    }
                    if (q.size() > 0) {
                        q.removeFirst();
                        set.remove(s.charAt(i));
                    }
                }
                q.addLast(s.charAt(i));
                set.add(s.charAt(i));
                maxLen = Math.max(maxLen, q.size());
            }
            return maxLen;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int tmmzuxt = solution.lengthOfLongestSubstring("tmmzuxt");
        System.out.println(tmmzuxt);

    }
}
