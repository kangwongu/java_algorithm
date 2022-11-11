/**
 * 처음 풀이
 * String의 replace함수를 사용해 모음을 공백으로 대체했다
 */
class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replace("a","").replace("e","")
                .replace("i","").replace("o","").replace("u","");
        return answer;
    }
}

/**
 * 다른 풀이
 * replaceAll을 사용하면 더 간결하게 해결할 수 있다.
 * [aeiou]를 통해 대상 문장에서 모음만 공백으로 대체했다
 */
class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aeiou]","");
        return answer;
    }
}