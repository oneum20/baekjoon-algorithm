import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class EX2751 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < n; i++){
      list.add(sc.nextInt());
    }
    
    Collections.sort(list);
    for(int num : list){
      sb.append(num + "\n");
    }
    
    System.out.println(sb);

  }
  
}