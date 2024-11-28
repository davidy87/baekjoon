package 배열._5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final int N = 30;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] turnIn = new boolean[N + 1];

        for (int i = 0; i < N - 2; i++) {
            int s = Integer.parseInt(br.readLine());
            turnIn[s] = true;
        }

        for (int i = 1; i <= N; i++) {
            if (!turnIn[i]) {
                System.out.println(i);
            }
        }
    }
}
