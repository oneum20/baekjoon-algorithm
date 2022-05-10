import java.util.*;
import java.io.*;

public class EX1003 {
    public static int[][] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        nums = new int[41][2];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            fibo(num);
            sb.append(nums[num][0] + " " + nums[num][1]).append("\n");

        }

        System.out.println(sb);
    }

    public static int[] fibo(int n) {
        if (nums[n][0] != 0 || nums[n][1] != 0) {
            return nums[n];
        }

        if (n == 0) {
            nums[n][0]++;
            return nums[n];
        } else if (n == 1) {
            nums[n][1]++;
            return nums[n];
        } else {
            int[] tmp0 = fibo(n - 1);
            int[] tmp1 = fibo(n - 2);

            nums[n][0] = tmp0[0] + tmp1[0];
            nums[n][1] = tmp0[1] + tmp1[1];
            return nums[n];
        }

    }

}