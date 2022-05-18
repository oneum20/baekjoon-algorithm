import java.io.*;

public class EX1912 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] DP = new int[N];
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int max = nums[0];
        DP[0] = nums[0];
        for (int i = 1; i < N; i++) {
            int tmp = DP[i - 1] + nums[i];
            DP[i] = tmp > nums[i] ? tmp : nums[i];

            max = Math.max(max, DP[i]);
        }

        System.out.println(max);
    }

}