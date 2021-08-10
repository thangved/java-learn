package baitap.xulyso;

import elsectu.MyUtil;

public class Common {
    public static void main(String[] args) {
        int a, b;

        System.out.print("Nhập a: ");
        a = MyUtil.scanner.nextInt();

        System.out.print("Nhập b: ");
        b = MyUtil.scanner.nextInt();

        System.out.println("Bội chung  nhất của " + a + " và " + b + " là: " + Multiple(a, b));
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + Divisor(a, b));
    }

//    hàm tính bội chung nhỏ
    public static int Multiple(int a, int b){
//        BCNN = a * b / UCLN
        return a*b/Divisor(a, b);
    }

    public static int Divisor(int a, int b){
        if (a % b == 0)
            return b;
        return Divisor(b, a % b);
    }
}
