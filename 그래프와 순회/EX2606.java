import java.util.*;
import java.io.*;

class EX2606 {
    static int n;
    static int cnt;
    static int[] visited;
    static int[][] board;

    public static void bfs(int start) {
        Queue<Integer> Q = new LinkedList<>();

        visited[start] = 1;
        Q.add(start);
        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                int computer = Q.poll();

                for (int j = 1; j <= n; j++) {
                    if (board[computer][j] == 1 && visited[j] == 0) {
                        cnt++;
                        visited[j] = 1;
                        Q.add(j);
                    }
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int k = kb.nextInt();

        visited = new int[n + 1];
        board = new int[n + 1][n + 1];

        while (k-- > 0) {
            int i = kb.nextInt();
            int j = kb.nextInt();

            board[i][j] = 1;
            board[j][i] = 1;
        }

        bfs(1);
        System.out.println(cnt);
    }
}