/**
 * 나의 풀이
 * 이중 for문으로 문제를 해결했다.
 * 파이썬이랑 헷갈려서 문자열 * n을 하고, 문자 * n을 하는 등 삽질을 했다
 */
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        for (int i=0; i<my_string.length(); i++) {
            String result = "";
            for (int j=0; j<n; j++) {
                result = String.valueOf(my_string.charAt(i));
                answer += result;
            }
        }

        return answer;
    }
}

/**
 * 다른 사람 풀이
 * String의 메소드 중에 repeat 메소드로 특정 문자열을 n번 반복할 수 있었다.
 */
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n);
        }
        return answer;
    }
}