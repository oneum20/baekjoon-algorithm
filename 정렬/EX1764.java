import java.io.*;
import java.util.*;

public class EX1764 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        HashSet<String> noL = new HashSet<>();
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            noL.add(br.readLine());
        }

        String tmp = "";
        for (int i = 0; i < M; i++) {
            tmp = br.readLine();
            if (noL.contains(tmp))
                ans.add(tmp);
        }

        Collections.sort(ans);

        bw.write(ans.size() + "\n");
        for (String s : ans) {
            bw.write(s + "\n");
        }

        br.close();
        bw.close();

    }
}
