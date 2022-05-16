import java.io.*;
import java.util.*;

public class EX7576 {
    static int n;
    static int m;
    static int[][] board;
    static int[][] ck;
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    public static int BFS() {
        Queue<int[]> Q = new LinkedList<>();

        int cnt = 0;
        int total = n * m;
        int L = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == -1) {
                    ck[i][j] = 1;
                    total--;
                } else if (board[i][j] == 1) {
                    int[] pos = { i, j };
                    ck[i][j] = 1;
                    Q.add(pos);
                    cnt++;
                }
            }
        }
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int[] pos = Q.poll();

                int x = pos[0];
                int y = pos[1];

                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && ck[nx][ny] == 0) {
                        int[] tmp = new int[2];
                        tmp[0] = nx;
                        tmp[1] = ny;
                        ck[nx][ny] = 1;
                        Q.add(tmp);
                        cnt++;
                    }
                }
            }
            L++;
        }
        if (cnt == total) {
            return L - 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();

        board = new int[n][m];
        ck = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = in.nextInt();
            }
        }

        System.out.println(Main.BFS());
        return;
    }

}