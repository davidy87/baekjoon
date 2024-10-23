package sorting.배;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> cranes = new ArrayList<>(N);
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            cranes.add(Integer.parseInt(st1.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        List<Integer> boxes = new ArrayList<>(M);
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            boxes.add(Integer.parseInt(st2.nextToken()));
        }

        cranes.sort(Collections.reverseOrder());
        boxes.sort(Collections.reverseOrder());

        if (cranes.get(0) < boxes.get(0)) {
            System.out.println(-1);
            return;
        }

        int result = 0;

        while (!boxes.isEmpty()) {
            for (int c = 0; c < N; c++) {
                if (boxes.isEmpty()) {
                    break;
                }

                for (int b = 0; b < boxes.size(); b++) {
                    if (cranes.get(c) >= boxes.get(b)) {
                        boxes.remove(b);
                        break;
                    }
                }
            }

            result++;
        }

        System.out.println(result);
        br.close();
    }
}
