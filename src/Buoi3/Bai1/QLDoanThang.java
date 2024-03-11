package Buoi3.Bai1;

import java.util.Scanner;

public class QLDoanThang {
    private int n;
    private DoanThang[] ds;

    public void NhapDS() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong doan thang: ");
        n = scanner.nextInt();
        ds = new DoanThang[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho doan thang thu " + (i + 1));
            ds[i] = new DoanThang();
            ds[i].nhap();
        }
    }

    public void XuatDs() {
        System.out.println("\nDanh sach doan thang:");
        for (int i = 0; i < n; i++) {
            System.out.println("Doan thang thu " + (i + 1) + ":");
            ds[i].xuat();
            System.out.println("Chieu dai cua doan thang: " + ds[i].tinhChieuDai());
        }
    }
    public double getMaxLength() {
        double maxLength = 0;
        int position = -1;

        for (int i = 0; i < n; i++) {
            double length = ds[i].tinhChieuDai();
            if (length > maxLength) {
                maxLength = length;
                position = i;
            }
        }
            System.out.println("Do dai lon nhat cua doan thang: " + maxLength);
            System.out.println("Vi tri trong mang: " + position);
        return maxLength;
    }



}
