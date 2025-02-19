package inflearn.배열._09_격자판최대합;

import java.util.Scanner;

public class 격자판최대합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
                if(i == j) {
                    sum3 += arr[i][j];
                }
                if(i + j == n-1) sum4 += arr[i][j];
            }
            int max1 = Math.max(sum1, sum2);
            if(max1 > max) max = max1;
        }
        int max2 = Math.max(sum3, sum4);
        if(max2 > max) max = max2;
        System.out.println(max);
    }
}
