/**
 * char 타입을 int 타입에 + 하니까 원하는 값이 안나왔다.
 * 아예 String 타입으로 변환 후, parseInt해서 해결
 */
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (int i=0; i<my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }
        return answer;
    }
}