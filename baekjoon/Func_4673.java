package baekjoon;

public class Func_4673 {
    // 셀프넘버가 아닌 수를 구하는 메소드
    public static int d(int num) {
        int sum = num;
        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        boolean[] selfNumberList = new boolean[10001];

        // 셀프넘버 아닌 수 구하기
        for(int i=1; i<10001; i++) {
            int nonSelfNum = d(i);

            // 셀프넘버가 아닌 수를 true로 변경
            if(nonSelfNum < 10001)
                selfNumberList[nonSelfNum] = true;
        }

        StringBuilder sb = new StringBuilder();

        // 셀프넘버인 수 출력
        for(int i=1; i<10001; i++) {
            if(!selfNumberList[i]) {
                sb.append(i+"\n");
            }
        }
        System.out.println(sb);
    }
}
