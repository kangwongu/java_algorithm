package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringEx_10 {
    public int[] solution(String str, char ch) {
        // 배열
        int[] answer = new int[str.length()];
        int pos = 99;   // 임시 거리값
        // 순회하며 ch에 대한 거리값을 부여
        // 정방향 순회
        for (int i=0; i<str.length(); i++) {
            // ch와 일치하면
            if (str.charAt(i) == ch) {
                pos = 0;
                answer[i] = pos;
            } else {
                pos++;
                answer[i] = pos;
            }
        }

        // 역방향 순회
        pos = 99;
        for (int i=str.length()-1; i>=0; i--) {
            // ch와 일치하면
            if (str.charAt(i) == ch) {
                pos = 0;
            } else {
                pos++;
                answer[i] = Math.min(answer[i], pos);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        StringEx_10 T = new StringEx_10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        char ch = st.nextToken().charAt(0);
        for (int i : T.solution(str, ch)) {
            System.out.print(i + " ");
        }
    }
}

/**
 * 어려웠던 문제.. 꼭 다시 풀자
 * 정방향 순회 후 역방향 순회하는 이유는, 1)정방향 순회 후 도출된 타겟 문자에 대한 거리값에서 2)역방향 순회를 수행해, 더 가까운 타겟 문자에 대한 거리값으로 교체하기 위함이다.
 * 임시 거리값을 두고, 거리값을 도출하는 과정이 이해가 어렵고 복잡했다.. 꼭 다시 풀자
 * Math.min()메소드를 처음 사용해보며 배웠다. 두 개의 인자 중, 최소값을 반환해주는 메소드이다.
 */