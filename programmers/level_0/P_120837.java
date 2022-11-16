/**
 * 나의 풀이
 * 배열로 개미의 공격력을 받고, 반복문을 통해 필요한 개미의 수를 구했다
 */
class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] ants = {5, 3, 1};
        for (int ant : ants) {
            answer += hp / ant;
            hp %= ant;

            if (hp == 0) break;
        }
        return answer;
    }
}

/**
 * 다른 사람의 풀이
 * 어떻게 이런 생각을 할 수 있을까.. 감탄했다
 * 역시 수학을 잘해야하나 싶기도 하고ㅜ
 */
class Solution {
    public int solution(int hp) {
        return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
    }
}