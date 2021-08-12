# java-learn

```java
import cit.ctu.Diem;

public class Main {
    public static void main(String[] args) {
        Diem diem = new Diem(1, 2);
        diem.hienThi();
        
        diem.doiDiem(1, 2);
        diem.hienThi();
        
        diem.nhapDiem();
        diem.hienThi();
        
        System.out.print("Khoảng cách đến O là: " + diem.khoangCach());
        System.out.print("Khoảng cách đến (1, 1) là: " + diem.khoangCach(new Diem(1, 1)));
    }
}
```