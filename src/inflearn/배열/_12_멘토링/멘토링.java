package inflearn.배열._12_멘토링;

import java.util.Scanner;

public class 멘토링 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] rank = new int[m][n];
        int[][] mento = new int[n][n]; //멘토&멘티의 관계를 나타내는 배열
        for (int i= 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rank[i][j] = sc.nextInt(); //값 입력받기
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if(j < k) {
                        mento[rank[i][j]-1][rank[i][k]-1]++;
                    }
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(mento[i][j] == m) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
