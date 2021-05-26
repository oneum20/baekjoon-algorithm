import java.util.Scanner;

class EX2447 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int[][] res = Main.prt(n);
    
    for(int j = 0; j < res.length; j++){
      String str = "";
      for(int i = 0; i < res[0].length; i++){
        if(res[j][i] == 1){
          str += '*';
        }else{
          str += ' ';
        }
      }
      System.out.println(str);
    }
  }
  
  public static int[][] prt(int n){
    if(n == 3){
      return new int[][] {{1,1,1},{1,0,1},{1,1,1}};
    }else{
      int[][] tmp = prt(n/3);
      int[][] arr = new int[n][n];
      for(int j = 0; j < 3; j++){
        if(j == 1){
          for(int i = 0; i < 3; i++){
            if(i != 1) copyArr(tmp, arr, i*tmp[0].length, j*tmp.length);
          }
        }else{
          for(int i = 0; i < 3; i++){
            copyArr(tmp, arr, i*tmp[0].length, j*tmp.length);
          }
        }
      }
      
      return arr;
    }
    
  }
  
  public static void copyArr(int[][] source, int[][] target, int x, int y){
    for(int i = 0; i < source[0].length; i++){
      for(int j = 0; j < source.length; j++){
        target[y + j][x + i] = source[j][i];
      }
    }
  }
}