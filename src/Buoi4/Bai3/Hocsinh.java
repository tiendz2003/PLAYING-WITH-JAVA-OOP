package Buoi4.Bai3;

import java.util.Scanner;

public class Hocsinh extends Nguoi{
    private String tenLop;

    public Hocsinh() {
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhập tên lớp của học sinh: ");
        this.tenLop = scanner.nextLine();
        System.out.println(" ");
    }

    @Override
    public void hienTT() {
        super.hienTT();
        System.out.println("Tên lớp của học sinh là: "+this.tenLop);
    }
}
