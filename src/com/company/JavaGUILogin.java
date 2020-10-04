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

    private static JFrame jFrame;
    private static JPanel jPanel;
    private static JLabel userLabel;
    private static JLabel passLabel;
    private static JTextField userTextField;
    private static JPasswordField passwordText;
    private static JButton jButton;
    private static JLabel successLabel;
    public static void main(String[] args) {

        //Object Creation
        jFrame = new JFrame();
        jPanel = new JPanel();
        userLabel = new JLabel("userName");
        passLabel = new JLabel("password");
        userTextField = new JTextField(20);
        passwordText = new JPasswordField();
        jButton = new JButton("Login");
        successLabel = new JLabel();


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
        userTextField.setBounds(100,20,165,25);
        jPanel.add(userTextField);

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

        String userName = userTextField.getText();
        String password = passwordText.getText();

        successLabel.setText("Enter credentials");
        if(userName.equals("Priya") && password.equals("Something123#")) {
            successLabel.setText("Login Successful!");
        }
        else {
            successLabel.setText("UserName and Password is not correct :(");
        }
    }
}
