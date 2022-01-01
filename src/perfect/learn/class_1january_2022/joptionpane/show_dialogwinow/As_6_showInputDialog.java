package com.company.joptionpane.show_dialogwinow;

import javax.swing.*;
class ShowInputDialog{
   public void haHa(){
        String name = JOptionPane.showInputDialog("Enter Your name");
        JOptionPane.showMessageDialog(null,"Welcome " + name);
    }
    public void jaJa(){

       String name = JOptionPane.showInputDialog(null,"Enter Your name","Tarik S");
        JOptionPane.showMessageDialog(null,"Welcome " + name);

    }
    public void naNa(){
       String fName = JOptionPane.showInputDialog(null,"Enter your first name","this is title",JOptionPane.ERROR_MESSAGE);
       String lName = JOptionPane.showInputDialog(null,"Enter your Last name","this is title",JOptionPane.ERROR_MESSAGE);
       JOptionPane.showMessageDialog(null,fName +" " + lName);
    }

}

public class As_6_showInputDialog {
    public static void main(String[] args) {
        ShowInputDialog soma = new ShowInputDialog();
       // soma.haHa();
      //  soma.jaJa();
      //  soma.naNa();
    }
}
