package baitap.xulyso;

import elsectu.MyUtil;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhập vị trí: ");
        n = MyUtil.scanner.nextInt();

        printPrimeFibonacci(fibonacci(n));
    }

//    hàm trả về mảng n số trong dãy Fibonacci (ít nhất là 2)
    public static int [] fibonacci(int n){
        if(n<2)
            n = 2;
        int [] f = new int[n+1];

        f[0] = 0;
        f[1] = 1;

        for(int i = 2; i <= n; i ++){
            f[i] = f[i - 2] + f[i - 1];
        }

        return f;
    }
    public static void printPrimeFibonacci(int [] fibonacci){
        for (int i: fibonacci)
            if(Prime.isPrime(i))
                System.out.println(i);
    }
}
