import java.util.Scanner;

class EX1010 {
  static int[][] dp = new int[30][30];
  
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();

    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    int[] n = new int[c];
    int[] m = new int[c];
    
    for(int i = 0; i < c; i++){
      n[i] = sc.nextInt();
      m[i] = sc.nextInt();

      sb.append(c(m[i], n[i]) + "\n");
    }

    System.out.println(sb);
  }
  
  public static int c(int n, int r){
    if(dp[n][r] > 0) return dp[n][r]; 
    
    if(n == r || r == 0){
      return dp[n][r] = 1;
    }
    
    return dp[n][r] = c(n - 1, r - 1) + c(n - 1, r);
  }
}