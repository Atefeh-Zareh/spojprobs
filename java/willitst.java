import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.spoj.com/problems/WILLITST/
 */
public class WillList {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n;
        n = Long.parseLong(br.readLine());
        if (n == 1)
            System.out.println("TAK");
        else
            while (n % 2 == 0 && n > 0) {
                n /= 2;
                if (n == 1) {
                    System.out.println("TAK");
                    break;
                }
            }
        if (n > 1)
            System.out.println("NIE");
    }
}
