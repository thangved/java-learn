public class LineSegment {
    private Point d1, d2;

    public LineSegment(){
        setD1(new Point(2, 9));
        setD2(new Point(1, 9));
    }

    public LineSegment(Point d1, Point d2){
        setD1(d1);
        setD2(d2);
    }

    public LineSegment(int x1, int y1, int x2, int y2){
        setD1(new Point(x1, y1));
        setD2(new Point(x2, y2));
    }

    public LineSegment(LineSegment S){
        setD1(S.getD1());
        setD2(S.getD2());
    }

//    TODO: method

    public void read(){
        setD1(new Point(MyUtil.scanner.nextInt(), MyUtil.scanner.nextInt()));
        setD2(new Point(MyUtil.scanner.nextInt(), MyUtil.scanner.nextInt()));
    }

    public void print(){
        System.out.print("[");
        getD1().print();
        System.out.print("; ");
        getD2().print();
        System.out.print("]");
    }

    public void move(int x, int y){
        getD1().move(x , y);
        getD2().move(x, y);

    }

    public double length(){
        return getD2().distance(getD1());
    }

    public int angle(){
        return (int) Math.atan2(getD1().distance(), getD2().distance());
    }

//    TODO: setter & getter


    public void setD1(Point d1) {
        this.d1 = d1;
    }

    public void setD2(Point d2) {
        this.d2 = d2;
    }

    public Point getD1() {
        return d1;
    }

    public Point getD2() {
        return d2;
    }
}
