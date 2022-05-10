import java.util.*;

public class EX2178 {

    static int[][] df = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    static int N; // 세로
    static int M; // 가로

    static int[][] board;
    static int[][] ck;

    static void bfs(int y, int x) {
        int cnt = 0;
        int endX = M - 1;
        int endY = N - 1;
        Queue<int[]> Q = new LinkedList<>();

        int[] root = { y, x };
        Q.add(root);

        while (!Q.isEmpty()) {
            int size = Q.size();
            cnt++;
            while (size-- > 0) {
                int[] pos = Q.poll();

                if (pos[0] == endY && pos[1] == endX) {
                    System.out.println(cnt);
                    return;
                } else {
                    for (int i = 0; i < 4; i++) {
                        int ny = pos[0] + df[i][0];
                        int nx = pos[1] + df[i][1];

                        if (ny >= 0 && ny < N && nx >= 0 && nx < M && ck[ny][nx] == 0 && board[ny][nx] == 1) {
                            int[] item = { ny, nx };
                            ck[ny][nx] = 1;
                            Q.add(item);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        board = new int[N][M];
        ck = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = in.next();
            char[] c = line.toCharArray();

            for (int j = 0; j < c.length; j++) {
                int num = Integer.parseInt(c[j] + "");
                if (num == 1)
                    board[i][j] = 1;
            }
        }

        bfs(0, 0);

    }

}