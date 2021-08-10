package elsectu;

public class Prime {
    public static void main(String[] args) {
        int n = MyUtil.scanner.nextInt();
        if(isPrime(n)){
            System.out.format("%d là số nguyên tố\n", n);
        }
        else {
            System.out.format("%d không là số nguyên tố\n", n);
        }
        System.out.println(Integer.toBinaryString(n));
    }
    public static boolean isPrime(int n){
        double sqrt = Math.sqrt(n);
        int i;
        for (i = 2; i < sqrt; i ++){
            if (sqrt % i == 0)
                break;
        }
        return i > sqrt;
    }
}
