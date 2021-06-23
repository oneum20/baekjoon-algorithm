import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EX18870 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    String[] input = br.readLine().split(" ");
    int[] nums = new int[n];
    for (int i = 0; i < n; i++)[
      nums[i] = Integer.parseInt(input[i]);
    ]        

    int[] sortedNums = nums.clone();
    Arrays.sort(sortedNums);

    Map<Integer, Integer> map = new HashMap<>();
    int idx = 0;
    for (int n : sortedNums){
      if (!map.containsKey(n)) map.put(n, idx++);
    }

    StringBuilder sb = new StringBuilder();
    for (int n : nums)
        sb.append(map.get(n)).append(' ');

    System.out.println(sb.toString());
  }
}