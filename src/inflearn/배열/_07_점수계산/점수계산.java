package inflearn.배열._07_점수계산;

import java.util.Scanner;

public class 점수계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int correct = 0;
        int score = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                correct++;
                score += correct;
            } else if(arr[i] == 0) {
                correct = 0;
            }
        }

        System.out.println(score);
    }
}
