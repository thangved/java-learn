package cit.ctu;

public class Prime {
    public static void main(String[] args) {
        Prime prime = new Prime();
        int n;

        System.out.println("Nhập n: ");
        n = MyUtil.scanner.nextInt();

        if (prime.isPrime(n)) {
            System.out.println(n + " là số nguyên tố");
        }
        else {
            System.out.println(n + " không phải là số nguyên tố.");
        }

        System.out.println(prime.to2(n));

    }

    public boolean isPrime(int n){
        int i;

        for (i = 2; i <= Math.sqrt(n); i ++) {
            if (n % i == 0) {
                break;
            }
        }

        return i > Math.sqrt(n);
    }

    public String to2(int n){
        try {
            return Integer.toBinaryString(n);
        }
        catch (NumberFormatException e){
            return "0";
        }
    }
}
