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

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new FifteenGame();
    }
}
