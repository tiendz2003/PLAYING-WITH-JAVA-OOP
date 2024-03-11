package Buoi3.Bai1;

import java.util.Scanner;

public class Diem {
    private int x;
    private int y;

    public Diem() {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x: ");
        x = sc.nextInt();
        System.out.println("Nhap y: ");
        y = sc.nextInt();
        System.out.println();
    }
    public void Xuat(){
        System.out.println("Gia tri cua x: "+x);
        System.out.println("Gia tri cua y: "+y);
    }
}
