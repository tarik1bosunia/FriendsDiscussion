package perfect.learn.class_1january_2022.j_frame;

import javax.swing.*;

public class jframe_9 extends JFrame {
    jframe_9(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,1000,800);
        setTitle("TATA");
        setVisible(true);
    }

    public static void main(String[] args) {
        jframe_9 frame = new jframe_9();
        frame.setVisible(true);
    }
}
