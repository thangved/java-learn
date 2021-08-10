package baitap.xulyso;

import elsectu.MyUtil;

public class Synthetic {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhập n: ");

        n = MyUtil.scanner.nextInt();

//        tính tổng các chữ số
        System.out.println("Tổng các chữ số: " + Sum.sum(Sum.split(n)));

//        phân tích thành thừa số nguyên tố
        Factor.split(n).forEach(member->{
            System.out.print(member + " ");
        });
        System.out.println();

//        Các ước số của n
        System.out.println("Các ước của n là: ");
        Divisor.divisor(n).forEach(member->{
            System.out.print(member + " ");
        });

//        Các ước số của n là số nguyên tố
      System.out.println("Các ước số của n là số nguyên tố");
      Divisor.divisor(n).forEach(member->{
          if(Prime.isPrime(member))
              System.out.print(member + " ");
      });

//      Các số 5 đến 7 chữ số
        System.out.println("Các số từ 5 đến 7 chữ số:");

        for (int i = 10000; i < 9999999; i ++){
            if(Prime.isPrime(i) && Reversible.isReversible(i) && Prime.isPrime(Sum.sum(Sum.split(n))) && allIsPrime(i))
                System.out.println(i);
        }

  }

  public static boolean allIsPrime(int n){
        boolean check = true;

        for (int i: Sum.split(n)){
            if(!Prime.isPrime(i)){
                check = false;
                break;
            }
        }
        return check;
  }
}
