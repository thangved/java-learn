package buoi4;

public class De extends ConVat {
    @Override
    public void Keu() {
        System.out.println("Pe Pe");
    }

    @Override
    public void in() {
        System.out.println("Tôi là dê");
        System.out.print(super.toString());
    }
}
