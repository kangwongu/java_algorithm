package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEx_7 {
    public String solution(String str) {
        String answer = "YES";
        // String -> char 배열, 하나씩 순회하며 회문 체크
//        char[] chars = str.toUpperCase().toCharArray();
//        int lt=0, rt=chars.length-1;
//        while (lt < rt) {
//            // 회문이 아닌 경우 체크
//            if (chars[lt] != chars[rt]) {
//                answer = "NO";
//                break;
//            }
//            lt++;
//            rt--;
//        }

        // String의 길이를 구하고, charAt을 통해 반대짝과 비교하며 회문 체크
//        str = str.toUpperCase();
//        int len = str.length();
//        for (int i=0; i<len/2; i++) {
//            // 회문이 아닌 경우
//            if (str.charAt(i) != str.charAt(len-1-i)) {
//                answer = "NO";
//                break;
//            }
//        }

        // StringBuilder로 reverse한 후, 두 문장을 비교해 회문 체크
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(tmp)) {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        StringEx_7 T = new StringEx_7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
