package baitap.xulyso;

import elsectu.MyUtil;

import java.util.ArrayList;

public class Factor {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhập số cần tách thừa số: ");

        n = MyUtil.scanner.nextInt();

        ArrayList<Integer> factors = split(n);

        for (int i = 0; i < factors.size(); i ++){
            System.out.print(factors.get(i));
            if (i != factors.size() - 1)
                System.out.print(" x ");
        }

    }

//    hàm tách thừa thừa
    public static ArrayList<Integer> split(int n){
        ArrayList<Integer> factors = new ArrayList<Integer>();

        int i = 2;

        while (n != 1){
            if (n % i == 0){
                n /= i;
                factors.add(i);
            }
            else
                i ++;
        }

        return factors;
    }
}
