package Buoi4.Bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng học sinh: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Hocsinh [] danhSachHS = new Hocsinh[n];

        // Nhập thông tin cho từng người
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin học sinh thứ " + (i + 1) + ":");
            Hocsinh hs = new Hocsinh();
            hs.nhapThongTin();
            danhSachHS[i] = hs;
        }

        // Hiển thị thông tin của từng người
        System.out.println("Thông tin của"+ n +  "học sinh" );
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin người thứ " + (i + 1) + ":");
            danhSachHS[i].hienTT();
            System.out.println();
        }
        // Sắp xếp danh sách học sinh theo tên lớp
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (danhSachHS[j].getTenLop().compareTo(danhSachHS[j + 1].getTenLop()) > 0) {
                    Hocsinh temp = danhSachHS[j];
                    danhSachHS[j] = danhSachHS[j + 1];
                    danhSachHS[j + 1] = temp;
                }
            }
        }

        // Hiển thị thông tin của từng học sinh sau khi đã sắp xếp
        System.out.println("Danh sách học sinh sau khi sắp xếp theo tên lớp:");
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin học sinh thứ " + (i + 1) + ":");
            danhSachHS[i].hienTT();
            System.out.println();
        }
    }
}
