package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEx_3 {
    public String solution(String input) {
        String answer = "";
        int num = 0;
        int pos;

//        // split 사용
//        // 띄어쓰기 기준으로 문자열 분할
//        String[] s = input.split(" ");
//        for (String str : s) {
//            int length = str.length();
//            if (length > num) {
//                num = length;
//                answer = str;
//            }
//        }

        // indexOf 사용
        // 띄어쓰기가 있는 인덱스를 찾고, 기준으로 분할
        while ((pos = input.indexOf(" ")) != -1) {
            String tmp = input.substring(0, pos);
            int length = tmp.length();
            if (length > num) {
                num = length;
                answer = tmp;
            }
            // 문장 조정
            input = input.substring(pos+1);
        }
        // 마지막 단어
        if (input.length() > num) {
            answer = input;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        StringEx_3 T = new StringEx_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(T.solution(input));
    }
}
