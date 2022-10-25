/**
 * 나의 풀이
 */
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int jjak = 0;
        int hol = 0;
        for (int num : num_list) {
            if (num % 2 == 0) jjak++;
            else hol++;
        }
        answer[0] = jjak;
        answer[1] = hol;
        return answer;
    }
}

/**
 * 다른 사람 풀이
 * for문에서 짝수 홀수를 구하고 배열에 값을 넣는 것 까지 한번에 처리했다.
 * 훨씬 간결하네
 */
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }
}