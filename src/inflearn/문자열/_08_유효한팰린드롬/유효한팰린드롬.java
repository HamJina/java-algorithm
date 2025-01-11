package inflearn.문자열._08_유효한팰린드롬;

import java.util.Scanner;

public class 유효한팰린드롬 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] s = input.toCharArray();

        //공백 무시하기
        boolean result = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (Character.isAlphabetic(s[i])) { //알파벳만가지고 따짐
                if(Character.toLowerCase(s[i]) != Character.toLowerCase(s[s.length - i -1])) {
                    result = false;
                    break;
                }
            }
        }

        if(result)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
