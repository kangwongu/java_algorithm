package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEx_9 {
    public int solution(String str) {
//        int answer = 0;
        // 아스키 코드를 활용
//        for (char ch : str.toCharArray()) {
//            // 숫자면 answer에 넣는다
//            if (ch>=48 && ch<=57) {
//                answer = answer * 10 + (ch-48);
//            }
//        }

        // Character의 isDigit 활용
        String answer = "";
        for (char ch : str.toCharArray()) {
            // 숫자만 담기
            if (Character.isDigit(ch)) {
                answer += ch;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) throws IOException {
        StringEx_9 T = new StringEx_9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}

/**
 * 간단한 문제였다.
 * 숫자만 추출해서 담고, 자연수를 만들기 위해 parseInt()해주면 되는 문제였다.
 * 아스키코드를 사용해서 풀 수도 있었다.
 */