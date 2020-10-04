package com.company;

import javax.swing.*;

//1. Make a frame
//2  Make a panel(Layout)
//3. Make a label
//4. Make a Text field
public class JavaGUILogin {

    public static void main(String[] args) {

        //Object Creation
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("userName");
        JTextField jTextField = new JTextField();


        //Frame Dimension
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Add a invisible  panel inside the frame/container
        jFrame.add(jPanel);
        jPanel.setLayout(null);


        jLabel.setBounds(10,20,80,25);
        //Add the label to the panel
        jPanel.add(jLabel);

        //Adding text field
        jTextField.setBounds(100,20,165,25);
        jPanel.add(jTextField);



        jFrame.setVisible(true);
    }
}
