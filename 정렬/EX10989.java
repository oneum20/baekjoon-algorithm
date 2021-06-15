import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class EX10989 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    StringBuilder sb = new StringBuilder();
    int[] cnt = new int[10001];
    
    int n = Integer.parseInt(br.readLine());
    
    for(int i = 0; i < n; i++){
      cnt[Integer.parseInt(br.readLine())]++;
    }
    
    for(int i = 0; i < cnt.length; i++){
      for(int j = 0; j < cnt[i]; j++){
        sb.append(i + "\n");
      }
    }
    
    
    System.out.println(sb);
  }
  
}