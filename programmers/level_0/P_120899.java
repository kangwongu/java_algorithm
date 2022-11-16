class Solution {
    public int[] solution(int[] array) {
        // 가장 큰 수, 인덱스
        int[] answer = new int[2];
        int max = array[0];
        int pos = 0;
        for (int i=1; i<array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                pos = i;
            }
        }
        answer[0] = max;
        answer[1] = pos;

        return answer;
    }
}