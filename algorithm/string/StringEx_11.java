package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEx_11 {
    public String solution(String str) {
        String answer = "";
        str += " ";  // 빈 문자를 끝에 추가해준다. (문장의 마지막 문자를 출력하기 위함)
        int count = 1;
        for (int i=0; i<str.length()-1; i++) {
            // 현재문자와 다음문자가 같다
            if (str.charAt(i) == str.charAt(i+1)) {
                count += 1;
            } else {
                answer += str.charAt(i);
                if (count > 1) {
                    answer += count;
                }
                count = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        StringEx_11 T = new StringEx_11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}