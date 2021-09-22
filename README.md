# java-learn

```java
import cit.ctu.Diem;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        Date date = new Date(29, 10, 2002);

        date.nhap();
        date.congNgay();
        date.hienThi();

        JFrame jFrame = new JFrame();

        jFrame.setSize(450, 500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        JPanel jPanel = new JPanel();
        
        jFrame.add(jPanel);
=======
        Diem diem = new Diem(1, 2);
        diem.hienThi();
        
        diem.doiDiem(1, 2);
        diem.hienThi();
        
        diem.nhapDiem();
        diem.hienThi();
        
        System.out.print("Khoảng cách đến O là: " + diem.khoangCach());
        System.out.print("Khoảng cách đến (1, 1) là: " + diem.khoangCach(new Diem(1, 1)));
>>>>>>> 1ddc81aaeb10288ab1b16ce881564bbba2344e25
    }
}
```