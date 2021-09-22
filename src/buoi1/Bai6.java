package buoi1;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Bai6 bai6 = new Bai6();
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Nhap so can kiem tra");
        n = scanner.nextInt();

        if (bai6.isPrime(n)){
            System.out.println(n + " la so nguyen to.");
        }
        else {
            System.out.println(n + " khong phai la so nguyen to.");
        }
        System.out.println("Dang nhi phan cua " + n + " la " + bai6.dec2Bin(n) + ".");
    }
    public boolean isPrime(int n){
        if(n <= 2)
            return false;

        for(int i = 2; i <= Math.sqrt(n); i ++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
    public String dec2Bin(int n){
        return Integer.toBinaryString(n);
    }
}
