package cit.ctu;

public class Name {
    public static void main(String[] args) {
        Name name = new Name();

        String yourName;
        System.out.println("Nhập họ tên: ");
        yourName = MyUtil.scanner.nextLine();

        System.out.println(name.splitName(yourName));

    }

    public String splitName(String name){
        name.trim();
        String [] nameArray = name.split(" ");

        return nameArray[nameArray.length -1];
    }
}
