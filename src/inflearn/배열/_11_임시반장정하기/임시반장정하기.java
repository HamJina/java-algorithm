package inflearn.배열._11_임시반장정하기;

import java.util.Scanner;

public class 임시반장정하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] students = new int[n]; //같은반 학생이 몇명이었는지 저장하는 배열
        boolean[][] same = new boolean[n][n];
        int[][] arr = new int[n][5]; //학생별 반정보를 나타내는 배열
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt(); //반정보 입력받기
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < n; k++) {
                    if(arr[i][j] == arr[k][j] && i != k && same[i][k] == false) {
                        same[i][k] = true;
                        same[k][i] = true;
                    }
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(same[i][j] == true) {
                    students[i]++;
                }

            }
        }

        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if(students[i] > max) {
                max  = students[i];
                maxIndex = i;
            }
        }

        System.out.println(maxIndex + 1);


    }
}
