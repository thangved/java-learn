package baitap.xulyso;

import elsectu.MyUtil;

public class Sum {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhập số cần tính tổng: ");
        n = MyUtil.scanner.nextInt();

        System.out.print(sum(split(n)));
    }

//    hàm phân tích một số thành các chữ số
//    trả về một mảng
    public static int [] split(int number){
        int n = (int) (Math.log(number)/Math.log(10)) + 1;

        int [] factors = new int[n];
        for (int i = 0; i < n; i ++){
            factors[i] = number % 10;
            number /= 10;
        }

        return factors;
    }

//    hàm tính tổng của
    public static int sum(int [] array){
        int s = 0;

        for (int i: array)
            s += i;
        return s;
    }

}
