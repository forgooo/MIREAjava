package pract12;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class DisplayImage {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java DisplayImage <imagePath>");
            return;
        }

        String imagePath = args[0];

        // Load the image
        BufferedImage image = loadImage(imagePath);

        if (image != null) {
            // Create a JFrame to display the image
            JFrame frame = new JFrame("Image Display");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a JPanel to hold the image
            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(image, 0, 0, this);
                }
            };

            frame.add(panel);
            frame.setSize(image.getWidth(), image.getHeight());
            frame.setVisible(true);
        } else {
            System.out.println("Failed to load the image.");
        }
    }

    private static BufferedImage loadImage(String imagePath) {
        try {
            File file = new File(imagePath);
            return ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
