package buoi4;

public class Heo extends ConVat {
    @Override
    public void Keu() {
        System.out.println("Ut Ut.");
    }

    @Override
    public void in(){
        System.out.println("Tôi là heo");
        System.out.print(super.toString());
    }
}
