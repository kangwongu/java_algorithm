/**
 * 나의 풀이
 * 0 ~ n까지 순회하며 짝수를 골라냈다.
 */
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=0; i<n+1; i++) {
            if (i%2==0) {
                answer += i;
            }
        }
        return answer;
    }
}

/**
 * 다른 사람 풀이
 * 어차피 짝수를 골라내야하기 때문에, 0 ~ n까지 순회할 필요없이,
 * 바로 2부터 순회했다.
 * 게다가, i++이 아닌 i+=2로 아예 짝수형태로 증가되어, if문으로 짝수여부를 판단하지 않아도 된다
 *
 */
class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i+=2){
            answer+=i;
        }

        return answer;
    }
}