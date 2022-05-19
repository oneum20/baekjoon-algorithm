import java.util.*;

public class EX1541 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] S = in.next().split("-");

        int total = 0;
        for (String nums : S[0].split("\\+")) {
            total += Integer.parseInt(nums.equals("") ? "0" : nums);
        }

        for (int i = 1; i < S.length; i++) {
            String[] nums = S[i].split("\\+");

            int tmp = 0;
            for (String num : nums) {
                tmp += Integer.parseInt(num);
            }

            total += -1 * tmp;
        }

        System.out.println(total);
    }

}