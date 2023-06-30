package backtrack;

import java.util.*;

public class Backtrack0077 {

    private LinkedList<Integer> path = new LinkedList<>();
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (k > n || n <= 0) {
            return result;
        }

        backtrack(1, n, k);
        return result;
    }

    public void backtrack(int start, int n, int k) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n; i++) {
            path.addLast(i);
            backtrack(i + 1, n, k);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        Backtrack0077 backtrack0077 = new Backtrack0077();
        List<List<Integer>> combine = backtrack0077.combine(5, 3);
        System.out.println(combine);

    }
}
