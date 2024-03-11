package Buoi3.Bai1;

public class Main {
    public static void main(String[] args) {
        Diem diem = new Diem();
        diem.nhap();
        diem.Xuat();
        //
        QLDoanThang ds = new QLDoanThang();
        ds.NhapDS();
        ds.XuatDs();
        ds.getMaxLength();
    }

}
