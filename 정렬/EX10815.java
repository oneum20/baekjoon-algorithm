import java.io.*;
import java.util.Arrays;

public class EX10815 {
    static int N, M;
    static int[] NCard;
    static int[] MCard;

    public static int search(int num) {
        int lt = 0;
        int rt = N - 1;
        int mid = (lt + rt) / 2;

        while (lt <= rt) {
            if (NCard[mid] == num) {
                return 1;
            } else if (NCard[mid] < num) {
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }

            mid = (lt + rt) / 2;
        }

        return 0;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        NCard = new int[N];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            NCard[i] = Integer.parseInt(input[i]);
        }

        M = Integer.parseInt(br.readLine());
        MCard = new int[M];
        input = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            MCard[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(NCard);
        for (int i : MCard) {
            bw.write(search(i) + " ");
        }

        br.close();
        bw.close();
    }
}