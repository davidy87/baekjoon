package 배열.공_바꾸기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] buckets = new int[N];

        for (int i = 0; i < N; i++) {
            buckets[i] = i + 1;
        }

        for (int r = 0; r < M; r++) {
            StringTokenizer round = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(round.nextToken());
            int j = Integer.parseInt(round.nextToken());

            int temp = buckets[i - 1];
            buckets[i - 1] = buckets[j - 1];
            buckets[j - 1] = temp;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int n : buckets) {
            bw.write(n + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
