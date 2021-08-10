package elsectu;

public class ColorPoint extends Point {
    private String color;

//    TODO: ham xay dung
    public ColorPoint(){
        super();
        setColor("vàng");
    }

    public ColorPoint(int x, int y, String color){
        super(x, y);
        setColor(color);
    }

    public ColorPoint(ColorPoint cp){
        setXY(cp.getX(), cp.getY());
        setColor(cp.getColor());
    }

//    TODO: method

    @Override
    public void read() {
        super.read();
        setColor(MyUtil.scanner.nextLine());
    }

    public void print(){
        System.out.format("(%d, %d): %s\n", getX(), getY(), getColor());
    }


//    TODO: setter & getter

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
