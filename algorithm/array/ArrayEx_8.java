package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayEx_8 {
    public int[] solution(int n, int[] scores) {
        int[] answer = new int[n];
        for (int i=0; i<scores.length; i++) {
            int rank = 1;
            for (int j=0; j<scores.length; j++) {
                if (scores[j] > scores[i]) rank++;
            }
            answer[i] = rank;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        ArrayEx_8 T = new ArrayEx_8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; st.hasMoreTokens(); i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        for (int rank : T.solution(N, scores)) {
            System.out.print(rank + " ");
        }
    }
}
/**
 * 이중 for문으로 해결할 수 있는 문제였다.
 * 시간복잡도 측면에서 좋지않은 이중 for문을 안쓰고 해결해보려 했는데,
 * 그렇게는 안풀린다..
 * 아 어려워
 */