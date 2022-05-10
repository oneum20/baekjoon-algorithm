import java.util.*;
import java.io.*;

public class EX1904 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];

        System.out.println(fibo(N, dp));

    }

    public static int fibo(int n, int[] dp) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        if (dp[n] < 1) {
            dp[n] = (fibo(n - 1, dp) + fibo(n - 2, dp)) % 15746;
        }

        return dp[n];
    }

}