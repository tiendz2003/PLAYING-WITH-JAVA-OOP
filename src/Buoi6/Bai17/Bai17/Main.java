package Buoi6.Bai17.Bai17;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Tour> tours = new ArrayList<>();
    private static ArrayList<KhachHang> khachHangs = new ArrayList<>();
    private static ArrayList<DatTour> datTours = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Hiển thị menu
            System.out.println("\nHệ thống đặt Tour du lịch");
            System.out.println("1. Thêm Tour Du Lịch");
            System.out.println("2. Thêm Khách Hàng");
            System.out.println("3. Đặt Tour Du Lịch cho khách hàng");
            System.out.println("4. Xem các Tour Du Lịch đã được đặt");
            System.out.println("5. Đọc File");
            System.out.println("Vui lòng chọn:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            // Xử lý lựa chọn
            switch (choice) {
                case 1:
                    nhapTour();
                    System.out.println("Thông tin tour: ");
                    hienTT(tours);
                    break;
                case 2:
                    nhapKhachHang();
                    System.out.println("Thông tin khách hàng: ");
                    hienTT(khachHangs);
                    break;
                case 3:
                    datTour();
                    break;
                case 4:
                    System.out.println("Thông tin đặt tour");
                    hienTT(datTours);
                    break;
                case 5:
                    docFile("C:\\Users\\DELL\\OneDrive\\Documents\\JavaProjects\\DatTour\\DATOUR.DAT",datTours);
                    hienTT(datTours);
                    break;
                case 6:
                    System.out.println("Thông tin hóa đơn của khách hàng: ");
                    tinhHoaDon();
                    break;
                case 7:
                    System.out.println("Thóat chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn sai rồi!");
            }
        }
    }


    private static void ghiTourFile(String fileName, ArrayList<Tour> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (Tour tour : list) {
                writer.write(tour.getIdTour() + "," + tour.getKieuTour() + "," + tour.getTtTour() + "," + tour.getDonGia());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void ghiKhachHangFile(String fileName, ArrayList<KhachHang> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (KhachHang khachHang : list) {
                writer.write(khachHang.getIdKh() + "," + khachHang.getTenKh() + "," + khachHang.getKieuKh());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void ghiDatTourFile(String fileName, ArrayList<DatTour> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (DatTour datTour : list) {
                writer.write(datTour.getIdKh() + "," + datTour.getIdTour() + "," + datTour.getSoLuong() + "," + datTour.getNgayDat());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void docFile(String fileName, ArrayList<DatTour> list) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int idKh = Integer.parseInt(parts[0]);
                int idTour = Integer.parseInt(parts[1]);
                int soLuong = Integer.parseInt(parts[2]);
                String ngayDat = parts[3];
                DatTour datTour = new DatTour(idKh, idTour, soLuong, ngayDat);
                list.add(datTour);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void nhapTour() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng Tour muốn thêm :");
        int soLuong = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập mã Tour:");
            int idTour = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập kiểu Tour: ");
            String kieuTour = scanner.nextLine();
            System.out.println("Nhập thông tin: ");
            String tt = scanner.nextLine();
            System.out.println("Đơn giá: ");
            Double gia = scanner.nextDouble();
            scanner.nextLine();
            Tour tour = new Tour(idTour, kieuTour, tt, gia);
            tours.add(tour);
        }
        ghiTourFile("C:\\Users\\DELL\\OneDrive\\Documents\\JavaProjects\\Tour\\TOUR.DAT", tours);
    }

    private static void nhapKhachHang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng khách hàng :");
        int soLuong = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập mã khách hàng");
            int idKh = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập tên khách hàng: ");
            String tenKh = scanner.nextLine();
            System.out.println("Nhập kiểu khách hàng: (cá nhân/tập thể)");
            String kieuKh = scanner.nextLine();
            KhachHang khachHang = new KhachHang(idKh, tenKh, kieuKh);
            khachHangs.add(khachHang);
        }
        ghiKhachHangFile("C:\\Users\\DELL\\OneDrive\\Documents\\JavaProjects\\KhachHang\\KHACHHANG.DAT", khachHangs);
    }

    private static void datTour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập thông tin đặt tour cho mã khách hàng: ");
            int idKh = scanner.nextInt();
            scanner.nextLine();

            KhachHang khachHang = null;
            for (KhachHang kh : khachHangs) {
                if (kh.getIdKh() == idKh) {
                    khachHang = kh;
                    break;
                }
            }
            if (khachHang == null) {
                System.out.println("Không tìm thấy khách hàng");
                return;
            }

            System.out.println("Nhập mã tour cho khách hàng: ");
            int idTour = scanner.nextInt();
            scanner.nextLine();
            Tour tour = null;
            for (Tour tr : tours) {
                if (tr.getIdTour() == idTour) {
                    tour = tr;
                    break;
                }
            }
            if (tour == null) {
                System.out.println("Không tìm mã tour");
                return;
            }

            System.out.println("Nhập số lượng người: ");
            int soLuong = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập ngày đi: ");
            String ngayDat = scanner.nextLine();

            DatTour datTour = new DatTour(idKh, idTour, soLuong, ngayDat);

            datTours.add(datTour);

            ghiDatTourFile("C:\\Users\\DELL\\OneDrive\\Documents\\JavaProjects\\DatTour\\DATOUR.DAT", datTours);
            System.out.println("Bạn muốn đặt tiếp tour cho khách hàng tiếp theo không(Có/Không)");
            String datTiepTour = scanner.nextLine().trim().toLowerCase();
            if (!datTiepTour.equals("Có")) {
                break;
            }
        }
    }

    private static void hienTT(ArrayList list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    private static void tinhHoaDon() {
        for (DatTour datTour : datTours) {
            int idTour = datTour.getIdTour();
            double donGia = 0;
            boolean found = false;
            for (Tour tour : tours) {
                if (tour.getIdTour() == idTour) {
                    donGia = tour.getDonGia();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Không tìm thấy tour với mã " + idTour);
                continue;
            }
            double hoaDon = datTour.getSoLuong() * donGia;
            System.out.println("Mã Khách hàng: " + datTour.getIdKh() + ", Mã Tour: " + idTour + ", Hóa đơn: " + hoaDon);
        }

    }

}
