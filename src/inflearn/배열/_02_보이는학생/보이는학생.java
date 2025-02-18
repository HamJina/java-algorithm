package inflearn.배열._02_보이는학생;

import java.util.Scanner;

public class 보이는학생 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        int max = heights[0];
        int count = 1; //맨앞에 있는 학생은 항상 보이므로 1로 초기화
        for (int i = 1; i < heights.length; i++) {
            if(max < heights[i]) {
                count++;
                max = heights[i];
            }

        }

        System.out.println(count);

    }
}
