package io.github.paulgriffith;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingEventTester extends JFrame {
    public SwingEventTester() {
        super("Key Event Test");
        setPreferredSize(new Dimension(1024, 768));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                textArea.append(e.paramString() + "\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                textArea.append(e.paramString() + "\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                textArea.append(e.paramString() + "\n");
            }
        });

        var clearButton = new JButton();
        clearButton.addActionListener(e -> textArea.setText(null));

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.add(clearButton, BorderLayout.NORTH);
        contentPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(contentPanel);

        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new SwingEventTester().setVisible(true));
    }
}
