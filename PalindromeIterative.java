
public class PalindromeIterative {

    public static void main(String args[]) {
        String a = "Liril".toLowerCase();
        StringBuilder s = new StringBuilder(a);
        s.reverse();
        if (a.equals(s.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
