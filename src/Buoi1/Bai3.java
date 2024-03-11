package Buoi1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap a:");
        double a = sc.nextInt();
        System.out.println("Nhap b:");
        double b = sc.nextInt();
        System.out.println("Nhap c:");
        double  c = sc.nextInt();
        tinhS(a,b,c);
    }
    public static void tinhS(double a,double b ,double c){
        double p;
        double S;
        p = (a+b+c)/2;
        S= Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Dien tich cua tam giac la: "+S);
    }
}
