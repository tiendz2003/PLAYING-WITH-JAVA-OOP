package Buoi2.bai2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HinhVuong hinhVuong = new HinhVuong();
        HCN hcn = new HCN();
        System.out.println("Nhap do dai canh : ");
        hinhVuong.canh = scanner.nextInt();
        System.out.println("Nhap chieu dai cua HCN: ");
        hcn.cd = scanner.nextInt();
        System.out.println("Nhap chieu rong: ");
        hcn.cr = scanner.nextInt();
        System.out.println("CANH HINH VUONG = "+hinhVuong.toString());
        System.out.println("Chieu dai va chieu rong hcn: "+hcn.toString());

        //chuvi,Dien tich hinh vuong
        System.out.println("Chu vi hinh vuong la: "+hinhVuong.tinhChuVi());
        System.out.println("Dien tich hinh vuong la: "+hinhVuong.tinhDienTich());
        //Chuvi,dien tich hcn
        System.out.println("Chu vi hinh chu nhat la:  "+hcn.tinhChuVi());
        System.out.println("Dien tich hinh chu nhat la: "+hcn.tinhDienTich());
    }
}
