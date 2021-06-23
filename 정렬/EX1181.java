import java.util.*;
 
public class EX1181 {
	public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		
		int n = sc.nextInt();
		
		
		sc.nextLine();
		String tmp;
		for(int i = 0; i < n; i++) {
			tmp = sc.nextLine();
			
			if(!list.contains(tmp)) list.add(tmp);
		}
		
		list.sort((a, b) -> {
			if(a.length() == b.length()) {
				return a.compareTo(b);
			} else {
				return a.length() - b.length();
			}
		});
		
		for(String a : list) {
		  sb.append(a).append("\n");
		}
		
		System.out.println(sb);
	}
}