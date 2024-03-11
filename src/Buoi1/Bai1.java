package Buoi1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu mang");
        n = scanner.nextInt();
        int[] a = new int[n];
        nhap(a,n);
        hien(a,n);
        hiensole(a,n);
        timgtnn(a,n);
    }
    public static void nhap(int[] a, int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu a[ "+i+"]:");
            a[i] = sc.nextInt();
        }
    }
    public static void hien(int[] a, int n){
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
    public static void hiensole(int [] a,int n){
        System.out.println("Cac phan tu le co trong mang:");
        for (int i = 0; i < n; i++) {
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }
    }
    public static void timgtnn(int []a,int n){
        int gtnn = a[0];
        int vt = 0 ;
        for (int i = 0; i < n; i++) {
            if(a[i]<gtnn){
                gtnn = a[i];
                vt = i;
            }

        }
        System.out.println("Gia tri nho nhat:"+gtnn);
        System.out.println("Vi tri:"+vt);
    }
}
