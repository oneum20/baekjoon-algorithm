import java.util.*;
import java.io.*;

class EX11399 {

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] nums = new int[n];

        while (n-- > 0) {
            nums[n] = kb.nextInt();
        }

        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
        }

        System.out.println(sum);

    }
}