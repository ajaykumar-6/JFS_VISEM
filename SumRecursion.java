
import java.util.*;

public class SumRecursion {

    public static void main(String args[]) {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        int res = 0;
        int result = fun(Math.abs(n), res);
        System.out.println("Summation : " + result);
    }

    public static int fun(int n, int res) {
        if (n == 0) {
            return res;
        }
        res += n % 10;
        n /= 10;
        return fun(n, res);
    }
}
