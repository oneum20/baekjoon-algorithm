import java.util.Scanner;

class EX2231 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    System.out.println(f(n));  
  }
  
  public static int f(int n){
    int min = Integer.MAX_VALUE;
    String str = "";
    int tmp = 0;
    for(int i = n; i >= 0; i--){
      str = Integer.toString(i);
      for(int j = 0; j < str.length(); j++){
        tmp += Integer.parseInt("" + str.charAt(j));
      }
      tmp += i;
      
      if(tmp == n){
        min = Math.min(min, i);
      }
      tmp = 0;
    }
    
    if(min == Integer.MAX_VALUE){
      return 0;
    }else{
      return min;
    }
  }
  
}