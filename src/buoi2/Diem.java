package buoi2;

import java.util.Scanner;

public class Diem {
    private int x, y;

    public Diem() {
        x = 0;
        y = 0;
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Diem(Diem d) {
        x = d.x;
        y = d.y;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm x:");
        x = scanner.nextInt();
        System.out.println("Nhập điểm y:");
        y = scanner.nextInt();
    }

    public void in() {
        System.out.println("Tọa độ điểm là:");
        System.out.format("(%d, %d)\n", x, y);
    }

    public void doiDiem(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int giaTriX() {
        return x;
    }

    public int giaTriY() {
        return y;
    }

    public float khoangCach(Diem d) {
        return (float) Math.sqrt(Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2));
    }

    public float khoangCach() {
        return khoangCach(new Diem(0, 0));
    }

    @Override
    public String toString() {
        String string = "";
        string += "(" + x + ", " + y + ")";
        return string;
    }
}
