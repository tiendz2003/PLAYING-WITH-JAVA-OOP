package Buoi2.bai2;

public class HinhVuong {
    public int canh;

    public HinhVuong() {

    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                '}';
    }

    public int tinhChuVi(){
        return canh*4;
    }
    public int tinhDienTich(){
        return (int) Math.pow(canh,2);
    }

}
