package sorting.커트라인;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> scores = new ArrayList<>(N);
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            scores.add(Integer.parseInt(st.nextToken()));
        }

        scores.sort(Collections.reverseOrder());

        System.out.println(scores.get(k - 1));
        br.close();
    }
}
