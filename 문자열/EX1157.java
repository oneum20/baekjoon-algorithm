import java.util.*;

public class EX1157 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String S = in.next().toUpperCase();
        int[] ASCII = new int[128];
        int max = Integer.MIN_VALUE;
        boolean flag = true;
        int idx = 0;

        for (char c : S.toCharArray()) {
            ASCII[c]++;
            if (ASCII[c] > max) {
                max = ASCII[c];
                flag = true;
                idx = c;
            } else if (ASCII[c] == max) {
                flag = false;
            }
        }

        System.out.println(flag ? "" + (char) idx : "?");
    }

}