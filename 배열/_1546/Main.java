package 배열._1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = 0;
        double[] scores = new double[N];

        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(st.nextToken());
            scores[i] = score;
            M = Math.max(score, M);
        }

        double total = 0;

        for (int i = 0; i < N; i++) {
            total += (scores[i] / M * 100);
        }

        System.out.println(total / N);
    }
}
