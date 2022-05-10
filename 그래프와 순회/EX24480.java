import java.util.*;
import java.io.*;

public class EX24480 {

    static ArrayList<ArrayList<Integer>> graph;
    static Map<Integer, Integer> visited;
    static int cnt = 1;

    public static void dfs(int R) {
        visited.put(R, cnt);

        Collections.sort(graph.get(R), Collections.reverseOrder());
        for (int i : graph.get(R)) {
            if (!visited.containsKey(i)) {
                cnt++;
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int R = Integer.parseInt(input[2]);

        graph = new ArrayList<>();
        visited = new HashMap<>();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            String[] xy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        dfs(R);

        for (int i = 1; i <= N; i++) {
            bw.write(visited.getOrDefault(i, 0) + "\n");
        }

        br.close();
        bw.close();

    }
}