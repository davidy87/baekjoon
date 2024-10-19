package sorting;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 수열_정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        int[] A = Arrays.stream(bf.readLine().replace("\n", "").split(" "))
                .mapToInt((Integer::parseInt))
                .toArray();

        List<Integer> B = new ArrayList<>(N);

        for (int a : A) {
            B.add(a);
        }

        Collections.sort(B);

        for (int i = 0; i < N; i++) {
            int p = B.indexOf(A[i]);
            bw.write(p + " ");
            B.set(p, -1);
        }

        bw.flush();
        bw.close();
    }
}
