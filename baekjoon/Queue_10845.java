package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue_10845 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();  // 큐
        StringTokenizer st; // 입력문장 쪼개기 위해 사용
        StringBuilder sb = new StringBuilder(); // 출력할 문장 담았다가 한꺼번에 출력위해 사용
        int lastWord = 0;

        // N만큼 반복
        for (int i=0; i<N; i++) {
            // 명령어 입력
            st = new StringTokenizer(br.readLine());
            String firstWord = st.nextToken();

            // 어떤 명령어인지 분기 (분기조건이 많아서 switch 사용)
            switch (firstWord) {
                case "push":
                    lastWord = Integer.parseInt(st.nextToken());
                    queue.offer(lastWord);
                    break;
                case "pop":
                    if (queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front":
                    if (queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.peek()).append("\n");
                    break;
                case "back":
                    if (queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(lastWord).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
