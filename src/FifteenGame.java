import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;

public class FifteenGame extends JFrame implements ActionListener {

    Panel P = new Panel();
    Panel P2 = new Panel();
    Panel P3 = new Panel();

    JButton button1 = new JButton("Start/Restart");
    JButton button2 = new JButton("Exit");
    JButton button3 = new JButton("CLICKA INTE");
    JButton button4 = new JButton("");

    ArrayList<JButton> buttons;

    public FifteenGame() {
        buttons = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(this);
            buttons.add(button);
            P2.add(button);
        }
        setTitle("Fifteen Game");

        this.add(P);
        P.setLayout(new BorderLayout());
        P.add(P2, BorderLayout.CENTER);
        P.add(P3, BorderLayout.SOUTH);
        P2.setLayout(new GridLayout(4, 4));
        P3.setLayout(new FlowLayout());

        P3.add(button1);
        P3.add(button2);
        P3.add(button3);

        button4.setEnabled(false);
        buttons.add(button4);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button1.addActionListener(e -> newGame());
        button2.addActionListener(e -> exit());
        button3.addActionListener(e -> fusk());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new FifteenGame();
    }
}
