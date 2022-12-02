package algorithm.twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoPointersEx_4 {
    public int solution(int n) {
        int answer=0, lt=0, sum=0;
        int m = n/2 +1; // 연속된 자연수를 구할 범위를 정함
        int[] arr = new int[m];
        for (int i=0; i<m; i++) arr[i] = i+1;

        for (int rt=0; rt<m; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        TwoPointersEx_4 T = new TwoPointersEx_4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(T.solution(N));
    }
}
