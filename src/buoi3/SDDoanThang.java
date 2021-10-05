package buoi3;

import buoi2.Diem;

public class SDDoanThang {
    public static void main(String[] args) {
        Diem A = new Diem(2, 5);
        Diem B = new Diem(20, 35);
        DoanThang AB = new DoanThang(A, B);
        System.out.println("Doan thang AB:");
        AB.in();
        AB.doi(5, 3);
        System.out.println();
        System.out.println("Doan thang AB sau khi tinh tien (5, 3):");
        AB.in();

        DoanThang CD = new DoanThang();
        CD.nhap();
        System.out.println("Do dai cua CD la: " + CD.doDai());
        System.out.println("Goc cua CD so voi truc hoanh: " + CD.goc() + "rad");
    }
}
