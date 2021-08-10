package elsectu;

public class Point {
    private int x, y;

//    ham khoi tao
    public Point(){
        setX(0);
        setY(1);
    }

    public Point(int x, int y){
        setX(x);
        setY(y);
    }

//    method
    public void read(){
        setX(MyUtil.scanner.nextInt());
        setY(MyUtil.scanner.nextInt());
    }
    public void print(){
        System.out.format("(%d, %d)", getX(), getY());
    }

    public void move(int x, int y){
        setX(getX() + x);
        setY(getY() + y);
    }

    public double distance(){
        return Math.sqrt(Math.pow(getX(), 2)
                + Math.pow(getY(), 2));
    }

    public double distance(Point P){
        return Math.sqrt(Math.pow(getX() - P.getX(), 2)
                + Math.pow(getY() - P.getY(), 2));
    }

//    setter & getter

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
