package Buoi5.Bai15;

import java.io.Serializable;

public class HocSinh extends Nguoi implements IHoatDong, Serializable {
    private String tenLop;


    public HocSinh(String hoTen, int namSinh, boolean gioiTinh, String tenLop) {
        super(hoTen, namSinh, gioiTinh);
        this.tenLop = tenLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public String gioiThieu() {
        System.out.println("Mình là học sinh học lớp: "+tenLop);
        return null;
    }
}
