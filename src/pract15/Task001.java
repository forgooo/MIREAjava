package pract15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task001 extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;
    private double firstNumber, secondNumber, result;
    private String operator;

    public Task001() {
        setTitle("Калькулятор");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            buttonPanel.add(numberButtons[i]);
        }

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalsButton = new JButton("=");
        clearButton = new JButton("C");

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        equalsButton.addActionListener(this);
        clearButton.addActionListener(this);

        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(equalsButton);
        buttonPanel.add(clearButton);

        add(buttonPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String buttonText = source.getText();

        if (buttonText.matches("[0-9]")) {
            textField.setText(textField.getText() + buttonText);
        } else if (buttonText.equals("+") || buttonText.equals("-") || buttonText.equals("*") || buttonText.equals("/")) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = buttonText;
            textField.setText("");
        } else if (buttonText.equals("=")) {
            if (!textField.getText().isEmpty()) {
                secondNumber = Double.parseDouble(textField.getText());
                switch (operator) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        break;
                    case "/":
                        if (secondNumber != 0) {
                            result = firstNumber / secondNumber;
                        } else {
                            textField.setText("Ошибка");
                            return;
                        }
                        break;
                }
                textField.setText(String.valueOf(result));
            }
        } else if (buttonText.equals("C")) {
            textField.setText("");
            firstNumber = 0;
            secondNumber = 0;
            operator = "";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Task001 calculator = new Task001();
            calculator.setVisible(true);
        });
    }
}

