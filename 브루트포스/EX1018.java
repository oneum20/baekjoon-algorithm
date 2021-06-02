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
    
    String[] tmp = new String[8];
    for(int i = 0; i + 7 < n; i++){
      for(int j = 0; j + 7 < m ; j++){
        for(int k = 0; k < 8; k++){
          tmp[k] = strArr[j + k].substring(i, i + 8);
        }
        min = Math.min(min, minCntDiff(tmp));
      }
    }
    
    return min;
  }
  
  public static int minCntDiff(String[] source){
    int cnt = 0;
    int min = Integer.MAX_VALUE;
    int[][] targets = {
      {0b10101010,
      0b01010101},
      {0b01010101,
      0b10101010}
    };
    
    int tmp;
    for(int[] item : targets){
      for(int i = 0; i < source.length; i++){
        tmp = Integer.parseInt(source[i], 2);
        cnt += Integer.bitCount(tmp^item[i%2]);
      }
      min = Math.min(min, cnt);
      cnt = 0;
    }
    
    return min;
  }
  
}
