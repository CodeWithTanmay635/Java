
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class AnimeFace extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int cx = getWidth() / 2;
        int cy = getHeight() / 2;

        // Face shape
        g2.setColor(new Color(255, 229, 204));
        g2.fill(new Ellipse2D.Double(cx - 140, cy - 120, 280, 240));

        // Hair (simple bangs + sides)
        g2.setColor(new Color(60, 50, 90));
        g2.fill(new Arc2D.Double(cx - 160, cy - 170, 320, 220, 0, 180, Arc2D.PIE));
        g2.fill(new RoundRectangle2D.Double(cx - 170, cy - 40, 60, 140, 40, 40));
        g2.fill(new RoundRectangle2D.Double(cx + 110, cy - 40, 60, 140, 40, 40));

        // Eyes (big anime eyes)
        int eyeY = cy - 20;
        drawEye(g2, cx - 70, eyeY, 60, 40, new Color(70, 140, 255));
        drawEye(g2, cx + 70, eyeY, 60, 40, new Color(70, 140, 255));

        // Nose (tiny line)
        g2.setStroke(new BasicStroke(2f));
        g2.setColor(new Color(180, 130, 110));
        g2.drawLine(cx, cy - 5, cx - 6, cy + 5);

        // Mouth (soft smile)
        g2.setColor(new Color(180, 80, 90));
        g2.draw(new QuadCurve2D.Double(cx - 30, cy + 35, cx, cy + 55, cx + 30, cy + 35));

        // Blush
        g2.setColor(new Color(255, 160, 170, 120));
        g2.fill(new Ellipse2D.Double(cx - 120, cy + 20, 40, 18));
        g2.fill(new Ellipse2D.Double(cx + 80, cy + 20, 40, 18));

        g2.dispose();
    }

    private void drawEye(Graphics2D g2, int x, int y, int w, int h, Color iris) {
        // White
        g2.setColor(Color.WHITE);
        g2.fill(new Ellipse2D.Double(x - w / 2.0, y - h / 2.0, w, h));

        // Iris
        g2.setColor(iris);
        g2.fill(new Ellipse2D.Double(x - w * 0.22, y - h * 0.22, w * 0.44, h * 0.44));

        // Pupil
        g2.setColor(Color.BLACK);
        g2.fill(new Ellipse2D.Double(x - w * 0.10, y - h * 0.10, w * 0.20, h * 0.20));

        // Highlights
        g2.setColor(new Color(255, 255, 255, 230));
        g2.fill(new Ellipse2D.Double(x - w * 0.06, y - h * 0.14, w * 0.12, h * 0.12));
        g2.fill(new Ellipse2D.Double(x + w * 0.02, y + h * 0.00, w * 0.06, h * 0.06));

        // Lashes (top)
        g2.setStroke(new BasicStroke(4f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2.setColor(Color.BLACK);
        g2.draw(new QuadCurve2D.Double(x - w * 0.5, y - h * 0.4, x, y - h * 0.55, x + w * 0.5, y - h * 0.4));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame("Anime Character (Java2D)");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(520, 540);
            f.setLocationRelativeTo(null);
            f.setContentPane(new AnimeFace());
            f.setVisible(true);
        });
    }
}
