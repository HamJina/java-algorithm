package inflearn.배열._04_피보나치수열;

import java.util.Arrays;
import java.util.Scanner;

public class 피보나치수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < n; i++) {
            array[i] = array[i-1] + array[i-2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
