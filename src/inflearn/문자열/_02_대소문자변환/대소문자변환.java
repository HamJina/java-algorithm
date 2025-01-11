package inflearn.문자열._02_대소문자변환;

import java.util.Scanner;

public class 대소문자변환 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] chars = input.toCharArray(); //문자배열로 전환
        for (int i = 0; i < chars.length; i++) {
            if(Character.isUpperCase(chars[i])){ //해당문자가 대문자인지
                chars[i] = Character.toLowerCase(chars[i]);
            } else if(Character.isLowerCase(chars[i])) { //해당문자가 소문자인지
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        System.out.println(chars);
    }
}
