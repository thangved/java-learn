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
        d1.nhap();
        d2.nhap();
    }

    public void in() {
        d1.in();
        d2.in();
    }

    public void doi(Diem d1, Diem d2) {
        d1.doiDiem(d1.giaTriX(), d1.giaTriY());
        d2.doiDiem(d2.giaTriX(), d2.giaTriY());
    }

    public float doDai() {
        return d1.khoangCach(d2);
    }

    public double goc() {
        int dx = d1.giaTriX() - d2.giaTriX();
        int dy = d1.giaTriY() - d2.giaTriY();
        return Math.atan((double) dy / dx);
    }
}
