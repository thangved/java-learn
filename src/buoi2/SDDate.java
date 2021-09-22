package buoi2;

import java.util.Scanner;

public class SDDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A");
        Date A = new Date();
        A.in();

        System.out.println("B");
        Date B = new Date(29, 10, 2002);
        B.in();

        System.out.println("C");
        Date C = new Date();
        C.nhap();

        System.out.println("Kiem tra ngay hop le");
        System.out.println("Nhap ngay");
        int ngay = scanner.nextInt();
        System.out.println("Nhap thang");
        int thang = scanner.nextInt();
        System.out.println("Nhap nam");
        int nam = scanner.nextInt();

        Date D = new Date(ngay, thang, nam);
        D.in();
        if(!D.hopLe())
            System.out.println("Ngay khong hop le");
        else
            System.out.println("Ngay hop le");

        System.out.println("Ngay hom sau cua C la");
        C.ngayHomSau().in();

        System.out.println("Cong them n ngay");
        System.out.println("Nhap vao so ngay muon cong");
        int n = scanner.nextInt();
        System.out.println("C sau khi cong them " + n +" Ngay la");
        C.congNgay(n).in();
    }
}
