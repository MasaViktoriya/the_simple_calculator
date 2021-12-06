package com.geekbrains;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;*/

public class MainWindow extends JFrame {
    public static String parsingString;
    public MainWindow(){
        Calculator calculator = new Calculator();
        setTitle("Простой калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 400, 610, 640);
        setResizable(false);
        setLayout(null);
//не работает ограничение числа строк
        JTextArea calcField = new JTextArea(1, 20);
        calcField.setBounds(25, 30, 540, 170);
        Font font = new Font("Arial", Font.PLAIN, 26);
        calcField.setFont(font);
        Border border = new BasicBorders.FieldBorder(Color.LIGHT_GRAY, Color.DARK_GRAY, Color.LIGHT_GRAY, Color.DARK_GRAY);
        calcField.setBorder(border);
//      calcField.setRows(4); //не работает ограничение числа строк
        calcField.setLineWrap(true);
        calcField.setWrapStyleWord(true);
        calcField.setEditable(false);
        add (calcField);

// почему-то не работает такая проверка количества строк
/*        calcField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                check(calcField);
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                check(calcField);
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                check(calcField);
            }

        });*/


        JTextField resultField = new JTextField("= ", 1);
        resultField.setBounds(40, 140, 510, 50);
        Border border1 = new BasicBorders.FieldBorder(Color.WHITE, Color.LIGHT_GRAY, Color.WHITE, Color.LIGHT_GRAY);
        resultField.setBorder(border1);
        resultField.setEditable(false);
        resultField.setFont(font);
        resultField.setHorizontalAlignment(SwingConstants.RIGHT);
        add(resultField);


        JButton button1 = new JButton("1");
        button1.setBounds(25, 225, 100, 80);
        button1.setFont(font);
        add (button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append("1");

            }
        });
        JButton button2 = new JButton("2");
        button2.setBounds(135, 225, 100, 80);
        button2.setFont(font);
        add (button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append("2");
            }
        });
        JButton button3 = new JButton("3");
        button3.setBounds(245, 225, 100, 80);
        button3.setFont(font);
        add (button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append("3");
            }
        });
        JButton buttonClear = new JButton("C");
        buttonClear.setBounds(395, 225, 80, 80);
        buttonClear.setFont(font);
        add (buttonClear);
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.setText("");
                resultField.setText("= ");
            }
        });
        JButton buttonResult = new JButton("=");
        buttonResult.setBounds(485, 225, 80, 80);
        buttonResult.setFont(font);
        add (buttonResult);
        buttonResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append(" =");
                resultField.setText(calculator.calculate(getString(calcField)));
            }
        });
        JButton button4 = new JButton("4");
        button4.setBounds(25, 315, 100, 80);
        button4.setFont(font);
        add (button4);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append("4");
            }
        });
        JButton button5 = new JButton("5");
        button5.setBounds(135, 315, 100, 80);
        button5.setFont(font);
        add (button5);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append("5");
            }
        });
        JButton button6 = new JButton("6");
        button6.setBounds(245, 315, 100, 80);
        button6.setFont(font);
        add (button6);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append("6");
            }
        });
        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(395, 315, 80, 80);
        buttonPlus.setFont(font);
        add (buttonPlus);
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append(" + ");
            }
        });
        JButton buttonMinus = new JButton("–");
        buttonMinus.setBounds(485, 315, 80, 80);
        buttonMinus.setFont(font);
        add (buttonMinus);
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append(" – ");
            }
        });
        JButton button7 = new JButton("7");
        button7.setBounds(25, 405, 100, 80);
        button7.setFont(font);
        add (button7);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append("7");
            }
        });
        JButton button8 = new JButton("8");
        button8.setBounds(135, 405, 100, 80);
        button8.setFont(font);
        add (button8);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append("8");
            }
        });
        JButton button9 = new JButton("9");
        button9.setBounds(245, 405, 100, 80);
        button9.setFont(font);
        add (button9);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append("9");
            }
        });
        JButton buttonMultiply = new JButton("x");
        buttonMultiply.setBounds(395, 405, 80, 80);
        buttonMultiply.setFont(font);
        add (buttonMultiply);
        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append(" x ");
            }
        });
        JButton buttonDivide = new JButton("/");
        buttonDivide.setBounds(485, 405, 80, 80);
        buttonDivide.setFont(font);
        add (buttonDivide);
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append(" / ");
            }
        });
        JButton buttonMinor = new JButton("– / +");
        buttonMinor.setBounds(25, 495, 100, 80);
        buttonMinor.setFont(font);
        add (buttonMinor);
        buttonMinor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append("-");
            }
        });
        JButton button0 = new JButton("0");
        button0.setBounds(135, 495, 100, 80);
        button0.setFont(font);
        add (button0);
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append("0");
            }
        });
        JButton buttonDot = new JButton(".");
        buttonDot.setBounds(245, 495, 100, 80);
        buttonDot.setFont(font);
        add (buttonDot);
        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append(".");

            }
        });

// Не готова пока добавить в калькулятор приоритет операций со скобками
/*        JButton buttonLeftBracket = new JButton("(");
        buttonLeftBracket.setBounds(395, 495, 80, 80);
        buttonLeftBracket.setFont(font);
        add (buttonLeftBracket);
        buttonLeftBracket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append("(");
            }
        });
        JButton buttonRightBracket = new JButton(")");
        buttonRightBracket.setBounds(485, 495, 80, 80);
        buttonRightBracket.setFont(font);
        add (buttonRightBracket);
        buttonRightBracket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.append(")");
            }
        });*/


        setVisible(true);

    }

    public String getString(JTextArea textArea){
        parsingString  = textArea.getText();
        System.out.println(parsingString);
        return parsingString;
    }
/*    public void check(JTextArea anyText){
        if(anyText.getLineCount()>4){
            JOptionPane.showMessageDialog(null, "Поле ввода заполнено.", "Ошибка!", JOptionPane.ERROR_MESSAGE);
        }
    }*/
}
