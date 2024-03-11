package Buoi6.Bai17.Bai18;

import java.util.Scanner;

public class QLCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn loại nhân viên (1 - Kỹ sư, 2 - Công nhân,3 -Diễn Viên):");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng thừa sau khi nhập số


        switch (choice) {
            case 1:
                KySu kySu = new KySu("", 0); // Khởi tạo đối tượng KySu
                kySu.nhapThongtin(); // Nhập thông tin cho kỹ sư
                kySu.hienThongtin(); // Hiển thị thông tin kỹ sư

                break;
            case 2:
                CongNhan congNhan = new CongNhan("", 0); // Khởi tạo đối tượng CongNhan
                congNhan.nhapThongtin(); // Nhập thông tin cho công nhân
                congNhan.hienThongtin(); // Hiển thị thông tin công nhân
                break;
            case 3:
                DienVien dienVien = new DienVien(" ",0);
                dienVien.hienThongtin();
                dienVien.nhapThongtin();
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }

        // Hiển thị thông tin nhân viên có lương cao nhất

    }
}
