package inflearn.문자열._12_암호;

import java.util.Scanner;

public class 암호{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String input = scanner.next();
        String answer = "";

        for (int i = 0; i < input.length(); i+=7) {
            String substring = input.substring(i, i + 7);
            String ss = "";

            //substring -> 2진수
            for(char s : substring.toCharArray()) {
                if(s=='#') ss+=1;
                else if(s=='*') ss+=0;
            }

            //2진수 -> 10진수
            int answer1 = Integer.parseInt(ss, 2);

            //10진수 -> 문자
            char c = (char) (answer1);
            answer += c;
        }

        System.out.println(answer);

    }
}
