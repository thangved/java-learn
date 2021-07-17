public class TachTen {
    public static void main(String[] args) {
        String hoTen = MyUtil.scanner.nextLine();
        System.out.println(layTen(hoTen));
    }
    public static String layTen(String hoTen){
        hoTen = hoTen.trim();
        return (hoTen.substring(hoTen.lastIndexOf(' ') + 1));
    }
}
