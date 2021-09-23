package buoi1;

import java.util.Scanner;

public class Polygon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        ptb2(a, b, c);
        scanner.close();
    }

    public static void ptb1(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            }
            if (b != 0) {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Phuong trinh co nghiem la: " + (-b / a));
        }
    }

    public static void ptb2(double a, double b, double c) {

        // a = 0
        if (a == 0) {
            ptb1(b, c);
            return;
        }

        // vo nghiem
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
            return;
        }

        // nghiem kep
        if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep: " + (-b / (2 * a)));
            return;
        }

        // 2 nghiem
        double sDelta = Math.sqrt(delta);
        double x1 = (-b - sDelta) / (2 * a);
        double x2 = (-b + sDelta) / (2 * a);

        System.out.println("Phuong trinh co 2 nghiem:");
        System.out.format("x1 = %.3f\n", x1);
        System.out.format("x2 = %.3f\n", x2);
    }
}
