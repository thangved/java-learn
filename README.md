# java-learn

```java
import baitap.date.Date;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
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
    }
}
```