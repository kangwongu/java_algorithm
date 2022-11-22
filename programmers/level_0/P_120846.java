/**
 * count 변수(약수 개수)를 두고 이중 for문을 통해 약수 개수를 구했다.
 */
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            int count = 0;
            for (int j=1; j<=i; j++) {
                if (i%j==0) count++;
            }
            if (count >= 3) answer++;
        }
        return answer;
    }
}