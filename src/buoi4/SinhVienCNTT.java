package buoi4;

import buoi2.Date;
import buoi3.SinhVien;

import java.util.Scanner;

public class SinhVienCNTT extends SinhVien {
    private String taiKhoan;
    private String matkhau;
    private String email;

    public SinhVienCNTT() {
        super();
        taiKhoan = "";
        matkhau = "";
        email = "";
    }

    public SinhVienCNTT(String MSSV,
                        String hoTen,
                        Date ngaySinh,
                        String taiKhoan,
                        String matkhau,
                        String email,
                        int soLuongHocPhan,
                        String[] hocPhan,
                        String[] diem) {
        super(MSSV, hoTen, ngaySinh, soLuongHocPhan, hocPhan, diem);
        this.taiKhoan = taiKhoan;
        this.matkhau = matkhau;
        this.email = email;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        taiKhoan = scanner.nextLine();
        matkhau = scanner.nextLine();
        email = scanner.nextLine();
        scanner.close();
    }

    public String toString() {
        return super.toString() +
                "Tai khoan: " + taiKhoan + "\n" +
                "Email: " + email + "\n";
    }
}
