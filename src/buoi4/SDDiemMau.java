package buoi4;

public class SDDiemMau {
    public static void main(String[] args) {
        System.out.println("A");
        DiemMau A = new DiemMau(5, 10, "Trắng");
        A.in();

        System.out.println("B");
        DiemMau B = new DiemMau();
        B.nhap();
        B.doiDiem(10, 8);
        B.in();
        B.GanMau("Vàng");
    }
}
