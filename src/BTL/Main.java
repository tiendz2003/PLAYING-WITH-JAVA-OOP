package BTL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<NhanVien> dsnv = new ArrayList<>();
    private List<HoaDon> dshd = new ArrayList<>();
    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("THÔNG TIN LƯƠNG CỦA NHÂN VIÊN");
            System.out.println("1.Nhập thông tin nhân viên");
            System.out.println("2.Hiện thông tin của nhân viên và lương của họ.");
            System.out.println("3.Xuất hóa đơn");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                  nhapThongTin();
                  break;
                case 2:
                    hienThongTinNv();
                    break;
                case 3:
                    xuatHoaDonChoNhanVien();
                    break;
                default:
                    System.out.println("Thao tác sai.Nhập lại !!!");
                    break;
            }
        }while(choice != 0);
    }

    public static void nhapThongTin(){
        int soNhanVienToanThoiGian, soNhanVienThoiVu;
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien;

        System.out.print("Nhập số nhân viên toàn thời gian: ");
        soNhanVienToanThoiGian = scanner.nextInt();
        System.out.println("NHẬP THÔNG TIN NHÂN VIÊN TOÀN THỜI GIAN");
        for (int i = 0; i < soNhanVienToanThoiGian; i++) {
            System.out.println("Nhập thông tin nhân viên toàn thời gian thứ " + (i + 1) + ": ");
            nhanVien = new NhanVienToanThoiGian();  // lúc này đối tượng nhanVien đóng vai trò là nhân viên toàn thời gian
            nhanVien.nhapThongTin();
            dsnv.add(nhanVien);
        }

        System.out.print("Nhập số nhân viên thời vụ: ");
        soNhanVienThoiVu = scanner.nextInt();
        System.out.println("NHẬP THÔNG TIN NHÂN VIÊN THỜI VỤ");
        for (int i = 0; i < soNhanVienThoiVu; i++) {
            System.out.println("Nhập thông tin nhân viên thời vụ thứ " + (i + 1) + ": ");
            nhanVien = new NhanVienThoiVu();    // còn bây giờ đối tượng nhanVien đóng vai trò là nhân viên thời vụ
            nhanVien.nhapThongTin();
            dsnv.add(nhanVien);
        }
    }
    public static void hienThongTinNv(){
        System.out.println("THÔNG TIN NHÂN VIÊN");
        for (NhanVien nv : dsnv) {
            nv.tinhLuong();
            System.out.println(nv);
        }

    }

    public static void xuatHoaDonChoNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên cần xuất hóa đơn:");
        int idNhanVien = scanner.nextInt();
        scanner.nextLine();

        // Tìm nhân viên trong danh sách
        NhanVien nvChon = null;
        for (NhanVien nv : dsnv) {
            if (nv instanceof NhanVienToanThoiGian) {
                if (((NhanVienToanThoiGian) nv).getIdnv() == idNhanVien) {
                    nvChon = nv;
                    break;
                }
            } else if (nv instanceof NhanVienThoiVu) {
                if (((NhanVienThoiVu) nv).getIdnvtv() == idNhanVien) {
                    nvChon = nv;
                    break;
                }
            }
        }

        if (nvChon != null) {
            // Nhập thông tin mã hóa đơn và ngày lập
            System.out.println("Nhập mã hóa đơn:");
            int maHoaDon = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập ngày lập hóa đơn:");
            String ngayLap = scanner.nextLine();

            // Tạo hóa đơn chỉ cho nhân viên đang chọn
            HoaDon hoaDon = new HoaDon(maHoaDon, ngayLap, List.of(nvChon));
            hoaDon.xuatThongTinHoaDon();
        } else {
            System.out.println("Không tìm thấy nhân viên có mã: " + idNhanVien);
        }
    }

    }

