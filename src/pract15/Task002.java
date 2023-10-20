package pract15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task002 extends JFrame {
    private JComboBox<String> menuComboBox;
    private JLabel resultLabel;

    public Task002() {
        setTitle("Выбор меню");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] menuItems = {"Пункт 1", "Пункт 2", "Пункт 3", "Пункт 4", "Пункт 5"};
        menuComboBox = new JComboBox<>(menuItems);
        menuComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedMenu = (String) menuComboBox.getSelectedItem();
                resultLabel.setText("Вы выбрали: " + selectedMenu);
            }
        });

        resultLabel = new JLabel("Выберите пункт меню");

        add(menuComboBox);
        add(resultLabel);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Task002 app = new Task002();
            app.setVisible(true);
        });
    }
}
