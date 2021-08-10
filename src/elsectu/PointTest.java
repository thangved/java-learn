package elsectu;

public class PointTest {
    public static void main(String[] args) {
        Point A, B, C, O;

        O = new Point(0, 0);

        A = new Point(3, 4);
        A.print();

        B = new Point();
        B.read();
        B.print();

        C = new Point(- B.getX(), - B.getY());
        C.print();

        System.out.println(B.distance(O));
        System.out.println(B.distance(A));
    }
}
