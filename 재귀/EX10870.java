import java.util.Scanner;

class EX10870 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int input1 = sc.nextInt();
    
    System.out.println(f(input1));  
  }
  
  public static int f(int n){
    if(n <= 1){
      return n;
    }else{
      return f(n - 1) + f(n - 2);
    }
  }
  
}