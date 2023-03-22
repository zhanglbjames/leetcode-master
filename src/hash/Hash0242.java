package hash;

import java.util.HashMap;
import java.util.Map;

public class Hash0242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            Integer count = charCount.get(c);
            if (count == null || count == 0) {
                return false;
            }
            charCount.put(c, count - 1);
        }
        return charCount.values().stream().noneMatch(count -> count != 0);
    }
}
