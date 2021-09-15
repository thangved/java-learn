package cit.ctu;

public class Equation {
    public static void main(String[] args) {
        Equation equation = new Equation();

        equation.quadratic();
    }

    public void quadratic(){
        double a;
        double b;
        double c;

//        Nhập a, b, c
        System.out.println("Giải phương trình bậc 2:");

        System.out.print("Nhập a: ");
        a = MyUtil.scanner.nextDouble();

        System.out.print("Nhập b: ");
        b = MyUtil.scanner.nextDouble();

        System.out.print("Nhập c: ");
        c = MyUtil.scanner.nextDouble();

        final double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0){
            double x1, x2;

            x1 = (- b - Math.sqrt(delta))/(2 * a);
            x2 = (- b + Math.sqrt(delta))/(2 * a);

            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if (delta == 0){
            double x = - b / (2 * a);

            System.out.println("Phương trình có nghiệm kép:");

            System.out.println("x = " + x);
        }
        else {
            System.out.println("Phương trình vô nghiệm.");
        }

    }
}
