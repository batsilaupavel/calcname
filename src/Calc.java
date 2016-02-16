package com.company.calcnew;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame{

    String operation = "+";
    String x;
    double n;
    double a;
    double b;

    JPanel buttonPanel = new JPanel(new GridLayout(4,1));
    JTextField display = new JTextField("0");
    JButton buttonStart = new JButton("=");
    JButton buttoner1 = new JButton("←");
    JButton buttonC = new JButton("C");
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonsum = new JButton("+");
    JButton buttonmin = new JButton("-");
    JButton buttonumn = new JButton("*");
    JButton buttondel = new JButton("/");
    JButton buttondot = new JButton(".");

    Calc() {

        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("0");
                a = 0;
            }
        });

        buttoner1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = display.getText();
                display.setText(text.substring(0,text.length()-1));
            }
        });

        buttondot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = String.valueOf(display.getText());
                if (text.equals("") || text.equals("0."))
                    display.setText("0");
                display.setText(display.getText() + ".");
            }
        });

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = String.valueOf(display.getText());
                if("=".equals(x))                                   // Условие стирает строку после нажатии = и выведении
                    display.setText("");                            //результата при последующем вводе чисел.
                x = "";
                if (text.equals("0") || text.equals(""))            // Условие стирает строку, если введен 0 и не дает ввести
                    display.setText("");                            // несколько нулей с начала строки.
                display.setText(display.getText() + "0");
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = String.valueOf(display.getText());
                if("=".equals(x))
                    display.setText("");
                x = "";
                if (text.equals("0") || text.equals(""))
                    display.setText("");
                display.setText(display.getText() + "1");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = String.valueOf(display.getText());
                if("=".equals(x))
                    display.setText("");
                x = "";
                if (text.equals("0") || text.equals(""))
                    display.setText("");
                display.setText(display.getText() + "2");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = String.valueOf(display.getText());
                if("=".equals(x))
                    display.setText("");
                x = "";
                if (text.equals("0") || text.equals(""))
                    display.setText("");
                display.setText(display.getText() + "3");
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = String.valueOf(display.getText());
                if("=".equals(x))
                    display.setText("");
                x = "";
                if (text.equals("0") || text.equals(""))
                    display.setText("");
                display.setText(display.getText() + "4");
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = String.valueOf(display.getText());
                if("=".equals(x))
                    display.setText("");
                x = "";
                if (text.equals("0") || text.equals(""))
                    display.setText("");
                display.setText(display.getText() + "5");
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = String.valueOf(display.getText());
                if("=".equals(x))
                    display.setText("");
                x = "";
                if (text.equals("0") || text.equals(""))
                    display.setText("");
                display.setText(display.getText() + "6");
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = String.valueOf(display.getText());
                if("=".equals(x))
                    display.setText("");
                x = "";
                if (text.equals("0") || text.equals(""))
                    display.setText("");
                display.setText(display.getText() + "7");
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = String.valueOf(display.getText());
                if("=".equals(x))
                    display.setText("");
                x = "";
                if (text.equals("0") || text.equals(""))
                    display.setText("");
                display.setText(display.getText() + "8");
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = String.valueOf(display.getText());
                if("=".equals(x))
                    display.setText("");
                x = "";
                if (text.equals("0") || text.equals(""))
                    display.setText("");
                display.setText(display.getText() + "9");
            }
        });


        buttonsum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                n = Double.valueOf(display.getText());
                display.setText("");
                a = a + n;
                operation = "+";

            }
        });

        buttonmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                n = Double.valueOf(display.getText());
                display.setText("");
                a = a + n;
                operation = "-";

            }
        });

        buttonumn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                n = Double.valueOf(display.getText());
                display.setText("");
                a = a + n;
                operation = "*";

            }
        });

        buttondel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                n = Double.valueOf(display.getText());
                display.setText("");
                a = a + n;
                operation = "/";

            }
        });


        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.valueOf(display.getText());
                if("+".equals(operation)){
                    display.setText((a + b)+"");
                }
                if("-".equals(operation)){
                    display.setText((a - b)+"");
                }
                if("*".equals(operation)){
                    display.setText((a * b)+"");
                }
                if("/".equals(operation)){
                    display.setText((a / b)+"");
                }
                a = 0;
                operation = "=";
                x = "=";
            }
        });

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttonC);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttoner1);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(button0);
        buttonPanel.add(buttonsum);
        buttonPanel.add(buttonmin);
        buttonPanel.add(buttonumn);
        buttonPanel.add(buttondel);
        add(display, BorderLayout.NORTH);
        display.setFont(new Font("Serif", Font.ITALIC, 24));
        add(buttonPanel, BorderLayout.CENTER);
        add(buttonStart, BorderLayout.SOUTH);
        add(buttondot, BorderLayout.EAST);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Calc();



    }
}
