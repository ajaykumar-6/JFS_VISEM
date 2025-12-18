
import java.util.*;

public class PalindromeRecursion {

    public static boolean palinderome_func(int i, int j, String s) {
        if (i >= j) {
            return true;
        }
        if (s.charAt(i) != s.charAt(j)) {
            return false; 
        }else {
            return palinderome_func(i + 1, j - 1, s);
        }
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String s = k.nextLine().toLowerCase();
        int i = 0, j = s.length() - 1;
        if (palinderome_func(i, j, s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
