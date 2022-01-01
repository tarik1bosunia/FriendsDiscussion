package perfect.learn.class_1january_2022.j_frame;

import java.awt.*;

public class jframe_11_changing_background_color {
    private static Container c;

    public static void main(String[] args) {

        FrameDemo frame = new FrameDemo();
        c = frame.getContentPane();
        c.setBackground(Color.YELLOW);

    }
}
