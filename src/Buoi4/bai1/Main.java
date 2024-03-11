package Buoi4.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLTL qltl = new QLTL();
        boolean quayLai = true;
        while(quayLai){
            quayLai = true;
            int lc;
            System.out.println("1.Nhap danh sach tu lanh ");
            System.out.println("2.Hien danh sach tu lanh ");
            System.out.println("3.Tim kiem theo hang san xuat");
            System.out.println("4.Tong tien cac tu lanh da nhap ");
            System.out.println("5.Danh sach cac tu lanh tren 200l ");
            System.out.println("6.Sap xep danh sach tu lanh theo thu tu giam dan vao so luong");
            System.out.println("7.Thoát");
            System.out.println("Nhap chuc nang ban muon chon: ");
            lc = scanner.nextInt();
            scanner.nextLine();
            switch (lc) {
                case 1:
                    qltl.nhapThongTin();
                    break;
                case 2:
                    qltl.hienThiThongTin();
                    break;
                case 3:
                    String n ;
                    System.out.println("Nhap hang san xuat ma ban muon tim: ");
                    n = scanner.nextLine();
                    qltl.dstlTheoHangSX(n);
                    break;
                case 4:
                    System.out.println("Tong tien cac tu lanh da nhap: ");
                    qltl.tinhTongTien();
                    break;
                case 5:
                    qltl.tuLanhtren200l();
                    break;
                case 6:
                    System.out.println("Danh sach tu lanh sap xep theo chieu giam dan theo so luong: ");
                    qltl.sxTuLanh();
                    break;
                case 7:
                    quayLai = false;
                    break;
                default:
                    System.out.println("Lua chon khong dung!Vui long nhap lai");
                    break;
            }
        }
    }
}
