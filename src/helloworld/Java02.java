package helloworld;

import javax.swing.*;

public class Java02 {
    public static void main(String[] args) {
//        String name;
//        String age ;
//       name = JOptionPane.showInputDialog("Enter your name");
//       age = JOptionPane.showInputDialog("Enter your age");
//       String result = "Name: " + name + "\nAge: " + age ;
//       JOptionPane.showMessageDialog(null, result);

        int x, y ;
        int sum ;
        x = Integer.parseInt(JOptionPane.showInputDialog("Enter x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Enter y"));

        sum = x + y;

        JOptionPane.showMessageDialog(null,"x + y = " + sum , "Calculator", JOptionPane.QUESTION_MESSAGE);
    }
}
