import java.util.Scanner;

class EX2750 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] nums = new int[n];
    for(int i = 0; i < n; i++){
      nums[i] = sc.nextInt();
    }
    
    for(int num : f(nums)){
      System.out.println(num);
    }

  }
  
  public static int[] f(int[] n){
    int len = n.length;
    int tmp = 0;
    for(int i = 0; i < len; i++){
      for(int j = i + 1; j < len; j++){
        if(n[i] > n[j]){
          tmp = n[j];
          n[j] = n[i];
          n[i] = tmp;
        }
      }
    }
    
    return n;
  }
  
}