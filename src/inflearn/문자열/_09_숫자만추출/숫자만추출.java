package inflearn.문자열._09_숫자만추출;

import java.util.Scanner;

public class 숫자만추출 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String answer = "";
        for(char s : input.toCharArray()) {
            if(!Character.isAlphabetic(s))
                if(s == '0' && answer.length() == 0) {
                } else {
                    answer += s;
                }
        }

        System.out.println(answer);
    }
}
