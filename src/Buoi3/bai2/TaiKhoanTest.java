package Buoi3.bai2;

import java.util.Scanner;

public class TaiKhoanTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaiKhoan taiKhoan = new TaiKhoan(12062003, "Bui Van Tien");
        TaiKhoan taiKhoan1 = new TaiKhoan(28022003, "Bui Van Quan");
        TaiKhoan[] dstk = {taiKhoan, taiKhoan1};
        boolean timThayTaiKhoan = false;
        while (!timThayTaiKhoan) {
            System.out.println("Nhap ho ten tai khoan ban muon thuc hien thanh toan: ");
            String tentk = scanner.nextLine();
            TaiKhoan taiKhoanMuonRut = TaiKhoan.timKiemTaiKhoanTheoTen(dstk, tentk);
            if (taiKhoanMuonRut != null) {
                timThayTaiKhoan = true;
            } else {
                System.out.println("Không tìm thấy tài khoản vui lòng nhập lại!!!");
            }


            if (taiKhoanMuonRut != null) {
                // Thực hiện các tác động lên tài khoản muốn rút
                System.out.println("Tài khoản muốn rút: " + taiKhoanMuonRut.getTentk());
                int lc = 0;
                double sum = taiKhoanMuonRut.getSotientk();
                do {
                    System.out.println("1.Chuc nang gui tien");
                    System.out.println("2.Chuc nang rut tien");
                    System.out.println("3.Chuc nang dao han");
                    System.out.println("Vui long nhap lua chon: ");
                    lc = scanner.nextInt();
                    switch (lc) {
                        case 1:
                            System.out.println("Nhap so tien muon nap: ");
                            double soTienNap = scanner.nextDouble();
                            taiKhoanMuonRut.guiTien(soTienNap);
                            System.out.println("Nạp tiền thành công!");
                            sum += soTienNap;
                            System.out.println("Số dư hiện tại: " + sum);
                            break;
                        case 2:
                            boolean nhapLai = true;
                            while (nhapLai) {
                                System.out.println("So tiền hiện tại là: " + sum);
                                System.out.print("Nhập số tiền muốn rút: ");
                                double soTienRut = scanner.nextDouble();

                                if (soTienRut > sum) {
                                    System.out.println("Số tiền rút vượt quá số dư trong tài khoản. Vui lòng nhập lại.");
                                } else {
                                    // Gọi phương thức rutTien để thực hiện rút tiền
                                    System.out.println("Rút tiền thành công.");
                                    System.out.println("Số dư hiện tại là:");
                                    System.out.println(taiKhoanMuonRut.rutTien(sum, soTienRut));
                                    nhapLai = false;
                                    // Cập nhật số tiền sau khi rút từ tài khoản
                                    // sum =sum -(soTienRut+TaiKhoan.phi); // sum = sum - soTienRut;
                                    //System.out.println("Số dư còn lại là: " + sum);
                                }
                            }
                            break;

                        case 3:
                            System.out.println("So tien con lai sau khi den ki dao han");
                            taiKhoanMuonRut.daoHan();
                            break;
                        default:
                            System.out.println("Lua chon sai vui long chon lai.");
                            break;
                    }
                } while (lc != 0);
                scanner.close();
            } else {
                System.out.println("Không tìm thấy tài khoản muốn rút.");
            }
        }
    }
}

