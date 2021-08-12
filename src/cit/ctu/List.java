package cit.ctu;

import java.util.ArrayList;
import java.util.Collection;

public class List {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public static void main(String[] args) {
        List list = new List();

        list.read();

        System.out.println("Nhập phần tử cần kiểm tra.");

        int n = MyUtil.scanner.nextInt();

        System.out.println("Số phần tử"+ n + "trong mảng là: " +list.count(n));

        list.sort();
        list.print();
    }

    public void read(){
        int n;
        System.out.println("Nhập vào số lượng phần tử");

        n = MyUtil.scanner.nextInt();

        for (int i = 0; i < n; i ++){
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            arrayList.add(MyUtil.scanner.nextInt());
        }
    }

    public void print(){
        arrayList.forEach(System.out::println);
    }

    public int count(int x){
        return (int) arrayList.stream().filter(item -> item == x).count();
    }

    public void sort(){
        for (int i = 0; i < arrayList.size(); i ++)
            for (int j = i; j < arrayList.size(); j ++)
                if (arrayList.get(j)<arrayList.get(i)){
//                    TODO: swap
                    arrayList.set(i, arrayList.get(i) + arrayList.get(j));
                    arrayList.set(j, arrayList.get(i) - arrayList.get(j));
                    arrayList.set(i, arrayList.get(i) - arrayList.get(j));
                }

    }


}
