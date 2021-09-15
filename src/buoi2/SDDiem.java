package buoi2;

public class SDDiem {
    public static void main(String[] args) {
//        Tạo ra điểm A tọa độ (3,4). Hiển thị tọa độ điểm A ra màn hình.
        Diem A = new Diem(3, 4);
        System.out.println("Diem A");
        A.in();

//        Tạo ra điểm B với giá trị nhập từ bàn phím. Hiển thị tọa độ điểm B ra màn hình.
        Diem B = new Diem();
        System.out.println("Diem B");
        B.nhap();
        B.in();

//        Tạo ra điểm C đối xứng với điểm B qua gốc tọa độ. Hiển thị tọa độ điểm C ra màn hình.
        Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
        System.out.println("Diem C");
        C.in();

//        Hiển thị ra màn hình khoảng cách từ điểm B đến tâm O.
        System.out.println("Khoang cach tu diem B den tam O la:");
        System.out.format("%.3f\n", B.khoangCach());

//        Hiển thị ra màn hình khoảng cách từ điểm A đến điểm B.
        System.out.println("Khoang cach tu diem A den diem B la:");
        System.out.format("%.3f\n", B.khoangCach(A));
    }
}
