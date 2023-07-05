package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Backtrack40 {

    private LinkedList<Integer> path = new LinkedList<>();
    private int sum = 0;
    private List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, target, 0);
        return results;
    }

    private void backtrack(int[] candidates, int target, int startIndex) {
        if (sum == target) {
            results.add(new LinkedList<>(path));
            return;
        }
        for (int i = startIndex;  i < candidates.length && sum + candidates[i] <= target ; i++) {
            if (i > 0 && i - 1 >= startIndex && candidates[i] == candidates[i - 1]) {
                continue;
            }
            path.addLast(candidates[i]);
            sum += candidates[i];
            backtrack(candidates, target, i + 1);
            path.removeLast();
            sum -= candidates[i];
        }
    }

    public static void main(String[] args) {
        Backtrack40 backtrack40 = new Backtrack40();
        List<List<Integer>> lists = backtrack40.combinationSum2(new int[]{2,5,2,1,2}, 5);
        System.out.println(lists);
    }
}
