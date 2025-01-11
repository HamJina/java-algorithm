package inflearn.문자열._01_문자찾기;

import java.util.Scanner;

public class 문자찾기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String ch = scanner.nextLine().toLowerCase(); //특정문자

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ch.charAt(0))
                count++;
        }

        System.out.println(count);

        /*
        *  향상된 for문으로도 접근 가능
        for(chat x : input.toCharArray()) //배열을 순회 가능하므로 문자배열 생성후 순회한다.
            if(x==ch) count++;
        * * */
    }
}
