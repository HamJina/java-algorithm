package inflearn.문자열._10_가장짧은문자거리;

import java.util.Scanner;

import static java.lang.Math.abs;

//다시 확인!
public class 가장짧은문자거리 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();

        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if(t.charAt(0) == s.charAt(i)){
                answer += "0";
            } else { //r
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == t.charAt(0)) {
                        int dis = abs(i - j); // 거리 계산
                        if (dis < min) {
                            min = dis;
                        }
                    }
                }
                answer += min;
            }
        }
        for(char ss : answer.toCharArray()) {
            System.out.print(ss + " ");
        }
    }
}
