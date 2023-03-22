package array;

public class Array0059 {

    public static void main(String[] args) {


        int n =2;
        int[][] ints = doPrint(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[i][j]);
            }
            System.out.println("---------");
        }
    }

    private static int[][] doPrint(int n) {

        int mid = n / 2;
        boolean hasOne = n % 2 == 1;
        int[][] arrays = new int[n][n];
        int count = 1;
        if (hasOne) {
            arrays[mid][mid] = n * n;
        }
        for (int loop = 0; loop < mid; loop++) {
            int starti = loop;
            int endi = n - loop;
            int startj = loop;
            int endj = n - loop;

            // --->
            for (int loop1 = startj; loop1 < endj; loop1++) {
                arrays[starti][loop1] = count++;
            }

            // |
            //
            for (int loop2 = starti + 1; loop2 < endi; loop2++) {
                arrays[loop2][endj-1] = count++;
            }

            // <---
            for (int loop3 = endj - 2; loop3 >= startj; loop3--) {
                arrays[endi-1][loop3] = count++;
            }

            // |

            for (int loop4 = endi - 2; loop4 > starti; loop4--) {
                arrays[loop4][startj] = count++;
            }
        }
        return arrays;
    }
}

