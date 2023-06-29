package main.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewSetup implements ActionListener{
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
        enterButton.addActionListener(this);

        frame.add(idLabel);
        frame.add(pwLabel);
        frame.add(idEntryField);
        frame.add(pwEntryField);
        frame.add(enterButton);
        frame.setVisible(true); 
    }

    public void actionPerformed(ActionEvent e) {
        //Save text fields and check if a valid user
        String id = idLabel.getText();
        String pw = pwLabel.getText();

        /*if(UserController.isValidUser()) {
            //Check if valid user, if valid move onto menu
        }
        else {
            //Notify that this is not a valid user password combination
            //Use a joptionpane for this
        }        
        */
    }

}
