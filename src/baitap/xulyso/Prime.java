package baitap.xulyso;

import elsectu.MyUtil;

import java.util.ArrayList;

public class Prime {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhập n: ");
        n = MyUtil.scanner.nextInt();

        System.out.println("Các số nguyên tố nhỏ hơn n là");

        primeNumbers(n).forEach(System.out::println);
    }

//    hàm kiểm tra một số có là số nguyên tố hay
    public static boolean isPrime(int n){
        int i;
        for (i = 2; i <= Math.sqrt(n); i ++)
            if (n % 2 == 0)
                break;

        return i > Math.sqrt(n);
    }

//    hàm trả về mảng các số nguyên
    public static ArrayList<Integer> primeNumbers(int n){
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int i = 1; i < n; i ++)
            if (isPrime(i))
                primes.add(i);

        return primes;
    }
}
