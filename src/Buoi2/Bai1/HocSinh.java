package Buoi2.Bai1;

public class HocSinh {
    public String maHs;
    public String hoten;
    public String lop;
    public int sobuoian;


    public HocSinh() {

    }

    public String getMaHs() {
        return maHs;
    }

    public void setMaHs(String maHs) {
        this.maHs = maHs;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getSobuoian() {
        return sobuoian;
    }

    public void setSobuoian(int sobuoian) {
        this.sobuoian = sobuoian;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "maHs='" + maHs + '\'' +
                ", hoten='" + hoten + '\'' +
                ", lop='" + lop + '\'' +
                ", sobuoian=" + sobuoian +
                '}';
    }
    public int TongTienBanTru(){
        return sobuoian*30000;
    }
    public void dsTongTienAn(){
        System.out.println(TongTienBanTru()+"VND");

    }
}
