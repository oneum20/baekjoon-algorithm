import java.util.Scanner;
import java.util.Arrays;

class EX1427 {
  public static void main(String[] args) throws Exception {
    StringBuilder sb = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    Integer[] nums = new Integer[n.length()];
    
    for(int i = 0; i < nums.length; i++){
      nums[i] = Integer.parseInt(n.charAt(i) + "");
    }
    
    Arrays.sort(nums, (Integer a, Integer b) -> b.compareTo(a));
    
    for(Integer a : nums){
      sb.append(a);
    }
    
    System.out.println(sb);
  }
  
}