package algorithm.twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoPointersEx_3 {
    public int solution(int n, int m, int[] arr) {
        int answer=0, pos=0, sum=0; // pos는 포인터
        for (int i=0; i<n; i++) {
            sum += arr[i];
            // m에 대한 부분수열을 찾은 경우!
            if (sum == m) {
                answer++;
            }
            // sum이 m보다 크거나 같으면, 포인터를 활용해 배열의 인덱스를 하나씩 밀어가면서 다시 sum을 구한다
            // 큰 경우는 sum을 다시 구하기 위해서이고, 같은 경우는 m에 대한 다른 부분수열을 찾기 위함이다.
            while (sum>=m) {
                sum-= arr[pos++];
                if (sum == m) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        TwoPointersEx_3 T = new TwoPointersEx_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; st.hasMoreTokens(); i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(N, M, arr));
    }
}
