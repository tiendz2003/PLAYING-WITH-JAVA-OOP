package Buoi4.bai1;

import java.util.Scanner;

public class TuLanh extends MatHang {
    public int dungTich;
    public String mauSac;
    public String hangSX;
    public int soLuong;
    public float donGia;

    public TuLanh() {

    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    @Override
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhap dung tich cua tu lanh: ");
        dungTich = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap mau sac cua tu lanh: ");
        mauSac = scanner.nextLine();
        System.out.println("Nhap hang san xuat cua tu lanh: ");
        hangSX= scanner.nextLine();
        System.out.println("Nhap so luong : ");
        soLuong = scanner.nextInt();
        System.out.println("Nhap don gia: ");
        donGia = scanner.nextFloat();
        scanner.nextLine();
    }

    @Override
    public void HienThi() {
        super.HienThi();
        System.out.println("Dung tich cua tu lanh la" +dungTich);
        System.out.println("Mau sac cua tu lanh la:"+mauSac);
        System.out.println("Hang san xuat cua tu lanh la: "+hangSX);
        System.out.println("So luong tu lanh la: "+soLuong);
        System.out.println("Don gia cua tu lanh la:"+donGia );
    }
    public float tinhTien(){
        return donGia*soLuong;
    }
}
