package Buoi5.Bai13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho cán bộ chuyên viên
        System.out.println("Nhập hệ số lương của chuyên viên: ");
        double heSoChuyenVien = scanner.nextDouble();
        CanBo chuyenVien = new ChuyenVien(heSoChuyenVien);

        // Nhập thông tin cho cán bộ giảng viên
        System.out.println("Nhập hệ số lương của giảng viên: ");
        double heSoGiangVien = scanner.nextDouble();
        System.out.println("Nhập phụ cấp của giảng viên: ");
        double phuCapGiangVien = scanner.nextDouble();
        CanBo giangVien = new GiangVien(heSoGiangVien, phuCapGiangVien);

        // Nhập thông tin cho cán bộ quản lý
        System.out.println("Nhập hệ số lương của quản lý: ");
        double heSoQuanLy = scanner.nextDouble();
        System.out.println("Nhập hệ số phụ cấp của quản lý: ");
        double heSoPhuCapQuanLy = scanner.nextDouble();
        CanBo quanLy = new QuanLy(heSoQuanLy, heSoPhuCapQuanLy);

        scanner.close();

        // In thông tin và lương của từng cán bộ
        System.out.println(chuyenVien.thongTin());
        System.out.println("Lương: " + chuyenVien.tinhLuong());
        System.out.println("----------------------");

        System.out.println(giangVien.thongTin());
        System.out.println("Lương: " + giangVien.tinhLuong());
        System.out.println("----------------------");

        System.out.println(quanLy.thongTin());
        System.out.println("Lương: " + quanLy.tinhLuong());
        System.out.println("----------------------");
    }
}
