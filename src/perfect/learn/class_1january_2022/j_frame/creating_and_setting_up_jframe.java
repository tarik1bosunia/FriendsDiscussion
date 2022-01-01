package perfect.learn.class_1january_2022.j_frame;


import javax.swing.*;

public class creating_and_setting_up_jframe {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
       // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setLocation(300,100);
     //   frame.setLocationRelativeTo(null);


        //combind of location and size
       // frame.setBounds(100,200,1000,800);

        //frame.setTitle("TITLE");
        //frame.setResizable(false);
    }
}
