package hash;

import java.util.ArrayList;
import java.util.List;

public class Hash1002 {

    public static List<String> commonChars(String[] words) {
        int[][] countHash = new int[words.length][26];

        // count
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            for (char aChar : chars) {
                int index = aChar - 'a';
                countHash[i][index] = countHash[i][index] + 1;
            }
        }

        int[] base = countHash[0];
        for (int i = 1; i < countHash.length; i++) {
            int[] ints = countHash[i];
            for (int i1 = 0; i1 < ints.length; i1++) {
                base[i1] = Math.min(base[i1], ints[i1]);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < base.length; i++) {
            int count = base[i];
            while (count > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                count--;
            }
        }
        return result;
    }
}
