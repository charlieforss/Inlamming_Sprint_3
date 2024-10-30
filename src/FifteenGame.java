import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;

public class FifteenGame extends JFrame implements ActionListener {

    Panel p = new Panel();
    Panel p2 = new Panel();
    Panel p3 = new Panel();

    JButton button2 = new JButton("Start/Restart");
    JButton button3 = new JButton("Exit");
    JButton button4 = new JButton("CLICKA INTE");
    JButton button5 = new JButton("");
    ArrayList<JButton> buttons;

    public FifteenGame() {
        buttons = new ArrayList<>();

        for (int i = 1; i <= 15; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(this);
            buttons.add(button);
            p2.add(button);
        }

        setTitle("Test");
        this.add(p);
        p.setLayout(new BorderLayout());
        p.add(p2, BorderLayout.CENTER);
        p.add(p3, BorderLayout.SOUTH);
        p2.setLayout(new GridLayout(4, 4));
        p3.setLayout(new FlowLayout());




    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public void main(String[] args) {
        new FifteenGame();
    }
}
