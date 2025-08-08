import javax.swing.*;
import java.awt.*;

public class About {
    private JFrame frame;

    public About() {
        frame = new JFrame("About");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600, 800);
        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel("This is the About window", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(label);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new About();
        });
    }
}