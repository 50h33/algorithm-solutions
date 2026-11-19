import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();

		for (int test_case = 1; test_case <= t; test_case++) {
            int n = sc.nextInt();
            // 일, 매매가
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 1; i <= n; i++) {
                int m = sc.nextInt();
                map.put(i, m);
            }

            int mx = map.get(n); long answer = 0;
            for (int i = n-1; i >= 1; i--) {
                int m = map.get(i);
                if (mx > m) {
                    answer += (mx - m);
                } else {
                    mx = Math.max(mx, m);
                }         
            }

            System.out.println("#" + test_case + " " + answer);
		}
	}
}