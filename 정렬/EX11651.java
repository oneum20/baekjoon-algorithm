import java.util.Scanner;
import java.util.Arrays;
 
public class EX11651 {
	public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[][] pos = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			pos[i][0] = in.nextInt();
			pos[i][1] = in.nextInt();
		}
		
		Arrays.sort(pos, (a, b) -> {
			if(a[1] == b[1]) {
				return a[0] - b[0];
			} else {
				return a[1] - b[1];
			}
		});
		
		for(int[] a : pos) {
		  sb.append(a[0] + " " + a[1]).append("\n");
		}
		
		System.out.println(sb);
	}
}