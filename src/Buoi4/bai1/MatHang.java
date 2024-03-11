package Buoi4.bai1;

import java.util.Scanner;

public class MatHang {
    public String tenHang;
    public int maHang;
    public String nuocSX;

    public MatHang() {
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getNuocSX() {
        return nuocSX;
    }

    public void setNuocSX(String nuocSX) {
        this.nuocSX = nuocSX;
    }

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten hang: ");
        tenHang = scanner.nextLine();
        System.out.println("Nhap ma hang: ");
        maHang = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap nuoc san xuat: ");
        nuocSX =scanner.nextLine();
    }
    public void HienThi(){
        System.out.println("Ten cua hang la: "+tenHang);
        System.out.println("Ten cua ma hang la: "+maHang);
        System.out.println("Ten cua nuoc san xuat la: "+nuocSX);

    }
}
