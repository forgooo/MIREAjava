package pract5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}

public class Task002 extends JFrame {
    private final int WIDTH = 800;
    private final int HEIGHT = 600;

    public Task002() {
        setTitle("Random Shapes");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int shapeType = random.nextInt(2); // 0 - прямоугольник, 1 - круг
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            Color color = new Color(red, green, blue);

            Shape shape;
            if (shapeType == 0) {
                int width = random.nextInt(100) + 20;
                int height = random.nextInt(100) + 20;
                shape = new Rectangle(color, x, y, width, height);
            } else {
                int radius = random.nextInt(50) + 20;
                shape = new Circle(color, x, y, radius);
            }

            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Task002();
            }
        });
    }
}
