package inflearn.문자열._05_특정문자뒤집기;

import java.util.Scanner;

public class 특정문자뒤집기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        char[] result = new char[input.length()];
        for (int i = 0; i < chars.length; i++) {
            if(Character.isAlphabetic(chars[i])) {
                result[chars.length - 1 - i] = chars[i];
            } else {
                result[i] = chars[i];
            }
        }
        System.out.println(result);
    }
}
