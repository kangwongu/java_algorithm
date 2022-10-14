package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEx_6 {
    public String solution(String str) {
        String answer="";
        for (int i=0; i<str.length(); i++) {
//            System.out.println(str.charAt(i)+" "+i+ " "+str.indexOf(str.charAt(i)));
            // charAt을 통해 도출되는 문자가 최초로 등장하는거라면 true
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        StringEx_6 T = new StringEx_6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(T.solution(input));
    }
}
