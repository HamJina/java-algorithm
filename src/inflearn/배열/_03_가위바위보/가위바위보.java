package inflearn.배열._03_가위바위보;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가위바위보 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int[] B = new int[n];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            if(A[i] == B[i]) System.out.println("D");
            else if(A[i] > B[i]) {
                if(A[i] == 3 && B[i] == 1) System.out.println("B");
                else System.out.println("A");
            } else {
                if(A[i] == 1 && B[i] == 3) System.out.println("A");
                else System.out.println("B");
            }
        }
    }
}
