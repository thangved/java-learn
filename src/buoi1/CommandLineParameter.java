package buoi1;

public class CommandLineParameter {
    public static void main(String[] args) {
        double max = Double.MIN_VALUE;
        double sum = 0;
        for (String e: args){
            double temp = stringToNumber(e);
            max = Math.max(temp, max);
            sum += temp;
        }
        System.out.format("Sum: %.3f, Max: %.3f\n", sum, max);
    }
    public static double stringToNumber(String s){
        try {
            return Double.parseDouble(s);
        }
        catch (Exception e){
            return 0f;
        }
    }
}
