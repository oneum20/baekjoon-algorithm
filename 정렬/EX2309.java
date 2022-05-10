import java.util.*;

public class EX2309 {
    static int[] nums = new int[9];
    static int[] exn = new int[2];
    static int sum;

    static void except() {
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - nums[i] - nums[j] == 100) {
                    exn[0] = nums[i];
                    exn[1] = nums[j];
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            nums[i] = in.nextInt();
            sum += nums[i];
        }

        except();
        Arrays.sort(nums);
        for (int i : nums) {
            if (i != exn[0] && i != exn[1])
                System.out.print(i + " ");
        }

    }

}
