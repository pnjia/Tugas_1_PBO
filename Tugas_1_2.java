package Tugas_1;

import javax.swing.JOptionPane;

public class Tugas_1_2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Anda sedang belajar apa?", "Input",
                JOptionPane.QUESTION_MESSAGE);

        if (input != null && !input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Belajar " + input + " sangat mudah", "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
