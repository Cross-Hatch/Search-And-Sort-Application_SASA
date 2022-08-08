package com.src.SASA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static JFrame frame;
    private static JLabel chooseInfo;
    private static JLabel choose_number;

    private static JLabel Found_number;
    private static JLabel NotFound_number;

    private static JButton LinearB;

    private static JButton BinaryB;

    private static JButton Submit;

    private static JPanel panel;

    private static JTextField user_number;

    public Main() {
        //constructor
    }

    public static void main(String[] args) {

        frame = new JFrame();
        panel = new JPanel();

        chooseInfo = new JLabel("Choose a button to perform an operation");

        LinearB = new JButton("Linear search");
        LinearB.setBounds(10, 20, 80, 25);

        BinaryB = new JButton("Binary search");
        BinaryB.setBounds(10, 20, 80, 25);


        panel.add(chooseInfo);
        panel.add(LinearB);
        panel.add(BinaryB);

        LinearB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choose_number = new JLabel("Input a Number:");
                user_number = new JTextField();

                Submit = new JButton("Submit");

                Submit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int user_num = Integer.parseInt(user_number.getText());

                        int array[] = {10, 20, 25, 63, 96, 57};
                        int size = array.length;

                        for (int i=0 ;i< size-1; i++){
                            if(array[i]== user_num){
                                Found_number = new JLabel(user_num + " is at index "+ i +" of the Array : {10, 20, 25, 63, 96, 57}");
                                panel.add(Found_number);
                            }else {
                                NotFound_number = new JLabel(user_num + " is not at index "+ i +" of the Array : {10, 20, 25, 63, 96, 57}");
                                panel.add(NotFound_number);

                            }}
                    }
                });





                panel.add(choose_number);
                panel.add(user_number);
                panel.add(Submit);

            }
        });

        panel.setBorder(BorderFactory.createEmptyBorder(50,50,20,20));
        panel.setLayout(new GridLayout(0,1));
        frame.add(panel,BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SASA");
        frame.pack();
        frame.setVisible(true);

    }
}
