package inflearn.문자열._04_단어뒤집기;

import java.util.Scanner;

public class 단어뒤집기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            String s = scanner.next();
            char[] chars = s.toCharArray();
            char[] reversed = new char[chars.length];
            //문자열 뒤집기
            for (int j = 0; j < chars.length; j++) {
                reversed[j] = chars[chars.length - 1 - j];
            }
            System.out.println(reversed);
        }


    }
}
