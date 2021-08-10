package baitap.xulyso;

import elsectu.MyUtil;

public class Reversible {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhập số cần kiểm tra: ");
        n = MyUtil.scanner.nextInt();
        if(isReversible(n))
            System.out.println(n + " là số thuận nghịch.");
        else
            System.out.println(n + " không là số thuận nghịch.");
    }

//    hàm kiểm tra
    public static boolean isReversible(int n){
        return n == reverse(n);
    }

//    hàm đảo ngược số
    public static int reverse(int n){
        int re = 0;
        while (n != 0){
            re = re * 10 + n % 10;
            n /= 10;
        }
        return re;
    }
}
