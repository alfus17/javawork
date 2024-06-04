package _01_Move;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Move extends JPanel implements ActionListener {
    private int x = 0;
    private int y = 0;
    private Timer timer;

    public Move() {
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GREEN);
        g2d.fillOval(x, y, 50, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += 1;
        y += 1;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Desktop Plant");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Move());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}



