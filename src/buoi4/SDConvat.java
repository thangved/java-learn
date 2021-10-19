package buoi4;

import java.util.Scanner;

public class SDConvat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng con vật");
        int n = scanner.nextInt();
        ConVat[] conVats = new ConVat[n];
        for (int i = 0; i < n; i++) {
            System.out.format("Bạn muốn nhập con gì?\n1. Bò\n2. Dê\n3. Heo\n");
            switch (scanner.nextInt()) {
                case 1:
                    conVats[i] = new Bo();
                    break;
                case 2:
                    conVats[i] = new De();
                    break;
                default:
                    conVats[i] = new Heo();
            }
            conVats[i].nhap();
        }
        for (ConVat conVat : conVats) {
            conVat.Keu();
        }

    }
}
