package sorting.보물;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class 보물 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        List<Integer> A = new ArrayList<>(N);
        List<Integer> B = new ArrayList<>(N);

        for (String a : bf.readLine().replace("\n", "").split(" ")) {
            A.add(Integer.parseInt(a));
        }

        for (String b : bf.readLine().replace("\n", "").split(" ")) {
            B.add(Integer.parseInt(b));
        }

        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());

        int result = IntStream.range(0, N)
                .map(i -> A.get(i) * B.get(i))
                .sum();

        System.out.println(result);
    }
}
