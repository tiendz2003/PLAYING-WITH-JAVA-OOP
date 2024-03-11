package Buoi6.Bai17.Bai18;

import java.util.Scanner;

public class DienVien extends ConNguoi{
    private static double hsl = 3.2;

    public DienVien(String hoTen, int soNam) {
        super(hoTen, soNam);
    }

    @Override
    public double tinhLuong() {
        return hsl *luongCoBan ;
    }


    @Override
    public double phuCap() {
        return (tinhLuong()*0.3)*soNam;
    }
    public void nhapThongtin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên diễn viên:" );
        hoTen = scanner.nextLine();
        System.out.println("Nhập số năm công tác: ");
        soNam = scanner.nextInt();
        scanner.nextLine();

    }
    public void hienThongtin(){
        System.out.println("Tên của diễn viên: "+hoTen);
        System.out.println("Số năm công tác : "+ soNam);
        System.out.println("Lương cơ bản của diễn viên : "+tinhLuong());
        System.out.println("Phụ cấp: "+phuCap());
        double tongLuong = tinhLuong()+phuCap();
        System.out.println("Lương gồm phụ cấp: "+ tongLuong);
    }
}
