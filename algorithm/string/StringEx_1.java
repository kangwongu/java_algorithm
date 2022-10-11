package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEx_1 {
    public int solution(String str, char t) {
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        int count = 0;

//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == t) {
//                count++;
//            }
//        }
        for (char x : str.toCharArray()) {
            if (x == t) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        StringEx_1 T = new StringEx_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char ch = br.readLine().charAt(0);
        System.out.println(T.solution(input, ch));
    }
}
