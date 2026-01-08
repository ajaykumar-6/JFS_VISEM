package com.su2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static boolean fun(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> fun(ArrayList<Integer> arr, int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            boolean isPrime = fun(i);
            if (isPrime) {
                arr.add(i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Fist Number : ");
        int n1 = k.nextInt();
        System.out.print("Second Number : ");
        int n2 = k.nextInt();
        seiveOfEratostenus(n1, n2);
        // ArrayList<Integer> res = new ArrayList<>();
        // ArrayList<Integer> ans = fun(res, n1, n2);
        // for (int num : res) {
        //     System.out.print(num + " ");
        // }
        // using seive of Eratostanis;

    }

    public static void seiveOfEratostenus(int start, int end) {
        boolean[] arr = new boolean[end + 1];
        Arrays.fill(arr, true);
        if (end >= 0) {
            arr[0] = false;
        }
        if (end >= 1) {
            arr[1] = false;
        }
        for (int i = 2; i <= Math.sqrt(end); i++) {
            if (arr[i]) {
                for (int j = i * i; j <= end; j += i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = Math.max(start, 2); i <= end; i++) {
            if (arr[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
