public class Cb2007210 {
    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

//    TODO: testCases

    public static void testCase1(){
        ColorPoint A;

        A = new ColorPoint(5, 10, "trắng");
        A.print();
    }

    public static void testCase2(){
        ColorPoint B;

        B = new ColorPoint();

        B.read();
        B.move(10, 8);

        B.print();
    }

    public static void testCase3(){
        ColorPoint C, D;

        C = new ColorPoint(6, 3, "đen");
        D = new ColorPoint(C);

        D.print();
        D.setColor("vàng");

        D.print();
        C.print();
    }
}
