package Buoi5.Bai15;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<HocSinh> danhSachHocSinh = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("-------MENU--------");
            System.out.println("1.Nhập thông tin học sinh");
            System.out.println("2.Hiện thông tin học sinh");
            System.out.println("3.Tìm học sinh có năm sinh X");
            System.out.println("4.Ghi file");
            System.out.println("5.Đọc file");
            System.out.println("0.Thoát chương trình");
            int choice = 0;
            System.out.println("Nhập lựa chọn của bạn : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    nhapThongtin();
                    break;
                case 2:
                    hienThongTin();
                    break;
                case 3:
                    timHocSinh();
                    break;
                case 4:
                    ghiFile();
                    break;
                case 5:
                    docFile();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                default:
                    System.out.println("Nhập sai rồi");
                    break;
            }
        }
    }

    public static void nhapThongtin() {
        System.out.print("Nhập số lượng học sinh (N): ");
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println("Nhập thông tin cho học sinh thứ " + (i + 1));
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Năm sinh: ");
            int namSinh = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Giới tính (true-nam/false-nữ): ");
            boolean gioiTinh = scanner.nextBoolean();
            scanner.nextLine();
            System.out.print("Tên lớp: ");
            String tenLop = scanner.nextLine();

            HocSinh hocSinh = new HocSinh(hoTen, namSinh, gioiTinh, tenLop);
            danhSachHocSinh.add(hocSinh);
        }
    }

    public static void hienThongTin() {
        // Hiển thị thông tin các học sinh
        System.out.println("Thông tin các học sinh:");
        for (HocSinh hocSinh : danhSachHocSinh) {
            System.out.println(hocSinh.getHoTen() + " - Năm sinh: " + hocSinh.getNamSinh() + " - Giới tính: " +
                    (hocSinh.isGioiTinh() ? "Nam" : "Nữ") + " - Lớp: " + hocSinh.getTenLop());
        }
    }

    public static void timHocSinh() {
        System.out.print("Nhập năm sinh X: ");
        int namSinhX = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Các học sinh sinh năm " + namSinhX + ":");
        for (HocSinh hocSinh : danhSachHocSinh) {
            if (hocSinh.getNamSinh() == namSinhX) {
                System.out.println("Tên: " + hocSinh.getHoTen());
            }
        }
    }

    public static void ghiFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\DELL\\OneDrive\\Documents\\JavaProjects\\HocSinh\\HOCSINH.DAT"));
            for (HocSinh hocSinh : danhSachHocSinh) {
                writer.write(hocSinh.getHoTen() + "," + hocSinh.getNamSinh() + "," + hocSinh.isGioiTinh() + "," + hocSinh.getTenLop() + "\n");
            }
            writer.close();
            System.out.println("Danh sách học sinh đã được lưu vào file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void docFile() {
        danhSachHocSinh.clear(); // Xóa danh sách hiện tại trước khi đọc từ file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DELL\\OneDrive\\Documents\\JavaProjects\\HocSinh\\HOCSINH.DAT"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String hoTen = parts[0];
                int namSinh = Integer.parseInt(parts[1]);
                boolean gioiTinh = Boolean.parseBoolean(parts[2]);
                String tenLop = parts[3];
                HocSinh hocSinh = new HocSinh(hoTen, namSinh, gioiTinh, tenLop);
                danhSachHocSinh.add(hocSinh);
            }
            reader.close();
            System.out.println("Danh sách học sinh đã được đọc từ file.");
            for (HocSinh hocSinh : danhSachHocSinh) {
                System.out.println(hocSinh.getHoTen() + " - Năm sinh: " + hocSinh.getNamSinh() + " - Giới tính: " +
                        (hocSinh.isGioiTinh() ? "Nam" : "Nữ") + " - Lớp: " + hocSinh.getTenLop() );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
