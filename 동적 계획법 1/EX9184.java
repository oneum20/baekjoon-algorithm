import java.util.*;
import java.io.*;

public class EX9184 {
    public static int[][][] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        nums = new int[51][51][51];

        while (true) {
            int[] n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (n[0] == -1 && n[1] == -1 && n[2] == -1)
                break;
            sb.append("w(" + n[0] + ", " + n[1] + ", " + n[2] + ") = ")
                    .append(w(n[0], n[1], n[2])).append("\n");
        }

        System.out.println(sb);
    }

    public static int w(int n1, int n2, int n3) {

        if (n1 <= 0 || n2 <= 0 || n3 <= 0)
            return 1;

        if (nums[n1][n2][n3] > 0)
            return nums[n1][n2][n3];

        if (n1 > 20 || n2 > 20 || n3 > 20)
            return w(20, 20, 20);

        if (n1 < n2 && n2 < n3) {
            nums[n1][n2][n3 - 1] = w(n1, n2, n3 - 1);
            nums[n1][n2 - 1][n3 - 1] = w(n1, n2 - 1, n3 - 1);
            nums[n1][n2 - 1][n3] = w(n1, n2 - 1, n3);
            return nums[n1][n2][n3 - 1] + nums[n1][n2 - 1][n3 - 1] - nums[n1][n2 - 1][n3];
        } else {
            nums[n1 - 1][n2][n3] = w(n1 - 1, n2, n3);
            nums[n1 - 1][n2 - 1][n3] = w(n1 - 1, n2 - 1, n3);
            nums[n1 - 1][n2][n3 - 1] = w(n1 - 1, n2, n3 - 1);
            nums[n1 - 1][n2 - 1][n3 - 1] = w(n1 - 1, n2 - 1, n3 - 1);
            return nums[n1 - 1][n2][n3] + nums[n1 - 1][n2 - 1][n3] + nums[n1 - 1][n2][n3 - 1]
                    - nums[n1 - 1][n2 - 1][n3 - 1];
        }

    }

}