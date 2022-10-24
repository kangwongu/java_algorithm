package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayEx_7 {

    public int solution(int n, int[] scores) {
        int answer = 0;
        int score = 0;
        for (int i=0; i<scores.length; i++) {
            if (scores[i] == 1) {
                score++;
                answer += score;
            }
            else {
                score = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        ArrayEx_7 T = new ArrayEx_7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; st.hasMoreTokens(); i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(T.solution(N, scores));
    }
}
