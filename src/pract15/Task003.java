package pract15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task003 extends JFrame {
    private JTextArea textArea;

    public Task003() {
        setTitle("Программа с меню");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Файл");
        JMenuItem saveMenuItem = new JMenuItem("Сохранить");
        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Логика сохранения
            }
        });
        JMenuItem exitMenuItem = new JMenuItem("Выйти");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);

        JMenu editMenu = new JMenu("Правка");
        JMenuItem copyMenuItem = new JMenuItem("Копировать");
        JMenuItem cutMenuItem = new JMenuItem("Вырезать");
        JMenuItem pasteMenuItem = new JMenuItem("Вставить");
        editMenu.add(copyMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(pasteMenuItem);

        JMenu helpMenu = new JMenu("Справка");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        JPanel buttonPanel = new JPanel();
        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Task003 app = new Task003();
            app.setVisible(true);
        });
    }
}

