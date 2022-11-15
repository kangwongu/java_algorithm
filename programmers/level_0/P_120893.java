/**
 * 한 문자씩 대문자인지 소문자인지 검사하며 해결했다
 */
class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) sb.append(Character.toLowerCase(my_string.charAt(i)));
            else sb.append(Character.toUpperCase(my_string.charAt(i)));
        }
        answer = sb.toString();
        return answer;
    }
}