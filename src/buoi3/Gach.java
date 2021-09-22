package buoi3;

import java.util.Scanner;

public class Gach {
    private String maSo,
            mau;
    private int soLuong,
            chieuDai,
            chieuNgang;
    private long giaBan;

    public Gach() {
        maSo = "";
        mau = "Trang";
        soLuong = 0;
        chieuDai = 0;
        chieuNgang = 0;
        giaBan = 0;
    }

    public Gach(String maSo, String mau, int soLuong, int chieuDai, int chieuNgang, long giaBan) {
        this.maSo = maSo;
        this.mau = mau;
        this.soLuong = soLuong;
        this.chieuDai = chieuDai;
        this.chieuNgang = chieuNgang;
        this.giaBan = giaBan;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        maSo = scanner.nextLine();
        mau = scanner.nextLine();
        soLuong = scanner.nextInt();
        chieuDai = scanner.nextInt();
        chieuNgang = scanner.nextInt();
        giaBan = scanner.nextLong();
    }

    public void in() {
        System.out.println("Ma so: " + maSo);
        System.out.println("Mau: " + mau);
        System.out.println("So luong moi hop: " + soLuong);
    }

    public float giaBanLe() {
        return 1.2f * giaBan / soLuong;
    }

    public int soLuongHop(int D, int N) {
        return Math.max(D / (soLuong * chieuDai), N / (soLuong * chieuNgang));
    }

}
