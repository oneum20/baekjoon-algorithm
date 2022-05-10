import java.io.*;

public class EX9461 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        long[] dp = new long[101];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            sb.append(fibo(num, dp)).append("\n");
        }

        System.out.println(sb);

    }

    public static long fibo(int n, long[] dp) {

        if (dp[n] < 1) {
            dp[n] = fibo(n - 1, dp) + fibo(n - 5, dp);
        }

        return dp[n];
    }

}