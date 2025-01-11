package inflearn.문자열._10_가장짧은문자거리;

import java.util.Scanner;

//왼쪽으로부터 t까지의 거리, 오른쪽으로부터 t까지의 거리 계산 둘중 작은거 남기기
public class Solution {
    public int[] solution(String s, String t) {

        int[] answer = new int[s.length()];
        //왼쪽으로부터의 거리 계산
        int p = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(0)) {
                p = 0;
                answer[i] = p;
            }
            else {
                p++;
                answer[i] = p;
            }
        }

        p = Integer.MAX_VALUE;
        //오른쪽으로부터의 거리 계싼
        for (int i = s.length() - 1; i > -1 ; i--) {
            if(s.charAt(i) == t.charAt(0)) p=0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p); //두개의 값중 작은 값을 넣는다.
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        System.out.println(sol.solution(s,t));
    }
}
