package Buoi6.Bai17.Bai18;


import java.util.Scanner;

public class CongNhan extends ConNguoi{
    private static double hsl = 2.34;

    public CongNhan(String hoTen, int soNam) {
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
        System.out.println("Nhập tên công nhân:" );
        hoTen = scanner.nextLine();
        System.out.println("Nhập số năm công tác: ");
        soNam = scanner.nextInt();
        scanner.nextLine();

    }
    public void hienThongtin(){
        System.out.println("Tên của công nhân: "+hoTen);
        System.out.println("Số năm công tác : "+ soNam);
        System.out.println("Lương cơ bản của công nhân : "+tinhLuong());
        System.out.println("Phụ cấp: "+phuCap());
        double tongLuong = tinhLuong()+phuCap();
        System.out.println("Lương gồm phụ cấp: "+ tongLuong);
    }
}

