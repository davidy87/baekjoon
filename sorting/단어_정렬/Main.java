package sorting.단어_정렬;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<String> wordSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            wordSet.add(br.readLine());
        }

        List<String> wordList = wordSet.stream()
                .sorted((w1, w2) -> {
                    int w1Length = w1.length();
                    int w2Length = w2.length();

                    if (w1Length == w2Length) {
                        return w1.compareTo(w2);
                    }

                    return Integer.compare(w1Length, w2Length);
                })
                .collect(Collectors.toList());

        for (String w : wordList) {
            bw.write(w);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
