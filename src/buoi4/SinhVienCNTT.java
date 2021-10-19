package buoi4;

import buoi2.Date;
import buoi3.SinhVien;

import java.util.Scanner;


public class SinhVienCNTT extends SinhVien {
    private String taikhoan;
    private String matkhau;
    private String email;

    public SinhVienCNTT() {
        super();
        taikhoan = "B0000000";
        matkhau = "########";
        email = "example@domain.com";
    }

    public SinhVienCNTT(
            String mssv,
            String hoten,
            Date ngaysinh,
            String taikhoan,
            String matkhau,
            String email,
            int soluonghocphan,
            String[] hocphan,
            String[] diem) {
        super(mssv, hoten, ngaysinh, soluonghocphan, hocphan, diem);
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.email = email;
    }

    public void doiMatKhau(String matkhaumoi) {
        matkhau = matkhaumoi;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        String string = super.toString();
        string += String.format("Tài khoản: %s\n", taikhoan);
        string += String.format("Email: %s\n", email);
        return string;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tài khoản elcit");
        taikhoan = scanner.nextLine();
        System.out.println("Nhập địa chỉ email");
        email = scanner.nextLine();
    }
}
