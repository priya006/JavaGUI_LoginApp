package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//1. Make a frame
//2  Make a panel(Layout)
//3. Make a UserName label
//4. Make a UserName Text field
//5. Make a passwordLabel and password Text field
//6. Add a button named "login"
public class JavaGUILogin implements ActionListener {

    public static void main(String[] args) {

        //Object Creation
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JLabel userLabel = new JLabel("userName");
        JLabel passLabel = new JLabel("password");
        JTextField jTextField = new JTextField(20);
        JPasswordField passwordText = new JPasswordField();
        JButton jButton = new JButton("Login");
        JLabel successLabel = new JLabel("User is logged in successfully");


        //Frame Dimension
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Add a invisible  panel inside the frame/container
        jFrame.add(jPanel);
        jPanel.setLayout(null);


        userLabel.setBounds(10,20,80,25);
        //Add the label to the panel
        jPanel.add(userLabel);

        //Adding text field
        jTextField.setBounds(100,20,165,25);
        jPanel.add(jTextField);

        //Set where the label should appear in the panel
        passLabel.setBounds(10,50,80,25);
        //Add the password label to panel
        jPanel.add(passLabel);

        passwordText.setBounds(100,50,165,25);
        jPanel.add(passwordText);

        //Button
        jButton.setBounds(10,80,80,25);
        jPanel.add(jButton);

        successLabel.setBounds(10,110,300,25);
        jPanel.add(successLabel);

        //Add ActionListner to the button
        jButton.addActionListener(new JavaGUILogin());


        jFrame.setVisible(true);


    }

    //Every time if you click the button this code is run
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hi You clicked the button");

    }
}
