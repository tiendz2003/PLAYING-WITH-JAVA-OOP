package Buoi2.Bai1;

import Buoi2.Bai1.HocSinh;

import java.util.Scanner;

public class QuanLyHocSinh {
    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap so luong hoc sinh: ");
            int n = scanner.nextInt();
            scanner.nextLine();
            HocSinh dshocsinh[] = new HocSinh[n];
            int soHocSinh = 0;
            int tongTienHocSinh = 0;
            for (int i = 0; i < n; i++) {
                HocSinh hocSinh = new HocSinh();
                System.out.println("Nhap ma hoc sinh: ");
                hocSinh.maHs = scanner.nextLine();
                System.out.println("Nhap ho ten: ");
                hocSinh.hoten = scanner.nextLine();
                System.out.println("Nhap ten lop: ");
                hocSinh.lop = scanner.nextLine();
                System.out.println("Nhap so buoi an : ");
                hocSinh.sobuoian = scanner.nextInt();
                scanner.nextLine();
                dshocsinh[soHocSinh] = hocSinh;
                soHocSinh++;

                tongTienHocSinh += hocSinh.TongTienBanTru();
            }
            for (int i = 0; i < n; i++) {
                HocSinh hs = dshocsinh[i];
                System.out.println((i + 1) + ". " + hs);
            }
            for (int i = 0; i < n; i++) {
                HocSinh hocSinh = dshocsinh[i];
                System.out.println("Tong so tien an cua hoc sinh thu " + (i + 1) + "la: ");
                hocSinh.dsTongTienAn();

            }
            System.out.println("Tong tien cua tat ca hoc sinh: " + tongTienHocSinh);
            //Sắp xếp danh sách học sinh theo số tiền ăn

            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (dshocsinh[i].TongTienBanTru() > dshocsinh[j].TongTienBanTru()) {
                        HocSinh temp = dshocsinh[i];
                        temp = dshocsinh[j];
                        dshocsinh[j] = dshocsinh[i];
                        dshocsinh[i] = temp;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                HocSinh hs = dshocsinh[i];
                System.out.println((i + 1) + ". Thong tin hoc sinh:");
                hs.dsTongTienAn();
            }

            HocSinh[] dshsbuoiantren20 = new HocSinh[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                HocSinh hs = dshocsinh[i];
                if (dshocsinh[i].sobuoian > 20) {
                    dshsbuoiantren20[count] = hs;
                    count++;
                }
            }
            for (int i = 0; i < count; i++) {
                System.out.println("Danh sach hoc sinh co so buoi an tren 20: " + dshsbuoiantren20[i]);
            }
        }

    }
}
