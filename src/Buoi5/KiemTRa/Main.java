package Buoi5.KiemTRa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    private static List<MyPham> dsMyPham = new ArrayList<>();
    private static List<KhachHang> dsKhachHang = new ArrayList<>();
    private static List<HoaDon> dsHoaDon = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("-----Quan Ly Ban Hang My Pham------");
            System.out.println("1. Nhap va hien thi danh sach my pham");
            System.out.println("2. Nhap va hien thi danh sach khach hang");
            System.out.println("3. Nhap va hien thi danh sach hoa don");
            System.out.println("4. In ra danh sach my pham het han");
            System.out.println("5. Sap xep danh sach my pham theo gia tang dan");
            System.out.println("6. Thoat");
            System.out.println("Chon: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    nhapDsMyPham();
                    hienthiDsMyPham();
                    break;
                case 2:
                    nhapKhachHang();
                    hienThongtinKh();
                    break;
                case 3:
                    nhapVaHienthiDsHoaDon();
                    hienthiDsHoaDon();
                    break;
                case 4:
                    hienthiDsMyPhamHetHan();
                    break;
                case 5:
                    sapXepdsMyPhamtheoGia();
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Nhap sai! Vui long nhap lai!");
            }
        } while (choice != 6);
    }

    private static void nhapDsMyPham() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong my pham: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // consume newline character
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap thong tin my pham thu " + (i + 1) + ":");
            System.out.print("Ma my pham :");
            int maMyPham = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            System.out.print("Ten my pham: ");
            String tenMyPham = scanner.nextLine();
            System.out.print("Nhap mo ta: ");
            String moTa = scanner.nextLine();
            System.out.print("Nhap so luong: ");
            int sl = scanner.nextInt();
            System.out.print("Nhap don gia: ");
            double donGia = scanner.nextDouble();
            scanner.nextLine(); // consume newline character
            String loaiMyPham;
            do {
                System.out.print("Loai my pham (duong da/trang diem): ");
                loaiMyPham = scanner.nextLine();
                if (!loaiMyPham.equalsIgnoreCase("duong da") && !loaiMyPham.equalsIgnoreCase("trang diem")) {
                    System.out.println("Loai my pham khong hop le! Vui long nhap lai.");
                }
            } while (!loaiMyPham.equalsIgnoreCase("duong da") && !loaiMyPham.equalsIgnoreCase("trang diem"));
            System.out.print("Ngay het han: ");
            String ngayHetHan = scanner.nextLine();
            MyPham myPham = new MyPham(maMyPham, tenMyPham, moTa, sl, donGia, loaiMyPham, ngayHetHan);
            dsMyPham.add(myPham);
        }
    }

    private static void hienthiDsMyPham() {
        System.out.println("-----Danh Sach My Pham -----------");
        for (MyPham myPham : dsMyPham) {
            System.out.println(myPham);
            System.out.println("-----------------");
        }
    }

    private static void nhapKhachHang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong khach hang: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // consume newline character
        System.out.println("Nhap thong tin khach hang:");
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap thong tin khach hang thu " + (i + 1) + ":");
            System.out.print("Ma khach hang: ");
            int maKhachHang = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            System.out.print("Ten khach hang: ");
            String tenKhachHang = scanner.nextLine();
            System.out.print("Nhap so dien thoai: ");
            int soDienThoai = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            System.out.print("Nhap dia chi: ");
            String diaChi = scanner.nextLine();
            KhachHang khachHang = new KhachHang(maKhachHang, tenKhachHang, soDienThoai, diaChi);
            dsKhachHang.add(khachHang);
        }
    }

    private static void hienThongtinKh() {
        System.out.println("-----Thong Tin Khach Hang -----------");
        for (KhachHang khachHang : dsKhachHang) {
            System.out.println(khachHang);
            System.out.println("-----------------");
        }
    }

    private static void nhapVaHienthiDsHoaDon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong hoa don: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // consume newline character
        System.out.println("Nhap thong tin hoa don:");
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap thong tin hoa don thu " + (i + 1) + ":");
            System.out.print("Ma hoa don: ");
            int maHoaDon = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            System.out.print("Ngay lap (dd/mm/yyyy): ");
            String ngayLap = scanner.nextLine();
            System.out.print("Ma khach hang: ");
            int maKhachHang = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            KhachHang khachHang = null;
            for (KhachHang kh : dsKhachHang) {
                if (kh.getIdKh() == maKhachHang) {
                    khachHang = kh;
                    break;
                }
            }
            if (khachHang == null) {
                System.out.println("Khong tim thay khach hang voi ma " + maKhachHang);
                continue;
            }

            System.out.println("Nhap so luong my pham trong hoa don: ");
            int soLuongMyPham = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            List<MyPham> dsMyPhamTrongHoaDon = new ArrayList<>();
            for (int j = 0; j < soLuongMyPham; j++) {
                System.out.println("Nhap thong tin cho my pham thu " + (j + 1) + ":");
                System.out.print("Ma my pham: ");
                int maMyPham = scanner.nextInt();
                scanner.nextLine(); // consume newline character
                MyPham myPham = null;
                for (MyPham mp : dsMyPham) {
                    if (mp.getIdMyPham() == maMyPham) {
                        myPham = mp;
                        break;
                    }
                }
                if (myPham == null) {
                    System.out.println("Khong tim thay my pham voi ma " + maMyPham);
                    continue;
                }
                System.out.print("Nhap so luong: ");
                int sl = scanner.nextInt();
                scanner.nextLine(); // consume newline character
                myPham.setSl(sl);
                dsMyPhamTrongHoaDon.add(myPham);
            }
            HoaDon hoaDon = new HoaDon(maHoaDon, ngayLap, khachHang, dsMyPhamTrongHoaDon);
            dsHoaDon.add(hoaDon);
        }
    }

    private static void hienthiDsHoaDon() {
        System.out.println("-----Danh Sach Hoa Don -----------");
        for (HoaDon hoaDon : dsHoaDon) {
            System.out.println(hoaDon);
            System.out.println("-----------------");
        }
    }
    private static void hienthiDsMyPhamHetHan() {
        System.out.println("-----Danh Sach My Pham Het Han -----------");
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (MyPham myPham : dsMyPham) {
            LocalDate ngayHetHan = LocalDate.parse(myPham.getNgayHetHan(), formatter);
            if (currentDate.isAfter(ngayHetHan)) {
                System.out.println(myPham);
                System.out.println("-----------------");
            }
        }
    }

    private static void sapXepdsMyPhamtheoGia() {
        Collections.sort(dsMyPham, new Comparator<MyPham>() {
            @Override
            public int compare(MyPham o1, MyPham o2) {
                return Double.compare(o1.getDonGia(), o2.getDonGia());
            }
        });
        System.out.println("Danh sach my pham theo gia tang dan");
        for (MyPham myPham : dsMyPham) {
            System.out.println(myPham);
            System.out.println("-----------------");
        }
    }
}

