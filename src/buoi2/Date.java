package buoi2;

import java.util.Scanner;

public class Date {
    private int ngay, thang, nam;

    public Date() {
        ngay = 1;
        thang = 1;
        nam = 2001;
    }

    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public Date(Date date) {
        ngay = date.ngay;
        thang = date.thang;
        nam = date.nam;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        ngay = scanner.nextInt();
        thang = scanner.nextInt();
        nam = scanner.nextInt();
    }

    @Override
    public String toString() {
        String string = "";
        string += ngay + "/" + thang + "/" + nam;
        return string;
    }
}
