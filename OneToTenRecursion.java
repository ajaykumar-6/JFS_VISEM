
import java.util.*;

class OneToTenRecursion {

    public static void print(int i, int j) {
        if (i == j + 1) {
            return;
        }
        System.out.println(i);
        i++;
        print(i, j);
    }

    public static void main(String args[]) {
        Scanner k = new Scanner(System.in);
        int a = 1;
        int n = 10;
        print(a, n);
    }
}
