import java.io.*;

public class EX2675 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String[] input = br.readLine().split(" ");

            int cnt = Integer.parseInt(input[0]);
            char[] c = input[1].toCharArray();
            for (int i = 0; i < cnt * input[1].length(); i++) {
                bw.write(c[i / cnt]);
            }
            bw.write("\n");
        }

        br.close();
        bw.close();
    }

}