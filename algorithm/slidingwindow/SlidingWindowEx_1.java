package algorithm.slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SlidingWindowEx_1 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        // arr배열의 (k-1)번 요소까지 합을 구함
        for (int i=0; i<k; i++) sum += arr[i];
        answer = sum;

        // 배열의 k번부터 순회하며 순차대로 k개의 합을 구하고 최대값을 도출한다
        for (int i=k; i<n; i++) {
            // 배열의 인덱스를 하나씩 밀어가면서 sum을 구함
            sum += (arr[i]-arr[i-k]);
            answer = Math.max(answer, sum);
        }

        // 이중 for문 통한 풀이 (시간 초과)
//        for (int i=0; i<=(n-k); i++) {
//            int sum = 0;
//            for (int j=0; j<k; j++) {
//                sum += (arr[j+i]);
//                answer = Math.max(sum, answer);
//            }
//        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        SlidingWindowEx_1 T = new SlidingWindowEx_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; st.hasMoreTokens(); i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(N, K, arr));
    }
}