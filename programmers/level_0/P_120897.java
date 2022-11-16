import java.util.ArrayList;

/**
 * 나의 풀이
 * 배열의 크기를 알기 위해 for문으로 약수의 개수를 알아내고
 * 배열 각 요소에 약수를 넣어서 해결
 */
class Solution {
    public int[] solution(int n) {
        int count = 0;
        for (int i=1; i<=n; i++) {
            if (n%i==0) count++;
        }

        int[] answer = new int[count];
        int pos=0;
        for (int i=0; i<n; i++) {
            if (n%(i+1)==0) {
                answer[pos]=(i+1);
                pos++;
            }
        }

        return answer;
    }
}

/**
 * 다른 사람 풀이
 * 배열의 크기만 구하는 작업을 하지 않고, ArrayList에 담아 놓은 후,
 * 리스트의 사이즈로 배열 크기를 구하고 배열에 바로 넣어주어서 해결
 *
 * 나의 풀이보다 시간이 더 빠름
 */
import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> test_list = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(n % i == 0) test_list.add(i);
        }
        answer = new int[test_list.size()];
        for(int j = 0; j<test_list.size(); j++){
            answer[j] = test_list.get(j);

        }
        return answer;
    }
}