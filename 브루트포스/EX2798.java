import java.util.Scanner;

class EX2798 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String input1 = sc.nextLine();
    String input2 = sc.nextLine();
    
    String[] data = input1.split(" ");
    int n = Integer.parseInt(data[0]);
    int m = Integer.parseInt(data[1]);
    
    String[] tmp = input2.split(" ");
    int[] nums = new int[n];
    for(int i = 0; i < n; i++){
      nums[i] = Integer.parseInt(tmp[i]);
    }
    int max = 0;
    int curr = 0;
    for(int i = 0; i < n; i ++){
      for(int j = i + 1; j < n; j++){
        for(int k = j + 1; k < n; k++){
          curr = nums[i] + nums[j] + nums[k];
          if(curr <= m) max = Math.max(max, curr);
        }
      }
    }
    
    System.out.println(max);
  }
  
}