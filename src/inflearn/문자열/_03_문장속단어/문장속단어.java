package inflearn.문자열._03_문장속단어;

import java.util.Scanner;

public class 문장속단어 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] str = input.split(" "); //공백을 기준으로 단어를 분리한다.

        int max = 0;
        String maxStr = "";
        for (String s : str) {
            if(s.length() > max) {
                max = s.length();
                maxStr = s;
            }
        }
        System.out.println(maxStr);
    }
}
