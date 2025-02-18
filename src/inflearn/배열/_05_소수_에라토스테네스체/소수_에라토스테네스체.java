package inflearn.배열._05_소수_에라토스테네스체;
import java.util.Scanner;

public class 소수_에라토스테네스체 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            if (n == 2) {
                System.out.println(1);
                return;
            }

            boolean[] isPrime = new boolean[n + 1];
            for (int i = 2; i <= n; i++) {
                isPrime[i] = true;
            }


            for (int i = 2; i * i <= n; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            int count = 0;
            for (int i = 2; i < n; i++) {
                if (isPrime[i]) {
                    count++;
                }
            }

            System.out.println(count);
        }

}
