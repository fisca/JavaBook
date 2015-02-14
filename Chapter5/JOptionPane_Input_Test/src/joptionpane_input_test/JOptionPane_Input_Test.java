package joptionpane_input_test;

import javax.swing.JOptionPane;

public class JOptionPane_Input_Test {

    public static void main(String[] args) {
        String name;
        String errorMessage;
        String infoMessage;
        String plainMessage;
        String questionMessage;
        String warningMessage;
        name = JOptionPane.showInputDialog("What's your name?");
        errorMessage = JOptionPane.showInputDialog(
                null, "Hey " + name + ", do you have the error?\n" + "Please input the error.",
                "^-^- Error Message -^-^", JOptionPane.ERROR_MESSAGE
        );
        infoMessage = JOptionPane.showInputDialog(
                null, "Please input the infomation.",
                "^-^- Information Message -^-^", JOptionPane.INFORMATION_MESSAGE
        );
        plainMessage = JOptionPane.showInputDialog(
                null, "Please input the plain message.",
                "^-^- Plain Message -^-^", JOptionPane.PLAIN_MESSAGE
        );
        questionMessage = JOptionPane.showInputDialog(
                null, "Input your question.",
                "^-^- Question Message -^-^", JOptionPane.QUESTION_MESSAGE
        );
        warningMessage = JOptionPane.showInputDialog(
                null, "Warning!\n What you think?",
                "^-^- Warning Message -^-^", JOptionPane.WARNING_MESSAGE
        );
        System.out.println(" Your name is " + name);
        System.out.println(" The error is " + errorMessage);
        System.out.println(" The information is " + infoMessage);
        System.out.println(" The plain message is " + plainMessage);
        System.out.println(" Your question is " + questionMessage);
        System.out.println(" Warning message is " + warningMessage);
    }

}
