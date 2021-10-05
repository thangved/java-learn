package buoi3;

import java.util.ArrayList;
import java.util.Scanner;

public class SDSinhVien {
    public static void main(String[] args) {
        SinhVien a = new SinhVien();
        a.nhap();
        a.dangKy("LTHDT");
        System.out.println(a.toString());

        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> DSSinhVien = new ArrayList<SinhVien>();
        System.out.println("Nhap so luong sinh vien");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
            SinhVien sinhVien = new SinhVien();
            sinhVien.nhap();
            DSSinhVien.add(sinhVien);
        }

        canhBaoHocVu(DSSinhVien);

        System.out.println("Sinh vien co diem trung binh cao nhat:");
        System.out.println(diemCaoNhat(DSSinhVien).toString());

        sapXep(DSSinhVien);
        System.out.println("Danh sach sinh vien sau khi sap xep:");
        DSSinhVien.forEach(sinhVien -> {
            System.out.println(sinhVien.toString());
        });

    }

    public static void sapXep(ArrayList<SinhVien> DSSinhVien) {
        for (int i = 0; i < DSSinhVien.size(); i++)
            for (int j = i + 1; j < DSSinhVien.size(); j++)
                if (DSSinhVien.get(i).layTen() > DSSinhVien.get(j).layTen()) {
                    SinhVien temp = DSSinhVien.get(i);
                    DSSinhVien.set(i, DSSinhVien.get(j));
                    DSSinhVien.set(j, temp);
                }
    }

    public static void canhBaoHocVu(ArrayList<SinhVien> DSSinhVien) {
        System.out.println("Danh sach sinh vien bi canh bao hoc vu:");
        DSSinhVien.forEach(sinhVien -> {
            if (sinhVien.diemTrungBinh() < 1)
                System.out.println(sinhVien.toString() + "Diem Trung binh: " + sinhVien.diemTrungBinh());
        });
    }

    public static SinhVien diemCaoNhat(ArrayList<SinhVien> DSSinhVien) {
        SinhVien max = new SinhVien();

        for (int i = 0; i < DSSinhVien.size(); i++)
            if (DSSinhVien.get(i).diemTrungBinh() >= max.diemTrungBinh())
                max = DSSinhVien.get(i);

        return max;
    }
}
