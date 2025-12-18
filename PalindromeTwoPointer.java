
import java.util.*;

public class PalindromeTwoPointer {

    public static void main(String args[]) {
        Scanner k = new Scanner(System.in);
        String s = k.nextLine().toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println(false);
                break;
            }
            i++;
            j--;
        }
        if (i >= j) {
            System.out.println(true);
        }
    }
}
