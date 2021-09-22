package buoi4;

import buoi2.Diem;
import java.util.Scanner;

public class DiemMau extends Diem {

    private String mau;

    public DiemMau() {
        super();
        mau = "";
    }

    public DiemMau(int x, int y, String mau) {
        super(x, y);
        this.mau = new String(mau);
    }

    public void ganMau(String mau) {
        this.mau = new String(mau);
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        mau = scanner.nextLine();
        scanner.close();
    }

    public void in() {
        super.in();
        System.out.println(mau);
    }
}
