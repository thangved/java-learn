package elsectu;

import java.util.ArrayList;

public class LineSegmentTest {
    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }

    public static void testCase1(){
        Point A, B;
        LineSegment AB;

        A = new Point(2, 5);
        B = new Point(20, 35);

        AB = new LineSegment(A, B);

        AB.move(32, 13);

        AB.print();
    }

    public static void testCase2(){
        LineSegment CD;
        CD = new LineSegment();

        System.out.format("|CD|= %.2f", CD.length());
    }

    public static void testCase3(){
        ArrayList<LineSegment> list;

        int n = MyUtil.scanner.nextInt();
        list = new ArrayList<>();

        for (int i = 0; i < n; i ++)
            list.add(
                    new LineSegment(MyUtil.scanner.nextInt(),
                            MyUtil.scanner.nextInt(),
                            MyUtil.scanner.nextInt(),
                            MyUtil.scanner.nextInt()));

        sortLineList(list);
        printLineList(list);
    }

    public static void printLineList(ArrayList<LineSegment> list){
        list.forEach(LineSegment::print);
    }

    public static void sortLineList(ArrayList<LineSegment> list){
        for (int i = 0; i < list.size(); i ++)
            for (int j = i; j < list.size(); j ++)
                if (list.get(i).length()>list.get(j).length())
                    swap(list, i, j);
    }

    public static void swap(ArrayList<LineSegment> list, int i, int j){
        LineSegment temp = new LineSegment(list.get(i));
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
