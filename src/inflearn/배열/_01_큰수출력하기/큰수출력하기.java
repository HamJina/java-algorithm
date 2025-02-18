package inflearn.배열._01_큰수출력하기;

import java.util.Scanner;

public class 큰수출력하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if(i == 0) {
                System.out.print(array[i] + " "); //첫 번째 수는 무조건 출력한다.
            } else {
                if(array[i] > array[i-1]) System.out.print(array[i] + " ");
            }
        }
    }

}
