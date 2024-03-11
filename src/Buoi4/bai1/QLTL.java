package Buoi4.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLTL {
    private ArrayList<TuLanh> dstl = new ArrayList<>();

    public QLTL() {
        dstl = new ArrayList<>();
    }

    public void themTuLanh(TuLanh tuLanh) {
        dstl.add(tuLanh);
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong tu lanh ban muon them: ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            TuLanh tuLanh = new TuLanh();
            System.out.println("Nhap thong tin tu lanh thu " + (i + 1) + "la: ");
            tuLanh.Nhap();
            themTuLanh(tuLanh);
        }

    }

    public void hienThiThongTin() {
        int i = 1;
        for (TuLanh tuLanh : dstl) {
            System.out.println("Thong tin cua tu lanh thu " + (i) + "la: ");
            tuLanh.HienThi();
            i++;
        }
    }

    public void dstlTheoHangSX(String n) {

        for (TuLanh tuLanh1 : dstl) {
            if ((tuLanh1.hangSX).equals(n)) {
                System.out.println("Danh sach tu lanh co hang san xuat duoc nhap vao la: ");
                tuLanh1.HienThi();
            }
        }
    }

    public void tinhTongTien() {
        int sum = 0;
        for (TuLanh tuLanh : dstl) {
            sum += tuLanh.tinhTien();
        }
        System.out.println(sum);
    }

    public void tuLanhtren200l() {
        for (TuLanh tuLanh : dstl) {
            if (tuLanh.dungTich > 200) {
                System.out.println("Danh sach tu lanh co dung tich tren 200l la: ");
                tuLanh.HienThi();
            }
        }
    }

    public void sxTuLanh() {
        Collections.sort(dstl, new Comparator<TuLanh>() {
            @Override
            public int compare(TuLanh o1, TuLanh o2) {
                if (o1.soLuong < o2.soLuong) {
                    return 1;
                } else {
                    if (o1.soLuong == o2.soLuong) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        for (TuLanh tuLanh:dstl) {
            System.out.println("Ten: "+tuLanh.getHangSX()+"So luong : "+tuLanh.getSoLuong());
        }
    }
}