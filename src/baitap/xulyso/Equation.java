package baitap.xulyso;

import elsectu.MyUtil;

public class Equation {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Nhập a:");
        a = MyUtil.scanner.nextDouble();

        System.out.println("Nhập b:");
        b = MyUtil.scanner.nextDouble();

        System.out.println("Nhập c:");
        c = MyUtil.scanner.nextDouble();

        double [] tests = resolve(a, b, c);

        System.out.println("Nghiệm của phương trình là:");

        for (double x:tests){
            System.out.println("x= "+x);
        }

        System.out.println("Xong.");

    }

//    hàm giải phương trình bậc 2
//    trả về một mảng các số
    public static double [] resolve(double a, double b, double c){
        double [] tests;

        double delta = Math.pow(b,2) - 4*a*c;
        if(delta>0){
            tests = new double[2];

            tests[0] = (-b - Math.sqrt(delta))/(2*a);
            tests[1] = (-b + Math.sqrt(delta))/(2*a);
        }
        else if (delta==0){
            tests = new double[1];

            tests[0] = -b/(2*a);
        }
        else {
            tests = new double[0];
        }

        return tests;
    }
}
