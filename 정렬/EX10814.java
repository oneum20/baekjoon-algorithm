import java.util.*;
 
public class EX10814 {
	public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[][] person = new String[n][2];
		
		sc.nextLine();
		String[] tmp = new String[2];
		for(int i = 0; i < n; i++) {
			tmp = sc.nextLine().split(" ");
			
			person[i][0] = tmp[0];
			person[i][1] = tmp[1];
		}
		
		Arrays.sort(person, (a, b) -> {
		  int n1 = Integer.parseInt(a[0]);
		  int n2 = Integer.parseInt(b[0]);
		  
			return n1 - n2;
		});
		
		for(String[] a : person) {
		  sb.append(a[0] + " " + a[1]).append("\n");
		}
		
		System.out.println(sb);
	}
}