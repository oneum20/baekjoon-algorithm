import java.util.*;


public class EX15650 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        ArrayList<String> list = new ArrayList<>();
        bt(N, M, 1, list, "");
        for(String str : list){
          sb.append(str).append("\n");
        }
        
        System.out.println(sb);
    }
    
    public static void bt(int N, int M, int start, ArrayList<String> list, String curr){
      if(M <= 0){
        list.add(curr);
        return;
      }
      
      for(int i = start; i <= N; i++){
        bt(N, M - 1, i + 1, list, curr + i + " ");
      }
    }
    
}