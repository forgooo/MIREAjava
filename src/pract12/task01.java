package pract12;
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

class RandomShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random random = new Random();

                for (int i = 0; i < 20; i++) {
                    int x = random.nextInt(getWidth());
                    int y = random.nextInt(getHeight());
                    Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                    int shapeType = random.nextInt(2);

                    if (shapeType == 0) {
                        int radius = random.nextInt(50) + 10;
                        Circle circle = new Circle(randomColor, x, y, radius);
                        circle.draw(g);
                    } else {
                        int width = random.nextInt(100) + 20;
                        int height = random.nextInt(100) + 20;
                        Rectangle rectangle = new Rectangle(randomColor, x, y, width, height);
                        rectangle.draw(g);
                    }
                }
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
