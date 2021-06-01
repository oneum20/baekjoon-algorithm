import java.util.Scanner;

class EX10872 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int input1 = sc.nextInt();
    
    System.out.println(fac(input1));  
  }
  
  public static int fac(int n){
    if(n <= 1){
      return 1;
    }else{
      return n * fac(n - 1);
    }
  }
  
}