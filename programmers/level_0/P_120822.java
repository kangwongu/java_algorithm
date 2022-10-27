/**
 * 나의 풀이
 * StringBuilder 이용
 */
class Solution {
    public String solution(String my_string) {
        String answer = new StringBuilder(my_string).reverse().toString();
        return answer;
    }
}

/**
 * 나의 풀이
 * char 배열로 만들어 하나씩 변경
 */
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        int lt=0, rt=chars.length-1;
        while (lt < rt) {
            char tmp = chars[lt];
            chars[lt] = chars[rt];
            chars[rt] = tmp;
            lt++;
            rt--;
        }
        answer = String.valueOf(chars);
        return answer;
    }
}