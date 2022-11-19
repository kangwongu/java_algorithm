/**
 * 나의 풀이
 * while문과 substring을 사용해 문자열을 잘라가며 조건에 맞는 문자를 추출
 */
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        while (cipher.length() > 0) {
            if (cipher.length() < code) break;
            String substring = cipher.substring(code-1, code);
            sb.append(substring);
            cipher = cipher.substring(code);
        }

        answer = sb.toString();
        return answer;
    }
}

/**
 * 다른 사람 풀이
 * if((i+1)%code)==0)을 통해 code의 배수만 추출했다.
 * 배수를 구하는 건  (~%~==0)을 통해 해결할 수 있다. 기억해!!!!!!!!!!!!!!
 */
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<cipher.length(); i++){
            if((i+1)%code==0) sb.append(cipher.charAt(i));
        }

        answer = sb.toString();
        return answer;
    }
}