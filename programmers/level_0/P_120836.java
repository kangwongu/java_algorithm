/**
 * 처음 풀이
 * 단순하게 이중 for문으로 시도
 * 몇몇은 성공했지만 시간초과로 실패했다
 */
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if ((i*j) == n) answer++;
            }
        }
        return answer;
    }
}

/**
 * 다른 풀이
 * 나머지가 0이면, 약수라는 의미
 * 이렇게 푸니까 성공했다
 * 수학 문제 어렵
 */
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            if (n%i==0) answer++;
        }
        return answer;
    }
}