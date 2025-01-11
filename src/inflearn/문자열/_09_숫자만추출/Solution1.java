package inflearn.문자열._09_숫자만추출;

import java.util.Scanner;

public class Solution1 {
    public Integer solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) //해당 문자가 숫자이면
                answer+=x;
        }
        return Integer.parseInt(answer); //0208->208
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(s.solution(str));
    }
}
