import java.util.*;

public class EX13305 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long[] R = new long[N - 1];
        long[] C = new long[N];

        for (int i = 0; i < R.length; i++) {
            R[i] = in.nextInt();
        }

        for (int i = 0; i < C.length; i++) {
            C[i] = in.nextInt();
        }

        long min = Integer.MAX_VALUE;
        long total = 0;
        for (int i = 0; i < N - 1; i++) {
            if (C[i] < min) {
                min = C[i];
            }

            total += min * R[i];
        }

        System.out.println(total);

    }

}