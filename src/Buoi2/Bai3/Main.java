package Buoi2.Bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        //int scn = 0;
        float pc;
        System.out.println("Nhập phụ cấp:");
        pc= scanner.nextFloat();
        System.out.println("Nhap so luong cong nhan: ");
        n = scanner.nextInt();
        scanner.nextLine();
        CongNhan[] congNhan = new CongNhan[n];
        for (int i = 0; i < n; i++) {
            CongNhan congnhan = new CongNhan();
            System.out.println("Nhap ho va ten: ");
            congnhan.hoten = scanner.nextLine();
            System.out.println("Nhap he so luong: ");
            congnhan.hsl = scanner.nextFloat();
            scanner.nextLine();
            congNhan[i] = congnhan;
//            congNhan[scn]=congnhan;
//            scn++;
        }
        System.out.println("Danh sách các công nhân:");
        for (int i = 0; i < n; i++) {
            CongNhan cn = congNhan[i];
            float luongSauPhuCap = cn.tinhLuong(pc); // Tính lương sau khi tính phụ cấp.
            System.out.println("Họ và tên: " + cn.hoten);
            System.out.println("Hệ số lương: " + cn.hsl);
            System.out.println("Lương cơ bản(không có phụ cấp): " + cn.tinhLuong(0)); // Hiển thị lương cơ bản
            System.out.println("Lương (bao gồm phụ cấp): " + luongSauPhuCap);
            System.out.println();
        }

        // Tính tổng số tiền chênh lệch do chi trả phụ cấp
        float tongLuongTruocPhuCap = 0;
        float tongLuongSauPhuCap = 0;
        for (int i = 0; i < n; i++) {
            CongNhan cn = congNhan[i];
            tongLuongTruocPhuCap += cn.tinhLuong(0); // Tính lương trước khi có phụ cấp.
            tongLuongSauPhuCap += cn.tinhLuong(pc); // Tính lương sau khi có phụ cấp.
        }
        float chenhLech = tongLuongSauPhuCap - tongLuongTruocPhuCap;
        System.out.println("Tổng số tiền chênh lệch do chi trả phụ cấp là: " + chenhLech);

        /*int s;
        System.out.println("Nhap vao so luong ban muon so sanh : ");
        s=scanner.nextInt();
        CongNhan[] dscnluonglonhondk = new CongNhan[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            CongNhan cn = congNhan[i];
            if(congNhan[i].tinhLuong()>s){
                dscnluonglonhondk[count]=cn;
                count++;
            }
        }
        System.out.println("Danh sach cac cong nhan co tong luong >"+s+"la: ");
        for (int i = 0; i < count; i++) {
            System.out.println("HVT: "+dscnluonglonhondk[i].hoten);
            System.out.println("HSL: "+dscnluonglonhondk[i].hsl);
            System.out.println("Lương: " + dscnluonglonhondk[i].tinhLuong());
            System.out.println();
        }*/

    }
}
