package pract12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

class ImageLister {
    private JFrame frame;
    private JPanel imagePanel;
    private ArrayList<Image> images = new ArrayList<>();
    private int currentImageIndex = 0;
    private JLabel imageLabel;

    public ImageLister(String folderPath) {
        frame = new JFrame("Image Lister");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        imagePanel = new JPanel(new BorderLayout());
        frame.add(imagePanel, BorderLayout.CENTER);

        listImagesInFolder(folderPath);
        setupImageLabel();
    }

    private void listImagesInFolder(String folderPath) {
        File folder = new File(folderPath);
        File[] imageFiles = folder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                String extension = name.substring(name.lastIndexOf(".") + 1);
                return extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("jpeg") ||
                        extension.equalsIgnoreCase("png") || extension.equalsIgnoreCase("gif");
            }
        });

        if (imageFiles != null) {
            for (File imageFile : imageFiles) {
                try {
                    images.add(ImageIO.read(imageFile));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void setupImageLabel() {
        imageLabel = new JLabel();
        imagePanel.add(imageLabel, BorderLayout.CENTER);
        showCurrentImage();
        setupKeyboardShortcuts();
    }

    private void showCurrentImage() {
        Image currentImage = images.get(currentImageIndex);
        imageLabel.setIcon(new ImageIcon(currentImage));
        frame.pack(); // Adjust window size based on the image
    }

    private void setupKeyboardShortcuts() {
        InputMap inputMap = imagePanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = imagePanel.getActionMap();

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "previousImage");
        actionMap.put("previousImage", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                previousImage();
            }
        });

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "nextImage");
        actionMap.put("nextImage", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextImage();
            }
        });
    }

    private void previousImage() {
        if (currentImageIndex > 0) {
            currentImageIndex--;
            showCurrentImage();
        }
    }

    private void nextImage() {
        if (currentImageIndex < images.size() - 1) {
            currentImageIndex++;
            showCurrentImage();
        }
    }

    public void displayWindow() {
        frame.pack(); // Initialize the window size based on the first image
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ImageLister <folderPath>");
            return;
        }

        SwingUtilities.invokeLater(() -> {
            ImageLister imageLister = new ImageLister(args[0]);
            imageLister.displayWindow();
        });
    }
}
