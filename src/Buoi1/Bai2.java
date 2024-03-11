package Buoi1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(fibonaci(i));
        }

    }
    public static int fibonaci(int n){
        if( n == 0 || n == 1){
            return 1;
        }else {
            return (fibonaci(n-2)+fibonaci(n-1));
        }
    }
}
