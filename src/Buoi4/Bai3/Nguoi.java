package Buoi4.Bai3;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String gioiTinh;

    public Nguoi() {

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học sinh: ");
        this.hoTen = scanner.nextLine();
        boolean gioitinhHS = false;
        while (!gioitinhHS){
            System.out.println("Nhập giới tính học sinh(nam/nữ): ");
            String gt = scanner.nextLine();
            if(this.gioiTinh.equals("nam")|| this.gioiTinh.equals("nữ")){
                this.gioiTinh = gt;
                gioitinhHS = true;
            }else{
                System.out.println("Sai hãy nhập lại giới tính");
            }
        }
        System.out.println(" ");
    }
    public void hienTT(){
        System.out.println("Họ và tên học sinh: "+this.hoTen);
        System.out.println("Giới tính học sinh: "+this.gioiTinh);
    }
}
