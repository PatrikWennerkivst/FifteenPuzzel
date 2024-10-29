import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FifteenPuzzle extends JFrame implements ActionListener {
    private ArrayList<JButton> buttons = new ArrayList<>();
    private int emptyIndex = 15;

    public FifteenPuzzle() {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        add(p);
        JPanel panel = new JPanel(new GridLayout(4, 4));
        buttons = new ArrayList<>();

        // Skapa knappar och lägg till i panelen
        for (int i = 1; i <= 15; i++) {
            JButton button = new JButton(String.valueOf(i));
            buttons.add(button);
            panel.add(button);
            button.addActionListener(this);
        }

        // Lägg till den tomma knappen
        JButton emptyButton = new JButton("");
        buttons.add(emptyButton);
        panel.add(emptyButton);
        emptyIndex = 15;
        emptyButton.addActionListener(this);
        // Lägg till panel och knapp för nytt spel
        add(panel, BorderLayout.CENTER);
        JButton randomButton = new JButton("New Game"); // byter namn på knappen
        add(randomButton, BorderLayout.SOUTH);
        setTitle("15-Puzzle");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
