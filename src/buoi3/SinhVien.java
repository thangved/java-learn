package buoi3;

import buoi2.Date;

import java.util.Scanner;

public class SinhVien {
    private final int hpToiDa = 100;
    private String MSSV;
    private String hoTen;
    private final Date ngaySinh;
    private int soLuongHocPhan;
    private String[] hocPhan;
    private String[] diem;

    public SinhVien() {
        MSSV = "";
        hoTen = "";
        ngaySinh = new Date();
        soLuongHocPhan = 0;
        hocPhan = new String[hpToiDa];
        diem = new String[hpToiDa];
    }

    public SinhVien(
            String MSSV,
            String hoTen,
            Date ngaySinh,
            int soLuongHocPhan,
            String[] hocPhan,
            String[] diem) {

        this.MSSV = MSSV;
        this.hoTen = hoTen;
        this.ngaySinh = new Date(ngaySinh);

        this.soLuongHocPhan = soLuongHocPhan;

        this.hocPhan = new String[hpToiDa];
        this.diem = new String[hpToiDa];

        for (String hp : hocPhan) {
            assert false;
            this.hocPhan[this.hocPhan.length] = hp;
        }

        for (String d : diem) {
            assert false;
            this.diem[this.diem.length] = d;
        }

        soLuongHocPhan = hocPhan.length;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma so sinh vien");
        MSSV = scanner.nextLine();
        System.out.println("Nhap ho ten sinh vien");
        hoTen = scanner.nextLine();
        System.out.println("Nhap ngay, thang, nam sinh");
        ngaySinh.nhap();
    }

    public void nhapDiem() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < soLuongHocPhan; i++) {
            System.out.println(hocPhan[i] + "\n");
            diem[i] = scanner.nextLine();
        }
    }

    public float diemTrungBinh() {
        if (soLuongHocPhan == 0)
            return 0;
        float diem = 0;
        for (String d : this.diem)
            diem += diemSo(d);

        return diem / soLuongHocPhan;
    }

    private float diemSo(String diemChu) {
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
        if (soLuongHocPhan == hpToiDa)
            return;

        hocPhan[soLuongHocPhan] = tenHocPhan;
        soLuongHocPhan++;
    }

    public void xoaHocPhan(String tenHocPhan) {
        for (int i = 0; i < soLuongHocPhan; i++)
            if (tenHocPhan.equals(hocPhan[i])) {
                xoaTai(i);
                i--;
            }
    }

    public char layTen() {
        String[] hoTen = this.hoTen.split(" ");
        return hoTen[hoTen.length - 1].charAt(0);
    }

    private void xoaTai(int i) {
        for (; i < soLuongHocPhan - 1; i++)
            hocPhan[i] = hocPhan[i + 1];

        soLuongHocPhan--;
    }

    @Override
    public String toString() {
        return "MSSV: " + MSSV + "\n" + "Ho ten: " + hoTen + "\n" + "Ngay sinh: " + ngaySinh.toString() + "\n";
    }
}
