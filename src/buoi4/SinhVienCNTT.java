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
		setMatkhau("");
		email = "";
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public SinhVienCNTT(String MSSV, String hoTen, Date ngaySinh, String taiKhoan, String matkhau, String email,
			int soLuongHocPhan, String[] hocPhan, String[] diem) {
		super(MSSV, hoTen, ngaySinh, soLuongHocPhan, hocPhan, diem);
		this.taiKhoan = taiKhoan;
		this.setMatkhau(matkhau);
		this.email = email;
	}

	@Override
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		super.nhap();
		taiKhoan = scanner.nextLine();
		setMatkhau(scanner.nextLine());
		email = scanner.nextLine();
		scanner.close();
	}

	public String toString() {
		return (super.toString() + "Tai khoan: " + taiKhoan + "\n" + "Email: " + email + "\n");
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public String getEmail() {
		return email;
	}

	public String getTaiKhoan() {
		return taiKhoan;
	}
}
