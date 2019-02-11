
import java.util.*;
import java.math.*;

// f(x,y) =  now(x, y)  + sum(x-1, y-1)

public class No1933_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] ad = new int[n + 1][n + 1];
		int[][] cache = new int[n + 1][n + 1];

		int max = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				ad[i][j] = sc.nextInt();
				if (j == 1) {
					cache[i][j] = ad[i][j] + cache[i - 1][j];
				}else if(i==j) {
					cache[i][j] = ad[i][j] + cache[i - 1][j-1];
				}else {
				
					cache[i][j] = Math.max(cache[i - 1][j], cache[i - 1][j -1]) + ad[i][j];
				}
				// System.out.println(i+","+j);

				max = Math.max(max, cache[i][j]);
				//System.out.println(max);
			}
		}
		System.out.println(max);
	} // for

}
