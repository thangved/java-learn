package cit.ctu;

public class SDDiem {
    public static void main(String[] args) {
        Diem A = new Diem(3, 4);
        System.out.print("Điểm A: ");
        A.hienThi();

        Diem B = new Diem();
        B.nhapDiem();
        System.out.print("Điểm B: ");
        B.hienThi();

        Diem C = new Diem(- B.giaTriX(), - B.giaTriY());
        System.out.print("Điểm C: ");
        C.hienThi();

        System.out.println("Khoảng cách từ điểm B đến O là:" + B.khoangCach());
        System.out.println("Khoảng cách từ điểm A đến B là:" + B.khoangCach(A));
    }
}
