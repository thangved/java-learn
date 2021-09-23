package buoi4;

public class ConVat {
    private String giong;
    private String mauLong;
    private double canNang;

    public ConVat() {
        setGiong("");
        setMauLong("");
        setCanNang(0);
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public String getGiong() {
        return giong;
    }

    public void setGiong(String giong) {
        this.giong = giong;
    }

    public ConVat(String giong, String mauLong, double canNang) {
        this.setGiong(giong);
        this.setMauLong(mauLong);
        this.setCanNang(canNang);
    }

    public void Keu() {
        System.out.println("Quack Quack!");
    }
}
