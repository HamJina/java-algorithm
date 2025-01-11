package inflearn.문자열._06_중복문자제거;

import java.util.Scanner;

public class 중복문자제거 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        char[] result = new char[chars.length];

        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if(input.indexOf(chars[i]) >= i) {
                result[index] = chars[i];
                index++;
            }
        }
        // char 배열을 문자열로 변환, 유효한 부분만 사용
        String output = new String(result, 0, index);
        System.out.println(output);
    }
}
