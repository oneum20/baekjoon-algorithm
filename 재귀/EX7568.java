import java.util.Scanner;
import java.util.Arrays;

class EX7568 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    sc.nextLine(); // 개행문자 삭제
    
    String[] strArr = new String[n];
    for(int i = 0; i < n; i++){
      strArr[i] = sc.nextLine();
    }
    
    int[] res = f(strArr, n);
    
    for(int i : res){
      System.out.print((i + 1) + " ");
    }
  }
  
  public static int[] f(String[] strArr, int n){
    int[] cnt = new int[n];
    
    // counting
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        if(i == j) continue;
        
        int[] source = Arrays.stream(strArr[i].split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] target = Arrays.stream(strArr[j].split(" ")).mapToInt(Integer::parseInt).toArray();
        
        if(source[0] < target[0] && source[1] < target[1]) cnt[i]++;
      }
    }
    
    return cnt;
  }
  
}