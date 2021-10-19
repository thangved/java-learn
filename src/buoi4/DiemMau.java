package buoi4;

import buoi2.Diem;

import java.util.Scanner;

public class DiemMau extends Diem {
    private String mau;

    public DiemMau() {
        super();
        mau = "Trắng";
    }

    public DiemMau(int x, int y, String mau) {
        super(x, y);
        this.mau = mau;
    }

    public void GanMau(String mau) {
        this.mau = mau;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập màu");
        mau = scanner.nextLine();
    }

    @Override
    public void in() {
        super.in();
        System.out.format("Màu: %s\n", mau);
    }
}