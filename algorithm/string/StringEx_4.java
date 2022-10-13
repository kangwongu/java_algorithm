package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StringEx_4 {
    public ArrayList<String> solution(int N, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        // StringBuilder 활용하기
//        for (String s : str) {
//            // StringBuilder를 활용해 문자열을 뒤집는다
//            String tmp = new StringBuilder(s).reverse().toString();
//            answer.add(tmp);
//        }

        // 직접 바꾸기
        for (String s : str) {
            char[] ch = s.toCharArray();
            // 배열 인덱스
            int lt = 0, rt = s.length()-1;
            while (lt < rt) {
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(ch);
            answer.add(tmp);

        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        StringEx_4 T = new StringEx_4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력, 수/단어
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for(int i=0; i<str.length; i++) {
            str[i] = br.readLine();
        }
        for (String s : T.solution(N, str)) {
            System.out.println(s);
        }

    }
}
