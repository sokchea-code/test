package helloworld;

import javax.swing.*;

public class homework2 {
    public static void main(String[] args) {
        float score1 ;
        float score2 ;
        float score3 ;
        float score4 ;
        float score5 ;
        score1 = Integer.parseInt(JOptionPane.showInputDialog("Enter score 1: "));
        score2 = Integer.parseInt(JOptionPane.showInputDialog("Enter score 2: "));
        score3 = Integer.parseInt(JOptionPane.showInputDialog("Enter score 3: "));
        score4 = Integer.parseInt(JOptionPane.showInputDialog("Enter score 4: "));
        score5 = Integer.parseInt(JOptionPane.showInputDialog("Enter score 5: "));
        float totalScore = score1 + score2 + score3 + score4 + score5 ;
        float averageScore = totalScore / 5;
        System.out.println("Total score: " + totalScore);
        JOptionPane.showMessageDialog(null, "Total score: " + totalScore + "\nAverage score: " + averageScore);
    }
}
