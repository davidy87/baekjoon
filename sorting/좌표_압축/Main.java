package sorting.좌표_압축;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> nums = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> sortedNums = nums.stream()
                .sorted()
                .collect(Collectors.toList());

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 0;

        for (Integer x : sortedNums) {
            if (!rankMap.containsKey(x)) {
                rankMap.put(x, rank++);
            }
        }

        for (Integer x : nums) {
            bw.write(rankMap.get(x) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
