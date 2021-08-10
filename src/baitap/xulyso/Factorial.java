package baitap.xulyso;

import elsectu.MyUtil;

public class Factorial {
    public static void main(String[] args) {
        int n;

        System.out.print("Nhập số cần tính:");

        n = MyUtil.scanner.nextInt();

        System.out.println("Giai thừa của " + n + " là: " + factorial(n));
    }

//    hàm tính giai tố
    public static int factorial(int n){
        return n == 0 ? 1 : n * factorial(n-1);
    }
}
