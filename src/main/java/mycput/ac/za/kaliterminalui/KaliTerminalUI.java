/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mycput.ac.za.kaliterminalui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class KaliTerminalUI extends JFrame {
    private JTextPane terminalOutput;
    private JTextField commandInput;
    private StyledDocument doc;

    public KaliTerminalUI() {
        setTitle("kali@kali: ~");
        setSize(900, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Load the background image
        ImageIcon backgroundImage = new ImageIcon("kali_terminal_bg.jpg"); // Rename your image file
        JLabel background = new JLabel(backgroundImage);
        background.setLayout(new BorderLayout());

        // TextPane for terminal output (with styles)
        terminalOutput = new JTextPane();
        terminalOutput.setEditable(false);
        terminalOutput.setOpaque(false);
        terminalOutput.setFont(new Font("Monospaced", Font.PLAIN, 14));
        terminalOutput.setForeground(Color.GREEN);
        doc = terminalOutput.getStyledDocument();
        JScrollPane scrollPane = new JScrollPane(terminalOutput);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);

        // Input field
        commandInput = new JTextField();
        commandInput.setBackground(new Color(0, 0, 0, 180));
        commandInput.setForeground(Color.GREEN);
        commandInput.setCaretColor(Color.GREEN);
        commandInput.setFont(new Font("Monospaced", Font.PLAIN, 14));
        commandInput.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Handle commands
        commandInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = commandInput.getText();
                printPrompt(command);
                commandInput.setText("");
            }
        });

        background.add(scrollPane, BorderLayout.CENTER);
        background.add(commandInput, BorderLayout.SOUTH);

        setContentPane(background);
    }

    private void printPrompt(String command) {
        appendStyledText("(kali", Color.CYAN);
        appendStyledText("@", Color.LIGHT_GRAY);
        appendStyledText("kali)-", Color.CYAN);
        appendStyledText("[~] ", new Color(128, 255, 128));
        appendStyledText("$ " + command + "\n", Color.GREEN);
    }

    private void appendStyledText(String text, Color color) {
        SimpleAttributeSet style = new SimpleAttributeSet();
        StyleConstants.setForeground(style, color);
        try {
            doc.insertString(doc.getLength(), text, style);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KaliTerminalUI terminal = new KaliTerminalUI();
            terminal.setVisible(true);
        });
    }
}

