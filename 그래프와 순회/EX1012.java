import java.util.*;

public class EX1012 {

    static int[][] df = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
    static int M;
    static int N;
    static int K;

    static int[][] board;
    static int[][] ck;

    static void dfs(int y, int x) {
        ck[y][x] = 1;

        for (int i = 0; i < 4; i++) {
            int ny = y - df[i][0];
            int nx = x - df[i][1];
            if (nx >= 0 && nx < M && ny >= 0 && ny < N && ck[ny][nx] == 0 && board[ny][nx] == 1) {
                dfs(ny, nx);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] ans = new int[T];

        for (int k = 0; k < T; k++) {
            M = in.nextInt();
            N = in.nextInt();
            K = in.nextInt();

            board = new int[N][M];
            ck = new int[N][M];

            for (int i = 0; i < K; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                board[y][x] = 1;
            }

            int cnt = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (board[i][j] == 1 && ck[i][j] == 0) {
                        cnt++;
                        dfs(i, j);
                    }
                }
            }

            ans[k] = cnt;
        }

        for (int i : ans) {
            System.out.println(i);
        }

    }

}