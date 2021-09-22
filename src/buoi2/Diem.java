package buoi2;

import java.util.Scanner;

public class Diem {
<<<<<<< HEAD
    private int x,
            y;
=======
    private int x, y;
>>>>>>> 0b21f16114808059e160fcf6f27b12546ee4d18c

    public Diem() {
        x = 0;
        y = 0;
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

<<<<<<< HEAD
    public Diem(Diem d){
        x = d.x;
        y = d.y;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        this.x = x;
        this.y = y;
        scanner.close();
    }

    public void in() {
        System.out.format("(%d, %d)\n", x, y);
    }

    public void doiDiem(int dx, int dy) {
        x += dx;
        y += dy;
    }

=======
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

>>>>>>> 0b21f16114808059e160fcf6f27b12546ee4d18c
    public int giaTriX() {
        return x;
    }

    public int giaTriY() {
        return y;
    }

<<<<<<< HEAD
    public float khoangCach(Diem d) {
        return (float) Math.sqrt(Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2));
    }

    public float khoangCach() {
        return khoangCach(new Diem());
=======
    public void doiDiem(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public float khoangCach() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public float khoangCach(Diem d) {
        return (float) Math.sqrt(Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2));
>>>>>>> 0b21f16114808059e160fcf6f27b12546ee4d18c
    }
}
