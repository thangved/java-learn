package buoi1;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Bai7 bai7 = new Bai7();
        Scanner scanner = new Scanner(System.in);
        String hoTen;

        System.out.println("Nhap ho ten cua ban");
        hoTen = scanner.nextLine();
        System.out.println("Ten cua ban la: " + bai7.tachTen(hoTen));
    }

    public String tachTen(String hoTen){
        hoTen = hoTen.trim();

        return hoTen.split(" ")[hoTen.split(" ").length - 1];
    }
}
