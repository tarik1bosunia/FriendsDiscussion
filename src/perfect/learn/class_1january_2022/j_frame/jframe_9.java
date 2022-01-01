package perfect.learn.class_1january_2022.j_frame;


import javax.swing.*;
import java.awt.*;

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






class Tata extends JFrame {
    Container container = new Container();


    void func1(){
       // container.setBounds(0,0,1500,1000);


        setBounds(100,100,1000,800);
        setTitle("TATA");
        setVisible(true);
        setContentPane(container);
        setBackground(Color.GREEN);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Tata tata = new Tata();
        tata.func1();
    }
}
