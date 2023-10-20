package pract5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task004 extends JFrame {
    private int currentFrame = 0;
    private ImageIcon[] frames;
    private JLabel animationLabel;

    public Task004() {
        setTitle("Animation Example");
        setSize(1200, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frames = new ImageIcon[8];
        for (int i = 0; i < frames.length; i++) {
            frames[i] = new ImageIcon("C:\\Users\\wertex\\Desktop\\others\\shaylushay\\" + (i+1) + ".jpg"); // Замените на пути к вашим изображениям
        }

        animationLabel = new JLabel();
        add(animationLabel);

        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                animationLabel.setIcon(frames[currentFrame]);
            }
        });
        timer.start();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Task004();
            }
        });
    }
}
