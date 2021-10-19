package buoi4;

public class Bo extends ConVat {

    @Override
    public void Keu() {
        System.out.println("Đây là tiếng bò :>");
    }

    @Override
    public void in() {
        System.out.println("Tôi là bò");
        System.out.print(super.toString());
    }
}
