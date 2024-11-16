package 배열.공_넣기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] buckets = new int[N];

        for (int c = 0; c < M; c++) {
            StringTokenizer round = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(round.nextToken());
            int j = Integer.parseInt(round.nextToken());
            int k = Integer.parseInt(round.nextToken());

            while (i <= j) {
                buckets[i++ - 1] = k;
            }
        }

        for (int i = 0; i < N; i++) {
            bw.write(buckets[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
