package main.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewSetup{
    private JFrame frame; 
    private JLabel idLabel;
    private JLabel pwLabel; 

    private static final int ID_LENGTH = 6;
    private static final int PW_LENGTH = 8;

    public void InitialSetup() {
        frame = new JFrame("Library GUI"); //Can add a graphics configuration

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300); //frame size 

        idLabel = new JLabel("ID:");
        pwLabel = new JLabel("Password:");

        JTextField idEntryField = new JTextField(ID_LENGTH); //set id length later
        JTextField pwEntryField = new JTextField(PW_LENGTH);

        JButton enterButton = new JButton("Enter");
        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = idEntryField.getText();
                String pw = pwEntryField.getText();
                //Check string cannot be used for sql injection or anything
                //Check against database
            }
        });
        frame.add(idLabel);
        frame.add(pwLabel);
        frame.add(idEntryField);
        frame.add(pwEntryField);
        frame.add(enterButton);
        frame.setVisible(true); 


    }

}
