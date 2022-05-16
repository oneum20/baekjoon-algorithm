import java.io.*;
import java.util.*;

public class EX24445 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int R = Integer.parseInt(input[2]);

        int[] visited = new int[N + 1];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int u = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        int cnt = 1;

        Queue<Integer> Q = new LinkedList<>();
        Q.add(R);
        visited[R] = cnt;
        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                int nx = Q.poll();

                for (int j : graph.get(nx)) {
                    if (visited[j] == 0) {
                        Q.add(j);
                        visited[j] = ++cnt;
                    }
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            bw.write(visited[i] + "\n");
        }

        br.close();
        bw.close();
    }

}