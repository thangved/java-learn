package baitap.xulyso;

import java.util.ArrayList;

public class Divisor {
    public static ArrayList<Integer> divisor(int n){
        ArrayList<Integer> members = new ArrayList<Integer>();

        for (int i = 1; i <= n /2; i ++)
            if (n % i == 0)
                members.add(i);

        return members;
    }
}
