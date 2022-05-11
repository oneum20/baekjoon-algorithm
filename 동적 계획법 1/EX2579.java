import java.io.*;

public class EX2579 {
    static int N;
    static int[] S;
    static int[] DP;

    static int climb() {
        DP[1] = S[1];
        DP[2] = S[2] + S[1];

        for (int i = 3; i <= N; i++) {
            DP[i] = S[i] + Math.max(DP[i - 2], S[i - 1] + DP[i - 3]);
        }

        return DP[N];

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        S = new int[301];
        DP = new int[301];
        for (int i = 1; i <= N; i++) {
            S[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(climb());

    }

}