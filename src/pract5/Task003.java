package pract5;

import javax.swing.*;
import java.awt.*;

public class Task003 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Image Display");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ImageIcon icon = new ImageIcon("C:\\Users\\wertex\\Desktop\\others\\u2.jpeg");
            JLabel label = new JLabel(icon);
            frame.getContentPane().add(label, BorderLayout.CENTER);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
