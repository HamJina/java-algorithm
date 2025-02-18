import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        String string = "320000";
        String string2 = new StringBuilder(string).reverse().toString();
        System.out.println(string2);
        int start = string2.indexOf("0");
        System.out.println(start);
        int end = string2.lastIndexOf("0");
        System.out.println(end);
        String string1 = new StringBuilder(string2).delete(start, end+1).toString();
        System.out.println(string1);


    }
}
