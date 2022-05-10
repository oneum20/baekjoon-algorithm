import java.util.*;
import java.io.*;

class EX2667 {
    static int n;
    static int cnt;
    static int[][] moves = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
    static int[][] visited;
    static int[][] board;

    static ArrayList<Integer> bd = new ArrayList<>();

    public static void dfs(int i, int j) {
        if (visited[i][j] == 1) {
            return;
        } else {
            visited[i][j] = 1;
            for (int[] move : moves) {
                int ni = i + move[0];
                int nj = j + move[1];
                if (ni >= 0 && nj >= 0 && ni <= n && nj <= n && board[ni][nj] == 1 && visited[ni][nj] == 0) {
                    cnt++;
                    dfs(ni, nj);
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();

        visited = new int[n + 1][n + 1];
        board = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            String line = kb.next();
            char[] c = line.toCharArray();
            for (int j = 1; j <= n; j++) {
                board[i][j] = Integer.parseInt(c[j - 1] + "");
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (board[i][j] == 1 && visited[i][j] == 0) {
                    cnt = 1;
                    dfs(i, j);
                    bd.add(cnt);
                }
            }
        }

        Collections.sort(bd);

        System.out.println(bd.size());
        for (int num : bd) {
            System.out.println(num);
        }
    }
}