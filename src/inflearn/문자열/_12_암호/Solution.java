package inflearn.문자열._12_암호;

import java.util.Scanner;

public class Solution {
    public String solution(int n, String str) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*','0');
            int num = Integer.parseInt(tmp, 2); //tmp를 2진수로 변환
            answer += (char) num;

            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(s.solution(n,str));
    }
}
