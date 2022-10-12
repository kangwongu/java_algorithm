package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEx_2 {
    public String solution(String input) {
        String answer = "";
        // 일반 for문
//        for (int i=0; i< input.length(); i++) {
//            char ch = input.charAt(i);
//            if (Character.isUpperCase(ch)) {
//                answer += Character.toLowerCase(input.charAt(i));
//            } else {
//                answer += Character.toUpperCase(input.charAt(i));
//            }
//        }
        // for-each 문
//        for (char ch : input.toCharArray()) {
//            if (Character.isUpperCase(ch)) {
//                answer += Character.toLowerCase(ch);
//            } else {
//                answer += Character.toUpperCase(ch);
//            }
//        }
        // 아스키코드 활용
        for (char ch : input.toCharArray()) {
            // 대문자 65~90 / 소문자 97~122
            if (ch>=65 && ch<=90) {
                answer += (char)(ch+32);
            } else {
                answer += (char)(ch-32);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        StringEx_2 T = new StringEx_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(T.solution(input));
    }
}
