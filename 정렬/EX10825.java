import java.io.*;
import java.util.*;

public class EX10825 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[][] S = new String[N][4];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            S[i][0] = input[0];
            S[i][1] = input[1];
            S[i][2] = input[2];
            S[i][3] = input[3];
        }

        Arrays.sort(S, (Comparator<? super String[]>) (a, b) -> {
            if (a[1].equals(b[1]) && a[2].equals(b[2]) && a[3].equals(b[3])) {
                return a[0].compareTo(b[0]);
            } else if (a[1].equals(b[1]) && a[2].equals(b[2])) {
                return Integer.parseInt(b[3]) - Integer.parseInt(a[3]);
            } else if (a[1].equals(b[1])) {
                return Integer.parseInt(a[2]) - Integer.parseInt(b[2]);
            } else {
                return Integer.parseInt(b[1]) - Integer.parseInt(a[1]);
            }
        });

        for (String[] strs : S) {
            bw.write(strs[0] + "\n");
        }

        br.close();
        bw.close();

    }

}