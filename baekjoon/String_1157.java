package baekjoon;
import java.util.Scanner;

public class String_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] alphabetCountArr = new int[26];

        String input = scanner.nextLine().toUpperCase();
        int max = 0;
        char result = ' ';

        for (int i=0; i<input.length(); i++) {
            // 입력받은 문장의 각 단어를 탐색해 해당 알파벳 빈도수++
            alphabetCountArr[input.charAt(i) - 'A']++;
            // 최대값 구하기, 같으면 '?'
            if (max < alphabetCountArr[input.charAt(i) - 'A']) {
                max = alphabetCountArr[input.charAt(i) - 'A'];
                result = input.charAt(i);
            } else if (max == alphabetCountArr[input.charAt(i) - 'A']) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
