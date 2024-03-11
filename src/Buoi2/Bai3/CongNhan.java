package Buoi2.Bai3;

public class CongNhan {
    public static float lcb = 1150;
    public String hoten;
    public float hsl;

    public CongNhan() {

    }

    public static float getLcb() {
        return lcb;
    }

    public static void setLcb(float lcb) {
        CongNhan.lcb = lcb;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public float tinhLuong(float pc){
        float luongCB = lcb*hsl;
        float luongPhucap = luongCB*(1+pc);
        return luongPhucap;
    }
}
