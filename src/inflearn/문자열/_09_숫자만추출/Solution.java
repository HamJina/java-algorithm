package inflearn.문자열._09_숫자만추출;

import java.util.Scanner;

//아스키번호가 48('0')~57('9')사이에 있는 것은 숫자이다.
public class Solution {
    public int solution(String str) {
        int answer = 0;
        for(char x : str.toCharArray()){
            if(x>=48 && x<=57)
                answer=answer*10+(x-48);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(s.solution(str));
    }
}
