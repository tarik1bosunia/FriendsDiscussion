package perfect.learn.class_1january_2022.j_frame;

import javax.swing.*;

public class jframe_8 extends JFrame {
    public static void main(String[] args) {
        jframe_8 frame = new jframe_8();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1000,800);
        frame.setLocation(100,100);
    }
}
