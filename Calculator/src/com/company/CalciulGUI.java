package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalciulGUI extends JFrame {

    JButton button = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPlus = new JButton("+");
    JButton buttonMin = new JButton("-");
    JButton buttonMult = new JButton("*");
    JButton buttonDiv = new JButton("/");
    JButton buttonRes = new JButton("=");
    JButton buttonDot = new JButton(".");
    JButton buttonC = new JButton("C");
    JLabel label = new JLabel("");

    public CalciulGUI() {
        super("Calculator");
        this.setBounds(100, 100, 450, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5, 5, 1, 1));

        container.add(button7);
        container.add(button8);
        container.add(button9);
        container.add(buttonPlus);
        container.add(button4);
        container.add(button5);
        container.add(button6);
        container.add(buttonMin);
        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.add(buttonMult);
        container.add(button);
        container.add(buttonDot);
        container.add(buttonRes);
        container.add(buttonDiv);
        container.add(buttonC);
        this.add(label);

        buttonRes.addActionListener(new ResultEventListener());
        button.addActionListener(new InputActionListener());
        button1.addActionListener(new InputActionListener());
        button2.addActionListener(new InputActionListener());
        button3.addActionListener(new InputActionListener());
        button4.addActionListener(new InputActionListener());
        button5.addActionListener(new InputActionListener());
        button6.addActionListener(new InputActionListener());
        button7.addActionListener(new InputActionListener());
        button8.addActionListener(new InputActionListener());
        button9.addActionListener(new InputActionListener());
        buttonPlus.addActionListener(new InputActionListener());
        buttonMin.addActionListener(new InputActionListener());
        buttonMult.addActionListener(new InputActionListener());
        buttonDiv.addActionListener(new InputActionListener());
        buttonDot.addActionListener(new InputActionListener());
        buttonC.addActionListener(new ClearActionListener());
        setVisible(true);
    }

    class ResultEventListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String string = Operatoins.calculate(label.getText());
            label.setText(string);
        }

    }

    class ClearActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("");
        }
    }

    class InputActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String string = label.getText() + ((JButton) event.getSource()).getText();
            label.setText(string);
        }
    }
}
