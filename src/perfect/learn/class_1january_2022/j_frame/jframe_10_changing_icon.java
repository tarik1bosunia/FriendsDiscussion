package perfect.learn.class_1january_2022.j_frame;

import javax.swing.*;

class FrameDemo extends JFrame{
    private ImageIcon icon ;

    FrameDemo(){

        initComponents();
    }

    private void initComponents(){
        icon = new ImageIcon(getClass().getResource("/images/ssss.jpg"));
        this.setIconImage(icon.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,1000,800);
        setTitle("TATA");
        setVisible(true);


    }
}

public class jframe_10_changing_icon  {



    public static void main(String[] args) {
        FrameDemo frame = new FrameDemo();



    }

}
