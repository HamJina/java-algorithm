package inflearn.문자열._11_문자열압축;

import java.util.Scanner;

public class 문자열압축 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        String answer = "";
        int num = 1;
        for (int i = 0; i < input.length(); i += num) {
            num = 1;
            for (int j = i+1; j < input.length(); j++) {
                if(input.charAt(i) == input.charAt(j))
                    num++;
                else
                    break; //다른 문자가 나오면 해당 문자 정보 추가하기
            }
            answer += input.charAt(i);
            if(num!=1)answer += num;
        }
        System.out.println(answer);
    }
}
