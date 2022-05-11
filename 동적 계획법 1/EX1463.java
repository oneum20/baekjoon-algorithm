import java.util.*;

public class EX1463 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int[] DP = new int[1000001];
        int N = in.nextInt();

        for (int i = 2; i <= N; i++) {
            DP[i] = Math.min(DP[i / 2] + i % 2, DP[i / 3] + i % 3) + 1;

        }

        System.out.println(DP[N]);
    }

}