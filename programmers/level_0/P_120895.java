/**
 * 나의 풀이
 * String -> char배열로 변경 후
 * 각 인덱스값을 변경
 */
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        char tmp = chars[num1];
        chars[num1] = chars[num2];
        chars[num2] = tmp;
        answer = String.valueOf(chars);
        return answer;
    }
}