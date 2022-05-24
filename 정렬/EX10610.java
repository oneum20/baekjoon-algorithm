import java.util.*;

public class EX10610 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String N = in.next();
        String ans = "-1";

        if (N.contains("0")) {

            int sum = 0;
            char[] arr = N.toCharArray();
            Integer[] nums = new Integer[arr.length];
            for (int i = 0; i < arr.length; i++) {
                nums[i] = Integer.parseInt(arr[i] + "");
                sum += nums[i];
            }

            if (sum % 3 == 0) {
                Arrays.sort(nums, Collections.reverseOrder());

                StringBuilder sb = new StringBuilder();
                for (int i : nums) {
                    sb.append(i);
                }
                ans = sb.toString();
            }
        }

        System.out.println(ans);
    }

}