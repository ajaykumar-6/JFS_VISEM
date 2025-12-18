
import java.util.*;

public class OddEvenOrder {

    public static ArrayList<Integer> fun(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd.add(arr[i]);
            } else {
                even.add(arr[i]);
            }
        }
        for (int num : even) {
            odd.add(num);
        }
        return odd;
    }

    public static void main(String args[]) {
        int[] a = {12, 27, 7, 6, 2, 3, 5, 1, 16};
        ArrayList<Integer> res = fun(a);
        System.out.println(res);
    }
}
