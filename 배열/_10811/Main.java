package 배열._10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        int[] baskets = new int[N + 1];

        for (int b = 1; b <= N; b++) {
            baskets[b] = b;
        }

        while (M > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            while (i < j) {
                int temp = baskets[i];
                baskets[i++] = baskets[j];
                baskets[j--] = temp;
            }

            M--;
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}
