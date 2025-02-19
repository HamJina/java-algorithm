package inflearn.배열._05_소수_에라토스테네스체;

import java.util.Scanner;

public class solution {
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];
        for (int i = 2; i <= n; i++) {
            if(ch[i] == 0) {
                answer++;
                //i의 배수 체크하기
                for (int j = i; j <= n ; j+=i) ch[j] = 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        solution T = new solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
