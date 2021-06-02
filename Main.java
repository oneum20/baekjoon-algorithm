import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int m = sc.nextInt();
    int n = sc.nextInt();
    sc.nextLine();
    
    
    String[] strArr = new String[m];
    for(int i = 0; i < m; i++){
      strArr[i] = sc.nextLine().replace("W","1").replace("B","0");
    }
    
    System.out.println(f(strArr, m, n));
  }
  
  public static int f(String[] strArr, int m, int n){
    int min = Integer.MAX_VALUE;
    
    String strTmp = "";
    int[] cntTmp = new int[2];
    int[] cnt = new int[2];
    for(int i = 0; i + 7 < n; i++){
      for(int j = 0; j + 7 < m ; j++){
        for(int k = 0; k < 8; k++){
          strTmp = strArr[j + k].substring(i, i + 8);
          cntTmp = minCntDiff(strTmp, k);
          
          cnt[0] += cntTmp[0];
          cnt[1] += cntTmp[1];
        }
        
        min = Math.min(min, Math.min(cnt[0], cnt[1]));
        
        cnt[0] = 0;
        cnt[1] = 0;
      }
    }
    
    return min;
  }
  
  public static int[] minCntDiff(String source, int i){
    int[] res = new int[2];
    int[][] targets = {
      {0b10101010,
      0b01010101},
      {0b01010101,
      0b10101010}
    };
    
    int tmp = Integer.parseInt(source, 2);
    res[0] = Integer.bitCount(tmp^targets[0][i%2]);
    res[1] = Integer.bitCount(tmp^targets[1][i%2]);
    return res;
  }
  
}