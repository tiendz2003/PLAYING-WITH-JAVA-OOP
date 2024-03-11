package Buoi2.bai2;

public class HCN extends HinhVuong{
    public int cd;
    public int cr;

    public HCN() {
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public int getCr() {
        return cr;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }

    @Override
    public String toString() {
        return "HCN{" +
                "cd=" + cd +
                ", cr=" + cr +
                '}';
    }

    @Override
    public int tinhChuVi() {
        return (cd+cr)/2;
    }

    @Override
    public int tinhDienTich() {
        return cd*cr;
    }
}
