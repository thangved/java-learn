package buoi3;

import buoi2.Diem;

public class DoanThang {
    private Diem d1, d2;

    public DoanThang() {
        d1 = new Diem();
        d2 = new Diem();
    }

    public DoanThang(Diem d1, Diem d2) {
        this.d1 = new Diem(d1);
        this.d2 = new Diem(d2);
    }

    public DoanThang(int x1, int y1, int x2, int y2) {
        d1 = new Diem(x1, y1);
        d2 = new Diem(x2, y2);
    }

    public void nhap() {
        System.out.println("Nhap diem dau cua doan thang.");
        d1.nhap();
        System.out.println("Nhap diem cuoi cua doan thang.");
        d2.nhap();
    }

    public void in() {
        System.out.println("Diem dau cua doan thang: " + d1.toString());
        System.out.println("Diem cuoi cua doan thang: " + d2.toString());
    }

    public void doi(int dx, int dy) {
        d1.doiDiem(dx, dy);
        d2.doiDiem(dx, dy);
    }

    public float doDai() {
        return d1.khoangCach(d2);
    }

    public double goc() {
        int dx = d1.giaTriX() - d2.giaTriX();
        int dy = d1.giaTriY() - d2.giaTriY();
        return Math.atan((double) dy / dx);
    }

    @Override
    public String toString(){
        String string = "";
        string += "Diem dau: " + d1.toString() + ", ";
        string += "Diem cuoi: " + d2.toString();
        return string;
    }
}
