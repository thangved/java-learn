package buoi1;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.println("Giai phuong trinh bac 1");
        System.out.println("Nhap a va b (ax + b = 0)");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        ptb1(a, b);

        System.out.println("Giai phuong trinh bac 2");
        System.out.println("Nhap vao a, b va c (ax2 + bx + c = 0)");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        ptb2(a, b, c);
    }
//    todo: giai phuong trinh bac 1
    public static void ptb1(double a, double b){
        if(a == 0){
            if(b != 0){
                System.out.println("Phuong trinh vo nghiem.");
            }
            else {
                System.out.println("Phuong trinh co vo so nghiem.");
            }
        }
        else {
            System.out.println("Nghiem cua phuong trinh la x = " + -b/a);
        }
    }
//    todo: giai phuong trinh bac 2
    public static void ptb2(double a, double b, double c){
        if(a == 0){
            ptb1(b, c);
        }
        else {
            double delta = Math.pow(b,2) - 4 * a * c;

            if(delta < 0){
                System.out.println("Phuong trinh vo nghiem.");
            }
            else if (delta == 0){
                System.out.println("Phuong trinh co nghiem kep x = " + -b/(2 * a));
            }
            else {
                double x1 = (-b - Math.sqrt(delta))/(2*a),
                        x2 = (-b + Math.sqrt(delta))/(2*a);

                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
