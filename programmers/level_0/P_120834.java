/**
 * 나의 풀이
 * 그냥 replace 메소드 사용해서 다 바꿔버렸다.
 * 기괴해보이지만 확실한 성능
 */
class Solution {
    public String solution(int age) {
        String answer = "";
        String sAge = String.valueOf(age);
        answer = sAge.replace("0","a").replace("1","b").replace("2","c")
                .replace("3","d").replace("4","e").replace("5","f")
                .replace("6","g").replace("7","h").replace("8","i")
                .replace("9","j");
        return answer;
    }
}

/**
 * 다른 사람의 풀이
 * 아스키코드를 활용해서 문제를 풀었다.
 * 은근 아스키코드를 활용해서 숫자 - 문자간 변환을 많이 하는 것 같다
 */
class Solution {
    public String solution(int age) {
        String answer = "";
        String sAge = String.valueOf(age);
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<sAge.length(); i++)
        {
            sb.append((char)(sAge.charAt(i) + 49));
        }
        answer = sb.toString();

        return answer;
    }
}