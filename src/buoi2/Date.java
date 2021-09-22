package buoi2;

import java.util.Scanner;

public class Date {
    private int ngay, thang, nam;

    public Date() {
<<<<<<< HEAD
        ngay = 1;
        thang = 1;
        nam = 2001;
=======
        ngay = 11;
        thang = 11;
        nam = 2002;
>>>>>>> 0b21f16114808059e160fcf6f27b12546ee4d18c
    }

    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

<<<<<<< HEAD
    public Date(Date date) {
        ngay = date.ngay;
        thang = date.thang;
        nam = date.nam;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        ngay = scanner.nextInt();
        thang = scanner.nextInt();
        nam = scanner.nextInt();
        scanner.close();
=======
    public void in() {
        System.out.format("%02d/ %02d/ %04d\n", ngay, thang, nam);
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        int ngay, thang, nam;
        do {
            System.out.println("Nhap ngay");
            ngay = scanner.nextInt();
            System.out.println("Nhap thang");
            thang = scanner.nextInt();
            System.out.println("Nhap nam");
            nam = scanner.nextInt();

            date = new Date(ngay, thang, nam);
            if(!date.hopLe())
                System.out.println("Ngay khong hop le, nhap lai!");
        } while (!date.hopLe());

        this.ngay = date.ngay;
        this.thang = date.thang;
        this.nam = date.nam;
    }

    public boolean hopLe() {
        if (ngay <= 0)
            return false;
        int[] namNhuan = {1, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] namKhongNhuan = {1, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((nam % 4 == 0 && nam % 10 != 0) || nam % 400 == 0) {
            return ngay <= namNhuan[thang];
        }

        return ngay <= namKhongNhuan[thang];
    }

    Date ngayHomSau() {
        int[] leap = {1, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] notLeap = {1, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] year;

        if ((nam % 4 == 0 && nam % 10 != 0) || nam % 400 == 0) {
            year = leap;
        } else {
            year = notLeap;
        }
        if (ngay > year[thang]) {
            if (thang == 12) {
                return new Date(1, 1, nam + 1);
            } else {
                return new Date(1, thang + 1, nam);
            }
        } else {
            return new Date(ngay + 1, thang, nam);
        }
    }
    Date congNgay(int n){
        Date date = new Date(ngay, thang, nam);
        for (int i = 0; i < n; i ++)
            date = date.ngayHomSau();
        return date;
>>>>>>> 0b21f16114808059e160fcf6f27b12546ee4d18c
    }
}
