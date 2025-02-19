package inflearn.배열._08_등수구하기;

import java.util.Arrays;
import java.util.Scanner;

public class 등수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int rank = 1;
            for (int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] < arr[j]) rank++;
            }
            System.out.print(rank + " ");
        }
    }
}
