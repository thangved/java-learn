package elsectu;

public class CLA {
    public static void main(String[] args) {
        double max = -1000,
                sum = 0;
        for (String s: args){
            max = Math.max(max, toDouble(s));
            sum += toDouble(s);
        }
        System.out.println(max + " " + sum);
    }
    public static double toDouble(String s){
        try {
            return Double.parseDouble(s);
        }
        catch (NumberFormatException e){
            return 0;
        }
    }
}
