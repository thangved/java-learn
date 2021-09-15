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

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem x:");
        x = scanner.nextInt();
        System.out.println("Nhap diem y:");
        y = scanner.nextInt();
    }

    public void in() {
        System.out.println("Toa do diem la:");
        System.out.format("(%d, %d)\n", x, y);
    }

    public int giaTriX() {
        return x;
    }

    public int giaTriY() {
        return y;
    }

    public void doiDiem(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public float khoangCach() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public float khoangCach(Diem d) {
        return (float) Math.sqrt(Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2));
    }
}
