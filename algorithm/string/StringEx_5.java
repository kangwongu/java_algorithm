package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEx_5 {
    public String solution(String input) {
        String answer;
        char[] chars = input.toCharArray();
        // 인덱스
        int lt = 0, rt = chars.length-1;
        while (lt < rt) {
            // 알파벳만 자리변경
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(chars);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        StringEx_5 T = new StringEx_5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(T.solution(input));
    }
}
