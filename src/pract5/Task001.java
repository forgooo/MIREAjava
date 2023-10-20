package pract5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task001 extends JFrame implements ActionListener {
    private int milanScore = 0;
    private int madridScore = 0;
    private JLabel scoreLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public Task001() {
        setTitle("Football Match");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        scoreLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener(this);
        madridButton.addActionListener(this);

        panel.add(milanButton);
        panel.add(madridButton);
        panel.add(scoreLabel);
        panel.add(lastScorerLabel);
        panel.add(winnerLabel);

        add(panel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("AC Milan")) {
            milanScore++;
            lastScorerLabel.setText("Last Scorer: AC Milan");
        } else if (e.getActionCommand().equals("Real Madrid")) {
            madridScore++;
            lastScorerLabel.setText("Last Scorer: Real Madrid");
        }

        scoreLabel.setText("Result: " + milanScore + " X " + madridScore);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Task001();
            }
        });
    }
}

