import java.util.*;
import java.io.*;

class EX1931 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] meetings = new int[n][2];
        for (int i = 0; i < n; i++) {
            meetings[i][0] = in.nextInt();
            meetings[i][1] = in.nextInt();
        }

        Arrays.sort(meetings, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }

        });

        int cnt = 0;
        int e = 0;
        for (int[] meeting : meetings) {
            if (meeting[0] >= e) {
                e = meeting[1];
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}