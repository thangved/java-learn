package buoi4;

import java.util.Scanner;

public class ConVat {
    private String giong;
    private String mauLong;
    private double canNang;

    public ConVat() {
        setGiong("");
        setMauLong("");
        setCanNang(0);
    }

    public ConVat(String giong, String mauLong, double canNang) {
        setGiong(giong);
        setMauLong(mauLong);
        setCanNang(canNang);
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giống");
        setGiong(scanner.nextLine());
        System.out.println("Nhập màu lông");
        setMauLong(scanner.nextLine());
        System.out.println("Nhập cân nặng");
        setCanNang(scanner.nextDouble());
    }

    public void in() {
        System.out.format("Giống: %s\n", giong);
        System.out.format("Màu lông: %s\n", mauLong);
        System.out.format("Cân nặng: %.2f\n", canNang);
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public String getGiong() {
        return giong;
    }

    public void setGiong(String giong) {
        this.giong = giong;
    }

    public void Keu() {
        System.out.println("Tôi là vịt!");
    }

    @Override
    public String toString() {
        String string = "";
        string += String.format("Giống: %s\n", giong);
        string += String.format("Màu lông: %s\n", mauLong);
        string += String.format("Cân nặng: %.2f\n", canNang);
        return string;
    }
}
