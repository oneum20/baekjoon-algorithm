import java.util.*;
import java.io.*;

class EX1260 {
    static int n;
    static int[] ck;
    static int[][] board = new int[1001][1001];

    public static void bfs(int k) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(k);

        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                int num = Q.poll();
                if (ck[num] == 1) {
                } else {
                    ck[num] = 1;
                    System.out.print(num + " ");
                    for (int j = 1; j <= n; j++) {
                        if (board[num][j] == 1 && ck[j] == 0) {

                            Q.add(j);
                        }
                    }
                }
            }
        }

    }

    public static void dfs(int k) {
        if (ck[k] == 1) {

            return;
        } else {
            ck[k] = 1;
            System.out.print(k + " ");

            for (int j = 1; j <= n; j++) {
                if (board[k][j] == 1 && ck[j] == 0) {
                    dfs(j);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        int m = in.nextInt();
        int v = in.nextInt();

        while (m-- > 0) {
            int i = in.nextInt();
            int j = in.nextInt();

            board[i][j] = 1;
            board[j][i] = 1;
        }

        ck = new int[n + 1];
        dfs(v);

        System.out.println();
        ck = new int[n + 1];
        bfs(v);
    }
}