package buoi1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai8 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Bai8 bai8 = new Bai8();

        ArrayList<Integer> arrayList = new ArrayList<>();
        int x;

        bai8.readList(arrayList);

        System.out.println("Nhap vao so can dem");
        x = scanner.nextInt();
        System.out.println("So luong phan tu " + x + " trong danh sach tren la " + bai8.count(x, arrayList));

        bai8.sort(arrayList);

        System.out.println("Danh sach sau khi duoc sap xep la");
        arrayList.forEach(item->{
            System.out.print(item + " ");
        });
    }
    public void readList(ArrayList<Integer> arrayList){
        int n;
        System.out.println("Nhap so luong phan tu");
        n = scanner.nextInt();

        for (int i = 0; i < n; i ++)
            arrayList.add(scanner.nextInt());
    }
    public int count(int x, ArrayList<Integer> arrayList){
        int c = 0;
        System.out.println("Nhap vao so can dem");

        for(int i: arrayList){
            if (x == i)
                c ++;
        }
        return c;
    }

    public void sort(ArrayList<Integer> arrayList){
        for(int i = 0; i < arrayList.size(); i ++)
            for (int j = i + 1; j < arrayList.size(); j ++)
                if (arrayList.get(i) > arrayList.get(j)){
                    int temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
    }
}
