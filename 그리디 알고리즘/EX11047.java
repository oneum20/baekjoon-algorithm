import java.util.*;
import java.io.*;

class EX11047 {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] nums = new int[n];
        while (n-- > 0) {
            nums[n] = in.nextInt();
        }

        int cnt = 0;
        while (k > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= k) {
                    k -= nums[i];
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}