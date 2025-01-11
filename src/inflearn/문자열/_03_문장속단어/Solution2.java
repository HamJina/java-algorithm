package inflearn.문자열._03_문장속단어;

import java.util.Scanner;

//indexOf, subString사용하기
public class Solution2 {
    public String solution(String str) {
        String answer="";
        int m = Integer.MIN_VALUE, pos; //가장 작은 값으로 초기화
        while((pos=str.indexOf(' ')) != -1) {//띄워쓰기 위치를 반환해줌
            String tmp = str.substring(0,pos); //단어띄워내기
            int len = tmp.length();
            if(len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1); //뒤쪽 문자열 잘라내기
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution.solution(str));
    }
}
