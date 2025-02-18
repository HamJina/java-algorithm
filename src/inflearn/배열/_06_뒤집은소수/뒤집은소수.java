package inflearn.배열._06_뒤집은소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 뒤집은소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            //입력받은 숫자 뒤집기
            String reversed = new StringBuilder(st.nextToken()).reverse().toString();
            int start = reversed.indexOf("0");
            int end = reversed.lastIndexOf("0");
            if(start != -1 && end != -1) {
                //0이 존재한다면
                String deleted = new StringBuilder(reversed).delete(start, end + 1).toString();
                nums[i] = Integer.parseInt(deleted);
            }
            nums[i] = Integer.parseInt(reversed);
        }

        //숫자 배열에서 소수 찾기
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 2 || nums[i] == 3) System.out.print(nums[i] + " ");
            else if(nums[i] % 2 == 1 && nums[i] != 1){ //홀수중에서 소수 찾기
                boolean isPrime = true;
                for (int j = 3; j <= Math.sqrt(nums[i]); j+=2) {
                    if(nums[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) System.out.print(nums[i] + " ");
            }
        }
    }
}
