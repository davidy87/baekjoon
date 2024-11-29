package 배열._3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static final int N = 10;

    private static final int DIV = 42;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            set.add(n % DIV);
        }

        System.out.println(set.size());
    }
}
