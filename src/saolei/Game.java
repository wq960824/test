package saolei;

import javax.swing.*;
import java.awt.*;

public class Game {
    public static void main(String args[]) {
        JFrame w = new JFrame();
        GamePanel mainPanel = new GamePanel(40, 50);
        // ��ȡJFrameӦ�����õĿ�Ⱥ͸߶�
        int[] a = mainPanel.returnSize();
        // ����JFame��͸�
        w.setSize(a[0], a[1]);
        // ����
        w.setTitle("ɨ��");
        //����ر�������˳�
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = w.getContentPane();
        c.add(mainPanel);
        w.setVisible(true);

    }
}
