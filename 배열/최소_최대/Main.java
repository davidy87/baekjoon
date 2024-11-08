package 배열.최소_최대;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final int MIN = -1_000_000;

    private static final int MAX = 1_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = MAX;
        int max = MIN;

        for (int i = 0; i < N; i++) {
            int cur = Integer.parseInt(st.nextToken());
            min = Math.min(cur, min);
            max = Math.max(cur, max);
        }

        System.out.println(min + " " + max);
    }
}
