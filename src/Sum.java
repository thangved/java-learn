import java.util.Scanner;

public class Sum {
    public int nhap() {
        Scanner sc = new Scanner(System.in);
        String s;
        int n;
        do {
            s = sc.nextLine();
            try {
                n = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                n = Integer.MAX_VALUE;
                System.out.print("Nhap sai,Nhap lai");
            }
        } while (n == Integer.MAX_VALUE);
        return n;
    }

    public static void main(String[] args) {
        Sum t = new Sum();
        int a = t.nhap();
        int b = t.nhap();
        System.out.print("Tong: " + (a + b));
    }
}