package cit.ctu;

public class Diem {
    private int x, y;

//    TODO: normal method
    public void nhapDiem(){
        int x, y;
        System.out.print("Nhập điểm x: ");
        x = MyUtil.scanner.nextInt();

        System.out.print("Nhập điểm y: ");
        y = MyUtil.scanner.nextInt();

        setX(x);
        setY(y);
    }

    public void hienThi(){
        System.out.format("(%d, %d)\n", getX(), getY());
    }

    public void doiDiem(int x, int y){
        setX(getX() + x);
        setY(getY() + y);
    }

    public int giaTriX(){
        return getX();
    }

    public int giaTriY(){
        return getY();
    }

//    khoang cach
//    #noParam
    public float khoangCach(){
        return (float) Math.sqrt(Math.pow(getX(), 2)+ Math.pow(getY(), 2));
    }

//    #params: Diem d

    public float khoangCach(Diem d){
        return (float) Math.sqrt(Math.pow(getX() - d.getX(), 2) + Math.pow(getY() - d.getY(), 2));
    }

//    TODO: create method
//    #noParam
    public Diem(){
        this.x = 0;
        this.y = 0;
    }

//    #params: x, y
    public Diem(int x, int y){
        setX(x);
        setY(y);
    }

//    TODO: setter and getter
    private void setX(int x) {
        this.x = x;
    }

    private void setY(int y) {
        this.y = y;
    }

    private int getX() {
        return x;
    }

    private int getY() {
        return y;
    }
}
