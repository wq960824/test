package saolei;

import javax.swing.*;
import java.awt.*;

public class Game {
    public static void main(String args[]) {
        JFrame w = new JFrame();
        GamePanel mainPanel = new GamePanel(40, 50);
        // 获取JFrame应给设置的宽度和高度
        int[] a = mainPanel.returnSize();
        // 设置JFame宽和高
        w.setSize(a[0], a[1]);
        // 标题
        w.setTitle("扫雷");
        //窗体关闭则程序退出
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = w.getContentPane();
        c.add(mainPanel);
        w.setVisible(true);

    }
}
