import java.util.Arrays;

/**
 * String -> char 배열로 변경해 정렬 후, 두 배열이 같은지 여부를 확인해서 해결
 */
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeChars = before.toCharArray();
        char[] afterChars = after.toCharArray();
        Arrays.sort(beforeChars);
        Arrays.sort(afterChars);

        answer = Arrays.equals(beforeChars, afterChars) ? 1 : 0;
        return answer;
    }
}

/**
 * 같은 문자로 구성되어 있으면 문장의 합이 같다
 */
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        // 같은 문자로 구성되어 있음
        int beforeSum=0, afterSum=0;
        for (int i=0; i<before.length(); i++) {
            beforeSum += before.charAt(i);
            afterSum += after.charAt(i);
        }
        answer = (beforeSum==afterSum) ? 1 : 0;
        return answer;
    }
}