import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        for(int test_case = 1; test_case <= t; test_case++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int mx = 0;
            for (int i = 0; i < n - m + 1; i++) {
                for (int j = 0; j < n - m + 1; j++) { // (i, j)가 시작점
                    int hap = 0;
                    for (int r = i; r < i + m; r++) {
                        for (int c = j; c < j + m; c++) {
                            hap += arr[r][c];
                        }
                    }
                    mx = Math.max(hap, mx);
                }
            }

            System.out.println("#" + test_case + " " + mx);
        }
    }
}