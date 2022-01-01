package com.company.joptionpane.show_dialogwinow;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Show_ConfirmDialog{
    public void confirm(){
      //  JOptionPane.showConfirmDialog(null,"Tarik","Title",JOptionPane.YES_NO_OPTION);
       int choice = JOptionPane.showConfirmDialog(null,"Tarik","Title",JOptionPane.YES_OPTION);
        if (choice == JOptionPane.YES_OPTION){
            System.exit(0);
            System.out.println("Soma");

        }else{
            System.out.println("Shetu");
        }
    }
    public static void main(String[] args) {
        Show_ConfirmDialog soma = new Show_ConfirmDialog();
        soma.confirm();
    }
}




class OptionPaneExample extends WindowAdapter {
    JFrame f;
    OptionPaneExample(){
        f = new JFrame();
        f.addWindowListener(this);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
    }
    public void windowClosing(WindowEvent e) {
        int a=JOptionPane.showConfirmDialog(f,"Are you sure?");
        if(a == JOptionPane.YES_OPTION){
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public static void main(String[] args) {
        new  OptionPaneExample();
    }
}
