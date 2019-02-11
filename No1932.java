
import java.util.*;
import java.math.*;

// f(x,y) =  now(x, y)  + sum(x-1, y-1)

public class No1932 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] ad = new int[n][n];
		int[][] cache = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				ad[i][j] = sc.nextInt();
				cache[i][j] = -1;
			}
		} // for

		// start값.
		int i = 0;
		int j = 0;

		int ret = calc(cache, ad, i, j);
		System.out.println(ret);

	}

	private static int calc(int[][] cache, int[][] ad, int i, int j) {
		// TODO Auto-generated method stub
		// 기저 삼각형 밖의 좌표
		int n = ad.length;
		if (i == n - 1) {
			return ad[i][j];
		}
		/*
		 * if (i < j) return 0;
		 */
		int ret = cache[i][j];
		// System.out.println(ret);
		//System.out.println(i + "," + j + "," + ret);
		// 기저 방문했을경우.

		if (ret != -1) {
			return ret;
		}
		cache[i][j] = ret;

		return ret = Math.max(calc(cache, ad, i + 1, j), calc(cache, ad, i + 1, j + 1)) + ad[i][j];

	}
}
