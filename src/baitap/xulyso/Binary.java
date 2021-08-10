package baitap.xulyso;

import elsectu.MyUtil;

public class Binary {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhập số cần chuyển: ");
        n = MyUtil.scanner.nextInt();

        System.out.print(n + "_10 = " + binary(n) + "_2.");
    }

    public static String binary(int n){
//        convert 10 to
        return Integer.toBinaryString(n);
    }
}
