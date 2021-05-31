import java.util.Scanner;

class EX11729 {
  public static int cnt;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int input1 = sc.nextInt();
    
    StringBuilder sb = new StringBuilder();
    move(input1, 1, 2, 3, sb);
    
    System.out.println(cnt);
    System.out.println(sb);
  }
  
  public static void move(int num, int from, int blank, int to, StringBuilder sb){
    cnt++;
    if(num == 1){
      sb.append(from + " " + to + "\n");
    }else{
      // n-1개를 from에서 blank로 옮김
      move(num - 1, from, to, blank, sb);
      
      // 나머지 1개를 to로 옮김.
      sb.append(from + " " + to + "\n");
      
      // blank로 옮겼던 n-1개를 이어서 to로 옮김.
      move(num - 1, blank, from, to, sb);
    }
    
    
  }
  
}