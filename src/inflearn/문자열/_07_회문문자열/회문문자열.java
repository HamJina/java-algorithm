package inflearn.문자열._07_회문문자열;

import java.util.Scanner;

public class 회문문자열 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] s = input.toCharArray();

        boolean result = true;
        for (int i = 0; i < s.length / 2; i++) {
            if(Character.toLowerCase(s[i]) != Character.toLowerCase(s[s.length -i - 1])) {
                result = false;
                break;
            }
        }

        if(result)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
