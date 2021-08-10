package elsectu;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> list;
        int n, x;
//        so phan tu
        n = scanner.nextInt();

        list = new ArrayList<>();
        readArray(list, n);

//        so can dem
        x = scanner.nextInt();
        System.out.println(count(list, x));

//        in list
        sortList(list);
        printList(list);
    }
    public static void readArray(ArrayList<Integer> list, int n){
        for (int i = 0; i < n; i ++){
            list.add(scanner.nextInt());
        }
    }
    public static int count(ArrayList<Integer> list, int x){
        return list.stream().mapToInt(item -> item == x ? 1 : 0).sum();
    }
    public static void printList(ArrayList<Integer> list){
        list.forEach(item->{
            System.out.print(item + " ");
        });
    }
    public static void sortList(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i ++)
            for (int j = i; j < list.size(); j ++)
                if(list.get(i)>list.get(j))
                    swap(list, i, j);
    }
    public static void swap(ArrayList<Integer> list, int i, int j){
        list.set(i, list.get(i) + list.get(j));
        list.set(j, list.get(i) - list.get(j));
        list.set(i, list.get(i) - list.get(j));
    }
}
