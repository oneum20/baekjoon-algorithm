import java.util.Scanner;

class EX1436 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(f(n));
  }
  
  public static String f(int n){
    int i = 0;
    while(n > 0){
      i++;
      if(Integer.toString(i).contains("666")) n--;
    }
    return Integer.toString(i);
  }
}