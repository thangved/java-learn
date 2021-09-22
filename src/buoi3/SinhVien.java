package buoi3;

import buoi2.Date;

import java.util.Scanner;

public class SinhVien {
    private String MSSV;
    private String hoTen;
    private Date ngaySinh;
    private int soLuongHocPhan;
    private String[] hocPhan;
    private String[] diem;

    public SinhVien() {
        MSSV = "";
        hoTen = "";
        ngaySinh = new Date();
        soLuongHocPhan = 0;
    }

    public SinhVien(String MSSV, String hoTen, Date ngaySinh, int soLuongHocPhan, String[] hocPhan, String[] diem) {
        this.MSSV = MSSV;
        this.hoTen = hoTen;
        this.ngaySinh = new Date(ngaySinh);
        this.soLuongHocPhan = soLuongHocPhan;
        for (String hp : hocPhan) {
            assert false;
            this.hocPhan[this.hocPhan.length] = new String(hp);
        }
        for (String d : diem) {
            assert false;
            this.diem[this.diem.length] = new String(d);
        }
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        MSSV = scanner.nextLine();
        hoTen = scanner.nextLine();
        ngaySinh.nhap();
        scanner.close();
    }

    public void nhapDiem() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < soLuongHocPhan; i++) {
            System.out.println(hocPhan[i] + "\n");
            diem[i] = scanner.nextLine();
        }
        scanner.close();
    }

    public float diemTrungBinh() {
        float diem = 0;
        for (String d : this.diem)
            diem += doiDiem(d);

        return diem / soLuongHocPhan;
    }

    public float doiDiem(String diemChu) {
        switch (diemChu) {
            case "A":
                return 4f;
            case "B+":
                return 3.5f;
            case "B":
                return 3f;
            case "C+":
                return 2.5f;
            case "C":
                return 2f;
            case "D+":
                return 1.5f;
            case "D":
                return 1f;
            default:
                return 0f;
        }
    }

    public void dangKy(String tenHocPhan) {
        hocPhan[soLuongHocPhan] = new String(tenHocPhan);
        soLuongHocPhan++;
    }

    @Override
    public String toString() {
        return "MSSV: " + MSSV + "\n" + "Ho ten: " + hoTen + "\n" + "Ngay sinh: " + ngaySinh.toString() + "\n";
    }
}
