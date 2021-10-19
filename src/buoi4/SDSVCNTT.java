package buoi4;

import java.util.Scanner;

public class SDSVCNTT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên");
        int n = scanner.nextInt();

        SinhVienCNTT[] sinhVienCNTTs = new SinhVienCNTT[n];
        for (int i = 0; i < n; i++) {
            System.out.format("Nhập sinh viên thứ %d:\n", i + 1);
            sinhVienCNTTs[i] = new SinhVienCNTT();
            sinhVienCNTTs[i].nhap();
        }

        System.out.println("Nhập địa chỉ email");
        scanner.nextLine();
        String email = scanner.nextLine();

        for (SinhVienCNTT sinhVienCNTT : sinhVienCNTTs) {
            if (sinhVienCNTT.getEmail().equals(email)) {
                System.out.println(sinhVienCNTT.toString());
                System.out.format("Điểm trung bình: %.2f", sinhVienCNTT.diemTrungBinh());
            }
        }
    }
}
