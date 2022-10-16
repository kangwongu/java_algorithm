package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEx_8 {
    public String solution(String str) {
        String answer = "YES";
//        char[] chars = str.toUpperCase().toCharArray();
//        int lt=0, rt=chars.length-1;
//        while (lt < rt) {
//            // 알파벳 외 문자들은 비교대상이 아님 -> 패스
//            if (!Character.isAlphabetic(chars[lt])) {
//                lt++;
//            } else if (!Character.isAlphabetic(chars[rt])) {
//                rt--;
//            } else {
//                // 회문 여부를 검사
//                if (chars[lt] != chars[rt]) {
//                    answer = "NO";
//                    break;
//                }
//                lt++;
//                rt--;
//            }
//        }

        // replaceAll() 활용
        // 대문자 A~Z인 문자들을 빈 문자열로 치환해버림
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reverseString = new StringBuilder(str).reverse().toString();
        if (!str.equals(reverseString)) {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        StringEx_8 T = new StringEx_8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}


/*
나는 String을 char 배열로 바꾼 후, 인덱스를 통해 알파벳인지 여부를 확인해가며 회문을 검사했는데
String의 replaceAll()과 StringBuilder를 활용해서 쉽게 해결할 수 있다는 것을 배울 수 있었다.
잘 배우고 알맞은 곳에 잘 활용하는 능력.. 나도 갖고싶어..
 */