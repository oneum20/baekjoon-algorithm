import java.io.*;
import java.util.*;

public class EX2217 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] rope = new int[N];
        while (N-- > 0) {
            rope[N] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(rope);

        int max = Integer.MIN_VALUE;
        for (int i = rope.length - 1; i >= 0; i--) {
            max = Math.max(max, rope[i] * (rope.length - i));
        }

        System.out.println(max);
    }

}