package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEx_12 {
    public String solution(int N, String str) {
        String answer = "";
        for (int i=0; i<N; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);  // 2진수인 tmp를 정수형으로 변환
            answer += (char)num;
            str = str.substring(7); // 문자열 갱신
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        StringEx_12 T = new StringEx_12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(T.solution(N, str));
    }
}

/**
 * String 함수를 잘 알고 있어야 풀 수 있는 문제였다.
 * parseInt()메소드로 2진수 -> 10진수로 변환할 수 있다는 것을 배웠다.
 * 아 어려워
 */