package BtvnjavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EventFrame extends JFrame {
    private int clickCounter = 0;
    private JLabel label;
    private JButton btnIncrease;
    private JButton btnDecrease;

    public EventFrame(String title) {
        super(title);
        this.setSize(300, 300);
        this.setResizable(false);
        JPanel panel = new JPanel();
        label = new JLabel("0");
        btnIncrease = new JButton("Cong");
        btnDecrease = new JButton("Tru");

        panel.setLayout(null);
        label.setBounds(50, 50, 100, 50);
        btnIncrease.setBounds(50, 100, 100, 30);
        btnDecrease.setBounds(160, 100, 100, 30);

        btnIncrease.addActionListener(new IncreaseEventHandler());
        btnDecrease.addActionListener(new DecreaseEventHandler());

        panel.add(label);
        panel.add(btnIncrease);
        panel.add(btnDecrease);

        this.setContentPane(panel);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    class IncreaseEventHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnIncrease) {
                clickCounter++;
                label.setText(" " + clickCounter);
            }
        }
    }

    class DecreaseEventHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnDecrease) {
                clickCounter--;
                label.setText(" " + clickCounter);
            }
        }
    }
}

public class btvn {
    public static void main(String[] args) {
        EventFrame frame = new EventFrame("Swing Event");
        frame.setVisible(true);
    }
}
