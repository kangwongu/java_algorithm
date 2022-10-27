/**
 * 나의 풀이
 * Math.sqrt()가 제곱근을 반환한다.
 * 구한 제곱근으로 n을 나눴을때 딱 나누어떨어지면, 제곱수
 */
class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = (int)Math.sqrt(n);
        if (n%num == 0) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}